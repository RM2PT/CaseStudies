package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface LoanRequestRepository extends JpaRepository<LoanRequest, Integer> ,JpaSpecificationExecutor<LoanRequest>{
		List<LoanRequest> findByRequestedCAHistory(CheckingAccount checkingAccount);
		List<LoanRequest> findByRequestedCreditHistory(CreditHistory creditHistory);
		List<LoanRequest> findByAttachedApprovalLetter(ApprovalLetter approvalLetter);
		List<LoanRequest> findByAttachedLoanAgreement(LoanAgreement loanAgreement);
			List<LoanRequest> findByStatus(Object loanRequestStatus);
			LoanRequest findByRequestID(Object requestid);
}
