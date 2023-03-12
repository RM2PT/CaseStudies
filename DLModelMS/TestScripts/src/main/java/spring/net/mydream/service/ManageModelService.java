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
public class ManageModelService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean modifyModel(int modelId,String version,String location) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			a.setId(modelId);
			a.setVersion(version);
			a.setLocation(location);
			DM.getModelDao().save(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean downModel(int modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<OnlineModel> listOnlineModel(int modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a.getContainedOnlineModel();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Administrator> listAllAdministrator(int modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a.getContainedAdministrator();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<DataSet> listAllDataSet(int modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a.getContainedDataSet();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<ModelAccessLink> listAllAccess(int modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a.getContainedModelAccessLink();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Model serchModel(int modelId) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a;
			
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
