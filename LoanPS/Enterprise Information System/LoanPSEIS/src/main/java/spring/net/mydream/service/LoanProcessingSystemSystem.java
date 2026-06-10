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
public class LoanProcessingSystemSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean bookNewLoan(int requestid,int loanid,int accountid,Date startdate,Date enddate,int repaymentdays) throws PreconditionException{
		Loan loan = DM.getLoanDao().findByLoanID(loanid);
		LoanRequest r = DM.getLoanRequestDao().findByRequestID(requestid);
		LoanAccount la = DM.getLoanAccountDao().findByLoanAccountID(accountid);
		
		if(StandardOPs.oclIsUndefined(loan) == true && StandardOPs.oclIsUndefined(r) == false)
		{
			Loan loa = new Loan();
			loa.setLoanID(loanid);
			loa.setStartDate(startdate);
			loa.setEndDate(enddate);
			loa.setRePaymentDays(repaymentdays);
			loa.setStatus(0);
			loa.setRepaymentAmount(r.getLoanAmount());
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean generateStandardPaymentNotice() throws PreconditionException{
		List<Loan> loans = new ArrayList<Loan>();
//		loans = DM.getLoanDao().findByStatusAnd(LoanStatus.LSOPEN);
		
		if(StandardOPs.oclIsUndefined(loans) == false)
		{
			for(Loan l : loans){
				
			}return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean generateLateNotice() throws PreconditionException{
		List<Loan> loans = new ArrayList<Loan>();
//		loans = DM.getLoanDao().findByStatusAnd(LoanStatus.LSOPEN);
		
		if(StandardOPs.oclIsUndefined(loans) == false)
		{
			for(Loan l : loans){
				
			}return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean loanPayment(int loanid) throws PreconditionException{
		Loan loan = DM.getLoanDao().findByLoanID(loanid);
		
		if(StandardOPs.oclIsUndefined(loan) == false && loan.getStatus() == LoanStatus.LSOPEN.ordinal())
		{
			loan.setRemainAmountToPay(loan.getRemainAmountToPay() - loan.getRepaymentAmount());
			DM.getLoanDao().save(loan);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean closeOutLoan(int loanid) throws PreconditionException{
		Loan loan = DM.getLoanDao().findByLoanID(loanid);
		
		if(StandardOPs.oclIsUndefined(loan) == false && loan.getStatus() == LoanStatus.LSOPEN.ordinal())
		{
			loan.setStatus(1);
			DM.getLoanDao().save(loan);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean listBookedLoans() throws PreconditionException{
		
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
