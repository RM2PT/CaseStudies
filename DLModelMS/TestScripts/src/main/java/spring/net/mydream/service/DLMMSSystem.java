package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Transactional
@Service
public class DLMMSSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean uploadModel(int modelId,String version,String location) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == true)
		{
			Model e = new Model();
			e.setId(modelId);
			e.setVersion(version);
			e.setLocation(location);
			DM.getModelDao().save(e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteModel(Integer modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false && a!= null)
		{
			for(OnlineModel e : a.getContainedOnlineModel()){
				DM.getOnlineModelDao().delete(e);
			
			}for(DataSet e : a.getContainedDataSet()){
				DM.getDataSetDao().delete(e);
			
			}for(ModelAccessLink e : a.getContainedModelAccessLink()){
				DM.getModelAccessLinkDao().delete(e);
			
			}DM.getModelDao().delete(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}

	public Model visitModel(String symbol) throws PreconditionException{
		ModelAccessLink access = DM.getModelAccessLinkDao().findBySymbol(symbol);
		
		if(StandardOPs.oclIsUndefined(access) == false && access.getCurrentVisitNumber() < access.getMaximumVisitNumber())
		{
			return access.getBelongedModel();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public OnlineModel visitOnlineModel(String token) throws PreconditionException{
		API a = DM.getAPIDao().findByToken(token);
		
		if(StandardOPs.oclIsUndefined(a) == false && a.getIsValid() == true)
		{
			return a.getBelongedOnlineModel();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
