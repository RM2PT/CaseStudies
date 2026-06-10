package com.rm2pt.generator.springboot.DLModelMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;
import com.rm2pt.generator.springboot.DLModelMS.utils.DaoManage;
import com.rm2pt.generator.springboot.DLModelMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.DLModelMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.DLModelMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.DLModelMS.redis.CurrentUtils;

@Transactional
@Service
public class DeployModelService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean deployModel(String runningModelId,String assignedResource,String api) throws PreconditionException{
		Model CurrentModel=(Model)currentUtils.getAttribute("CurrentModel");
		RunningModel CurrentRunningModel=(RunningModel)currentUtils.getAttribute("CurrentRunningModel");
		RunningModel a = (RunningModel)GetData(DM.getRunningModelDao().findById(runningModelId));
		
		if(StandardOPs.oclIsUndefined(CurrentModel) == false && StandardOPs.oclIsUndefined(a) == true)
		{
			RunningModel b = new RunningModel();
			b.setId(runningModelId);
			b.setAssignedResource(assignedResource);
			b.setAPI(api);
			DM.getRunningModelDao().save(b);
			b.setBelongedModel(CurrentModel);
			CurrentModel.getContainedRunningModel().add(b);
			currentUtils.setAttribute("CurrentRunningModel" , b);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createKey(String keyId) throws PreconditionException{
		RunningModel CurrentRunningModel=(RunningModel)currentUtils.getAttribute("CurrentRunningModel");
		Mykey key = (Mykey)GetData(DM.getMykeyDao().findById(keyId));
		
		if(StandardOPs.oclIsUndefined(key) == true)
		{
			Mykey b = new Mykey();
			b.setId(keyId);
			b.setIsValid(true);
			DM.getMykeyDao().save(b);
			b.setBelongedRunningModel(CurrentRunningModel);
			CurrentRunningModel.getContainedKey().add(b);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
