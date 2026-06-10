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
public class ThirdPartyServices{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public CheckingAccount getCheckingAccountStatus(int cid) throws PreconditionException{
		
		if(true)
		{
			return null;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public CreditHistory getCreditHistory(int securityid,String name) throws PreconditionException{
		
		if(true)
		{
			return null;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean sendEmail(String emailaddress,String title,String content) throws PreconditionException{
		
		if(true)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean print(String content,int numbers) throws PreconditionException{
		
		if(true)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public LoanAccount createLoanAccount(int id) throws PreconditionException{
		
		if(true)
		{
			return null;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean transferFunds(int id,double amount) throws PreconditionException{
		
		if(true)
		{
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
