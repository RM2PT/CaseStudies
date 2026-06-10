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
public class ManageUserCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createUser(int userid,String name,String address) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == true)
		{
			User use = new User();
			use.setUserID(userid);
			use.setName(name);
			use.setAddress(address);
			DM.getUserDao().save(use);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public User queryUser(int userid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyUser(int userid,String name,String address) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			user.setUserID(userid);
			user.setName(name);
			user.setAddress(address);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteUser(int userid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == false && user!= null)
		{
			DM.getUserDao().delete(user);
			return true;
			
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
