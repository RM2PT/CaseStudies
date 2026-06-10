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
public class GenerateLoanLetterAndAgreementModule{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<LoanRequest> listApprovalRequest() throws PreconditionException{
		LoanRequest CurrentLoanRequests=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequests");
		List<LoanRequest> rs = new ArrayList<LoanRequest>();
		rs = DM.getLoanRequestDao().findByStatus(LoanRequestStatus.APPROVED);
		
		if(StandardOPs.oclIsUndefined(rs) == false)
		{
			currentUtils.setAttribute("CurrentLoanRequests" , rs);
			return rs;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean genereateApprovalLetter(int id) throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		LoanRequest r = DM.getLoanRequestDao().findByRequestID(id);
		
		if(StandardOPs.oclIsUndefined(r) == false)
		{
			ApprovalLetter l = new ApprovalLetter();
			l.setContent("ApprovalLetterContent");
			r.setAttachedApprovalLetter(l);
			currentUtils.setAttribute("CurrentLoanRequest" , r);
			DM.getApprovalLetterDao().save(l);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean emailToAppliant() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean generateLoanAgreement() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
		{
			LoanAgreement la = new LoanAgreement();
			la.setContent("Loan Agreement");
			currentUtils.setAttribute("AttachedLoanAgreement" , la);
			DM.getLoanAgreementDao().save(la);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean printLoanAgreement(int number) throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
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
