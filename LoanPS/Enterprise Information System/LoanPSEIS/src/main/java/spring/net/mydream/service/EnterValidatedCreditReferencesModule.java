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
public class EnterValidatedCreditReferencesModule{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<LoanRequest> listSubmitedLoanRequest() throws PreconditionException{
		LoanRequest CurrentLoanRequests=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequests");
		List<LoanRequest> rs = new ArrayList<LoanRequest>();
		rs = DM.getLoanRequestDao().findByStatus(LoanRequestStatus.SUBMITTED);
		
		if(StandardOPs.size(rs) > 0)
		{
			currentUtils.setAttribute("CurrentLoanRequests" , rs);
			return rs;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public LoanRequest chooseLoanRequest(int requestid) throws PreconditionException{
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
	public Boolean markRequestValid() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
		{
			currentUtils.setAttribute("Status" , LoanRequestStatus.REFERENCESVALIDATED);
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
