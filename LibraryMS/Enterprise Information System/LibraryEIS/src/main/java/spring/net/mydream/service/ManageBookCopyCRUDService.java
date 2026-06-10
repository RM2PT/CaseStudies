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
public class ManageBookCopyCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean addBookCopy(String callNo,String barcode,String location) throws PreconditionException{
		Book book = DM.getBookDao().findByCallNo(callNo);
		List<BookCopy> t = new ArrayList<BookCopy>();
		t = book.getCopys();
		
		if(StandardOPs.oclIsUndefined(book) == false)
		{
			BookCopy copy = new BookCopy();
			copy.setBarcode(barcode);
			copy.setStatus(0);
			copy.setLocation(location);
			copy.setIsReserved(false);
			book.getCopys().add(copy);
			copy.setBookBelongs(book);
			book.setCopyNum(book.getCopyNum() + 1);
			DM.getBookCopyDao().save(copy);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public BookCopy queryBookCopy(String barcode) throws PreconditionException{
		BookCopy bookcopy = DM.getBookCopyDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(bookcopy) == false)
		{
			return bookcopy;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyBookCopy(String barcode,Integer status,String location,Boolean isreserved) throws PreconditionException{
		BookCopy bookcopy = DM.getBookCopyDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(bookcopy) == false)
		{
			bookcopy.setBarcode(barcode);
			bookcopy.setStatus(status);
			bookcopy.setLocation(location);
			bookcopy.setIsReserved(isreserved);
			DM.getBookCopyDao().save(bookcopy);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteBookCopy(String barcode) throws PreconditionException{
		BookCopy bookcopy = DM.getBookCopyDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(bookcopy) == false && bookcopy!= null)
		{
			DM.getBookCopyDao().delete(bookcopy);
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
