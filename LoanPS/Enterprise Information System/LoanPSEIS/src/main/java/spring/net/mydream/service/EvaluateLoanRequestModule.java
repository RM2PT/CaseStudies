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
public class EvaluateLoanRequestModule{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<LoanRequest> listTenLoanRequest() throws PreconditionException{
		LoanRequest CurrentLoanRequests=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequests");
		List<LoanRequest> rs = new ArrayList<LoanRequest>();
		rs = DM.getLoanRequestDao().findByStatus(LoanRequestStatus.REFERENCESVALIDATED);
		
		if(StandardOPs.oclIsUndefined(rs) == false)
		{
			currentUtils.setAttribute("CurrentLoanRequests" , rs);
			return rs;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public LoanRequest chooseOneForReview(int requestid) throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		LoanRequest rs = DM.getLoanRequestDao().findByRequestID(requestid);
		
		if(StandardOPs.oclIsUndefined(rs) == false)
		{
			currentUtils.setAttribute("CurrentLoanRequest" , rs);
			return rs;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public CreditHistory checkCreditHistory() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false && StandardOPs.oclIsUndefined(CurrentLoanRequest.getRequestedCreditHistory()) == false)
		{
			return CurrentLoanRequest.getRequestedCreditHistory();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public CheckingAccount reviewCheckingAccount() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false && StandardOPs.oclIsUndefined(CurrentLoanRequest.getRequestedCAHistory()) == false)
		{
			return CurrentLoanRequest.getRequestedCAHistory();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<LoanTerm> listAvaiableLoanTerm() throws PreconditionException{
		
		if(true)
		{
			return DM.getLoanTermDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean addLoanTerm(int termid) throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		LoanTerm loanterm = DM.getLoanTermDao().findByItemID(termid);
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false && StandardOPs.oclIsUndefined(loanterm) == false)
		{
			CurrentLoanRequest.getAttachedLoanTerms().add(loanterm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean approveLoanRequest() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
		{
			currentUtils.setAttribute("Status" , LoanRequestStatus.APPROVED);
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
