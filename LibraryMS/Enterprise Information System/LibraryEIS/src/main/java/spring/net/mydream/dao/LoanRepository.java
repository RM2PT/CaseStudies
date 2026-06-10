package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface LoanRepository extends JpaRepository<Loan, Integer> ,JpaSpecificationExecutor<Loan>{
		List<Loan> findByLoanedUser(User user);
		List<Loan> findByLoanedCopy(BookCopy bookCopy);
		List<Loan> findByLoanLibrarian(Librarian librarian);
		List<Loan> findByReturnLibrarian(Librarian librarian);
			List<Loan> findByIsReturned(Object paramFalse);
			List<Loan> findByIsReturnedAndOverDueFee(Object paramFalse,Object param0);
//			List<Loan> findByIsReturnedAnd(Object paramFalse);
}
