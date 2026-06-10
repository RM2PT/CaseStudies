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
public class SubmitLoanRequestModule{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean enterLoanInformation(int requestid,String name,double loanamount,String loanpurpose,double income,int phonenumber,String postaladdress,int zipcode,String email,String workreferences,String creditreferences,int checkingaccountnumber,int securitynumber) throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		LoanRequest loanrequest = DM.getLoanRequestDao().findByRequestID(requestid);
		
		if(StandardOPs.oclIsUndefined(loanrequest) == true)
		{
			LoanRequest loa = new LoanRequest();
			loa.setRequestID(requestid);
			loa.setName(name);
			loa.setLoanAmount(loanamount);
			loa.setLoanPurpose(loanpurpose);
			loa.setIncome(income);
			loa.setPhoneNumber(phonenumber);
			loa.setPostalAddress(postaladdress);
			loa.setZipCode(zipcode);
			loa.setEmail(email);
			loa.setWorkReferences(workreferences);
			loa.setCreditReferences(creditreferences);
			loa.setCheckingAccountNumber(checkingaccountnumber);
			loa.setSecurityNumber(securitynumber);
			DM.getLoanRequestDao().save(loa);
			currentUtils.setAttribute("CurrentLoanRequest" , loa);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean creditRequest() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
		{
			CreditHistory his = new CreditHistory();
			his = ((ThirdPartyServices) serviceManage.getService("ThirdPartyServices")).getCreditHistory(CurrentLoanRequest.getSecurityNumber(),CurrentLoanRequest.getName());
			CurrentLoanRequest.setRequestedCreditHistory(his);
			DM.getCreditHistoryDao().save(his);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean accountStatusRequest() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		LoanRequest t = CurrentLoanRequest;
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false)
		{
			CheckingAccount ca = new CheckingAccount();
			ca = ((ThirdPartyServices) serviceManage.getService("ThirdPartyServices")).getCheckingAccountStatus(t.getCheckingAccountNumber());
			currentUtils.setAttribute("RequestedCAHistory" , ca);
			DM.getCheckingAccountDao().save(ca);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public int calculateScore() throws PreconditionException{
		LoanRequest CurrentLoanRequest=(LoanRequest)currentUtils.getAttribute("CurrentLoanRequest");
		
		if(StandardOPs.oclIsUndefined(CurrentLoanRequest) == false && StandardOPs.oclIsUndefined(CurrentLoanRequest.getRequestedCAHistory()) == false && StandardOPs.oclIsUndefined(CurrentLoanRequest.getRequestedCreditHistory()) == false)
		{
			currentUtils.setAttribute("CreditScore" , 100);
			currentUtils.setAttribute("Status" , LoanRequestStatus.SUBMITTED);
			return CurrentLoanRequest.getCreditScore();
			
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
