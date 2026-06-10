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
public class DLModelMS1System{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public String callModel(String keyId) throws PreconditionException{
		Mykey key = (Mykey)GetData(DM.getMykeyDao().findById(keyId));
		
		if(StandardOPs.oclIsUndefined(key) == false && key.getIsValid() == true)
		{
			return key.getBelongedRunningModel().getAPI();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Model viewModel(String modelId) throws PreconditionException{
		Model CurrentModel=(Model)currentUtils.getAttribute("CurrentModel");
		Model a = (Model)GetData(DM.getModelDao().findById(modelId));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			currentUtils.setAttribute("CurrentModel" , a);
			return a;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
