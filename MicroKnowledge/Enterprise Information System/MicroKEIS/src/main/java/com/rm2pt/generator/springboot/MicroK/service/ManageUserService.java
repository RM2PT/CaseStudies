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
public class ManageUserService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createUser(String id,String password,String name) throws PreconditionException{
		User up = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(up) == true)
		{
			User user = new User();
			user.setId(id);
			user.setPassword(password);
			user.setName(name);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
