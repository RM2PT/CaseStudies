package com.rm2pt.generator.springboot.MicroK.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.MicroK.entity.*;
import com.rm2pt.generator.springboot.MicroK.utils.DaoManage;
import com.rm2pt.generator.springboot.MicroK.utils.PreconditionException;
import com.rm2pt.generator.springboot.MicroK.utils.ServiceManage;
import com.rm2pt.generator.springboot.MicroK.utils.StandardOPs;
import com.rm2pt.generator.springboot.MicroK.redis.CurrentUtils;

@Transactional
@Service
public class ManageMicroknowledgeService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createMicroknowledge(String id,String keywords,String content) throws PreconditionException{
		User CurrentUser=(User)currentUtils.getAttribute("CurrentUser");
		Microknowledge microknowledge = (Microknowledge)GetData(DM.getMicroknowledgeDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(microknowledge) == true)
		{
			Microknowledge mk = new Microknowledge();
			mk.setId(id);
			mk.setKeywords(keywords);
			mk.setContent(content);
			mk.setStarNumber(0);
			mk.setLastEditTime(new Date());
			CurrentUser.getContainedMicroknowledge().add(mk);
			mk.setBelongedUser(CurrentUser);
			DM.getMicroknowledgeDao().save(mk);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
			
	// public Boolean modifyMicroknowledge(String id,String keywords,String content) throws PreconditionException
	
				

	public static Object GetData(Object op) {
		return op;
	}
}
