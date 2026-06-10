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
public class ListBookHistory{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<Loan> listBorrowHistory(String uid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(uid);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			return user.getLoanedBook();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Loan> listHodingBook(String uid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(uid);
		List<Loan> t = new ArrayList<Loan>();
		t = user.getLoanedBook();
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			return t.stream().filter(nmsl -> nmsl.getIsReturned() == false).collect(Collectors.toList());
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<BookCopy> listOverDueBook(String uid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(uid);
		List<Loan> t = new ArrayList<Loan>();
		t = user.getLoanedBook();
		List<Loan> loans = new ArrayList<Loan>();
		
		if(StandardOPs.oclIsUndefined(user) == false && StandardOPs.oclIsUndefined(loans) == false)
		{
			return null;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<BookCopy> listReservationBook(String uid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(uid);
		List<Reserve> res = new ArrayList<Reserve>();
		res = user.getReservedBook();
		
		if(StandardOPs.oclIsUndefined(user) == false && StandardOPs.oclIsUndefined(res) == false)
		{
			return null;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<RecommendBook> listRecommendBook(String uid) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(uid);
		List<RecommendBook> rBooks = new ArrayList<RecommendBook>();
		rBooks = user.getRecommendedBook();
		
		if(StandardOPs.oclIsUndefined(user) == false && StandardOPs.oclIsUndefined(rBooks) == false)
		{
			return rBooks;
			
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
