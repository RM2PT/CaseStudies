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
public class ManageAPIService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createAPI(String token) throws PreconditionException{
		API a = DM.getAPIDao().findByToken(token);
		
		if(StandardOPs.oclIsUndefined(a) == true)
		{
			API e = new API();
			e.setToken(token);
			e.setIsValid(true);
			DM.getAPIDao().save(e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteAPI(String token) throws PreconditionException{
		API a = DM.getAPIDao().findByToken(token);
		
		if(StandardOPs.oclIsUndefined(a) == false && a!= null)
		{
			DM.getAPIDao().delete(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyAPI(String token,Boolean isValid) throws PreconditionException{
		API a = DM.getAPIDao().findByToken(token);
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			a.setToken(token);
			a.setIsValid(isValid);
			DM.getAPIDao().save(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public API queryAPI(String token) throws PreconditionException{
		API a = DM.getAPIDao().findByToken(token);
		
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
