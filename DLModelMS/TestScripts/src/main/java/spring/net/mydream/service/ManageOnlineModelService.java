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
public class ManageOnlineModelService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean deployOnlineModel(int modelId,int onlineModelId,String assignedResource) throws PreconditionException{
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		OnlineModel olModel = (OnlineModel)GetData(DM.getOnlineModelDao().findById(onlineModelId));
		
		if(StandardOPs.oclIsUndefined(a) == false && StandardOPs.oclIsUndefined(olModel) == true)
		{
			OnlineModel e = new OnlineModel();
			e.setId(onlineModelId);
			e.setAssignedResource(assignedResource);
			DM.getOnlineModelDao().save(e);
			a.getContainedOnlineModel().add(e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public OnlineModel queryOnlineModel(int onlineModelId) throws PreconditionException{
		OnlineModel olModel = (OnlineModel)GetData(DM.getOnlineModelDao().findById(onlineModelId));
		
		if(StandardOPs.oclIsUndefined(olModel) == false)
		{
			return olModel;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean stopOnlineModel(int onlineModelId) throws PreconditionException{
		OnlineModel olModel = (OnlineModel)GetData(DM.getOnlineModelDao().findById(onlineModelId));
		
		if(StandardOPs.oclIsUndefined(olModel) == false && olModel!= null)
		{
			for(API api : olModel.getContainedAPI()){
				DM.getAPIDao().delete(api);
			
			}DM.getOnlineModelDao().delete(olModel);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<API> listAllAPI(int onlineModelId) throws PreconditionException{
		OnlineModel olModel = (OnlineModel)GetData(DM.getOnlineModelDao().findById(onlineModelId));
		
		if(StandardOPs.oclIsUndefined(olModel) == false)
		{
			return olModel.getContainedAPI();
			
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
