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

	public Boolean createStudent(String userID,String name,Integer sex,String password,String email,String faculty,String major,Integer programme,Integer registrationStatus) throws PreconditionException{
		Student user = DM.getStudentDao().findByUserID(userID);
		
		if(StandardOPs.oclIsUndefined(user) == true)
		{
			Student u = new Student();
			u.setUserID(userID);
			u.setName(name);
			u.setEmail(email);
			u.setPassword(password);
			u.setSex(sex);
			u.setFaculty(faculty);
			u.setLoanedNumber(0);
			u.setBorrowStatus(0);
			u.setSuspensionDays(0);
			u.setOverDueFee(0);
			u.setMajor(major);
			u.setProgramme(programme);
			u.setRegistrationStatus(registrationStatus);
			DM.getUserDao().save(u);
			DM.getStudentDao().save(u);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyStudent(String userID,String name,Integer sex,String password,String email,String faculty,String major,Integer programme,Integer registrationStatus) throws PreconditionException{
		Student user = DM.getStudentDao().findByUserID(userID);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			user.setUserID(userID);
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			user.setSex(sex);
			user.setFaculty(faculty);
			user.setLoanedNumber(0);
			user.setBorrowStatus(0);
			user.setSuspensionDays(0);
			user.setOverDueFee(0);
			user.setMajor(major);
			user.setProgramme(programme);
			user.setRegistrationStatus(registrationStatus);
			DM.getStudentDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createFaculty(String userID,String name,Integer sex,String password,String email,String faculty,Integer position,Integer status) throws PreconditionException{
		Faculty user = DM.getFacultyDao().findByUserID(userID);
		
		if(StandardOPs.oclIsUndefined(user) == true)
		{
			Faculty u = new Faculty();
			u.setUserID(userID);
			u.setName(name);
			u.setEmail(email);
			u.setPassword(password);
			u.setSex(sex);
			u.setFaculty(faculty);
			u.setLoanedNumber(0);
			u.setBorrowStatus(0);
			u.setSuspensionDays(0);
			u.setOverDueFee(0);
			u.setPosition(position);
			u.setStatus(status);
			DM.getUserDao().save(u);
			DM.getFacultyDao().save(u);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyFaculty(String userID,String name,Integer sex,String password,String email,String faculty,String major,Integer position,Integer status) throws PreconditionException{
		Faculty user = DM.getFacultyDao().findByUserID(userID);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			user.setUserID(userID);
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			user.setSex(sex);
			user.setFaculty(faculty);
			user.setLoanedNumber(0);
			user.setBorrowStatus(0);
			user.setSuspensionDays(0);
			user.setOverDueFee(0);
			user.setPosition(position);
			user.setStatus(status);
			DM.getFacultyDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createUser(String userid,String name,Integer sex,String password,String email,String faculty,int loanednumber,Integer borrowstatus,int suspensiondays,double overduefee) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == true)
		{
			User use = new User();
			use.setUserID(userid);
			use.setName(name);
			use.setSex(sex);
			use.setPassword(password);
			use.setEmail(email);
			use.setFaculty(faculty);
			use.setLoanedNumber(loanednumber);
			use.setBorrowStatus(borrowstatus);
			use.setSuspensionDays(suspensiondays);
			use.setOverDueFee(overduefee);
			DM.getUserDao().save(use);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public User queryUser(String userid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyUser(String userid,String name,Integer sex,String password,String email,String faculty,int loanednumber,Integer borrowstatus,int suspensiondays,double overduefee) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(userid);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			user.setUserID(userid);
			user.setName(name);
			user.setSex(sex);
			user.setPassword(password);
			user.setEmail(email);
			user.setFaculty(faculty);
			user.setLoanedNumber(loanednumber);
			user.setBorrowStatus(borrowstatus);
			user.setSuspensionDays(suspensiondays);
			user.setOverDueFee(overduefee);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteUser(String userid) throws PreconditionException{
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
