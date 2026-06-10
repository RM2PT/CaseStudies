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
public class LibraryManagementSystemSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public void dueSoonNotification() throws PreconditionException{
		List<User> users = new ArrayList<User>();
		
		if(true)
		{
			for(User u : users){
				
			}
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public void checkOverDueandComputeOverDueFee() throws PreconditionException{
//		List<Loan> loans = new ArrayList<Loan>();
//		loans = DM.getLoanDao().findByIsReturnedAnd(false);
//
//		if(true)
//		{
//			return;
//		}else{
//
//		 	 throw new PreconditionException();
//
//		}
		
	}
	public void countDownSuspensionDay() throws PreconditionException{
		List<User> users = new ArrayList<User>();
		users = DM.getUserDao().findBySuspensionDays(0);
		
		if(true)
		{
			for(User u : users){
				u.setSuspensionDays(u.getSuspensionDays() - 1);
			if(u.getBorrowStatus() == BorrowStatus.SUSPEND.ordinal() && u.getOverDueFee() == 0 && u.getSuspensionDays() == 0){
				u.setBorrowStatus(0);
			
			}
			}
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean recommendBook(String uid,String callNo,String title,String edition,String author,String publisher,String description,String isbn) throws PreconditionException{
		User user = DM.getUserDao().findByUserID(uid);
		RecommendBook rb = DM.getRecommendBookDao().findByCallNo(callNo);
		
		if(StandardOPs.oclIsUndefined(user) == false && StandardOPs.oclIsUndefined(rb) == true)
		{
			RecommendBook r = new RecommendBook();
			r.setCallNo(callNo);
			r.setTitle(title);
			r.setEdition(edition);
			r.setAuthor(author);
			r.setPublisher(publisher);
			r.setDescription(description);
			r.setISBn(isbn);
			r.setRecommendDate(new Date(System.currentTimeMillis()));
			r.setRecommendUser(user);
			user.getRecommendedBook().add(r);
			DM.getRecommendBookDao().save(r);
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
