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
public class ManageSubjectCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createSubject(String name) throws PreconditionException{
		Subject subject = DM.getSubjectDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(subject) == true)
		{
			Subject sub = new Subject();
			sub.setName(name);
			DM.getSubjectDao().save(sub);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Subject querySubject(String name) throws PreconditionException{
		Subject subject = DM.getSubjectDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(subject) == false)
		{
			return subject;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifySubject(String name) throws PreconditionException{
		Subject subject = DM.getSubjectDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(subject) == false)
		{
			subject.setName(name);
			DM.getSubjectDao().save(subject);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteSubject(String name) throws PreconditionException{
		Subject subject = DM.getSubjectDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(subject) == false && subject!= null)
		{
			DM.getSubjectDao().delete(subject);
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
