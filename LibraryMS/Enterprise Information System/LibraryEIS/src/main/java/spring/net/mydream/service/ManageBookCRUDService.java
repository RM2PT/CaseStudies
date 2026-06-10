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
public class ManageBookCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createBook(String callno,String title,String edition,String author,String publisher,String description,String isbn,int copynum) throws PreconditionException{
		Book book = DM.getBookDao().findByCallNo(callno);
		
		if(StandardOPs.oclIsUndefined(book) == true)
		{
			Book boo = new Book();
			boo.setCallNo(callno);
			boo.setTitle(title);
			boo.setEdition(edition);
			boo.setAuthor(author);
			boo.setPublisher(publisher);
			boo.setDescription(description);
			boo.setISBn(isbn);
			boo.setCopyNum(copynum);
			DM.getBookDao().save(boo);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Book queryBook(String callno) throws PreconditionException{
		Book book = DM.getBookDao().findByCallNo(callno);
		
		if(StandardOPs.oclIsUndefined(book) == false)
		{
			return book;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyBook(String callno,String title,String edition,String author,String publisher,String description,String isbn,int copynum) throws PreconditionException{
		Book book = DM.getBookDao().findByCallNo(callno);
		
		if(StandardOPs.oclIsUndefined(book) == false)
		{
			book.setCallNo(callno);
			book.setTitle(title);
			book.setEdition(edition);
			book.setAuthor(author);
			book.setPublisher(publisher);
			book.setDescription(description);
			book.setISBn(isbn);
			book.setCopyNum(copynum);
			DM.getBookDao().save(book);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteBook(String callno) throws PreconditionException{
		Book book = DM.getBookDao().findByCallNo(callno);
		
		if(StandardOPs.oclIsUndefined(book) == false && book!= null)
		{
			DM.getBookDao().delete(book);
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
