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
public class ManageLoanTermCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createLoanTerm(int itemid,String content) throws PreconditionException{
		LoanTerm loanterm = DM.getLoanTermDao().findByItemID(itemid);
		
		if(StandardOPs.oclIsUndefined(loanterm) == true)
		{
			LoanTerm loa = new LoanTerm();
			loa.setItemID(itemid);
			loa.setContent(content);
			DM.getLoanTermDao().save(loa);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public LoanTerm queryLoanTerm(int itemid) throws PreconditionException{
		LoanTerm loanterm = DM.getLoanTermDao().findByItemID(itemid);
		
		if(StandardOPs.oclIsUndefined(loanterm) == false)
		{
			return loanterm;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyLoanTerm(int itemid,String content) throws PreconditionException{
		LoanTerm loanterm = DM.getLoanTermDao().findByItemID(itemid);
		
		if(StandardOPs.oclIsUndefined(loanterm) == false)
		{
			loanterm.setItemID(itemid);
			loanterm.setContent(content);
			DM.getLoanTermDao().save(loanterm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteLoanTerm(int itemid) throws PreconditionException{
		LoanTerm loanterm = DM.getLoanTermDao().findByItemID(itemid);
		
		if(StandardOPs.oclIsUndefined(loanterm) == false && loanterm!= null)
		{
			DM.getLoanTermDao().delete(loanterm);
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
