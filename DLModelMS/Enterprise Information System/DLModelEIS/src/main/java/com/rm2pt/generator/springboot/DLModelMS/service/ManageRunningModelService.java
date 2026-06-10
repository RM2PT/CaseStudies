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
public class ManageRunningModelService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean modifyRunningModel(String runningModelId,String assignedResource,String api) throws PreconditionException{
		RunningModel a = (RunningModel)GetData(DM.getRunningModelDao().findById(runningModelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			a.setId(runningModelId);
			a.setAssignedResource(assignedResource);
			a.setAPI(api);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyKey(String keyId,Boolean isValid) throws PreconditionException{
		Mykey key = (Mykey)GetData(DM.getMykeyDao().findById(keyId));
		
		if(StandardOPs.oclIsUndefined(key) == false)
		{
			key.setId(keyId);
			key.setIsValid(isValid);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
