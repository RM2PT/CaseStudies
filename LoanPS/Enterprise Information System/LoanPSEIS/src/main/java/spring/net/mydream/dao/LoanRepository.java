package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface LoanRepository extends JpaRepository<Loan, Integer> ,JpaSpecificationExecutor<Loan>{
	Loan findByReferedLoanRequest(LoanRequest loanRequest);
		List<Loan> findByBelongedLoanAccount(LoanAccount loanAccount);
			Loan findByLoanID(Object loanid);
//			List<Loan> findByStatusAnd(Object loanStatus);
}
