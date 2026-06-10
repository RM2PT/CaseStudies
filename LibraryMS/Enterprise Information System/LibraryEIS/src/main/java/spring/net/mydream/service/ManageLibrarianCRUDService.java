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
public class ManageLibrarianCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createLibrarian(String librarianid,String name,String password) throws PreconditionException{
		Librarian librarian = DM.getLibrarianDao().findByLibrarianID(librarianid);
		
		if(StandardOPs.oclIsUndefined(librarian) == true)
		{
			Librarian lib = new Librarian();
			lib.setLibrarianID(librarianid);
			lib.setName(name);
			lib.setPassword(password);
			DM.getLibrarianDao().save(lib);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Librarian queryLibrarian(String librarianid) throws PreconditionException{
		Librarian librarian = DM.getLibrarianDao().findByLibrarianID(librarianid);
		
		if(StandardOPs.oclIsUndefined(librarian) == false)
		{
			return librarian;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyLibrarian(String librarianid,String name,String password) throws PreconditionException{
		Librarian librarian = DM.getLibrarianDao().findByLibrarianID(librarianid);
		
		if(StandardOPs.oclIsUndefined(librarian) == false)
		{
			librarian.setLibrarianID(librarianid);
			librarian.setName(name);
			librarian.setPassword(password);
			DM.getLibrarianDao().save(librarian);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteLibrarian(String librarianid) throws PreconditionException{
		Librarian librarian = DM.getLibrarianDao().findByLibrarianID(librarianid);
		
		if(StandardOPs.oclIsUndefined(librarian) == false && librarian!= null)
		{
			DM.getLibrarianDao().delete(librarian);
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
