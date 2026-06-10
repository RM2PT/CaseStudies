package spring.net.mydream.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.net.mydream.entity.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import spring.net.mydream.utils.DaoManage;

@RestController
@RequestMapping("/state")
	public class StateController {
		@Autowired 
		private DaoManage DM;
		@RequestMapping(value="/UserTable",method=RequestMethod.GET)	
		public String UserTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<User>list=DM.getUserDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/BookTable",method=RequestMethod.GET)	
		public String BookTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Book>list=DM.getBookDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SubjectTable",method=RequestMethod.GET)	
		public String SubjectTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Subject>list=DM.getSubjectDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/BookCopyTable",method=RequestMethod.GET)	
		public String BookCopyTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<BookCopy>list=DM.getBookCopyDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/LoanTable",method=RequestMethod.GET)	
		public String LoanTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Loan>list=DM.getLoanDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ReserveTable",method=RequestMethod.GET)	
		public String ReserveTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Reserve>list=DM.getReserveDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/AdministratorTable",method=RequestMethod.GET)	
		public String AdministratorTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Administrator>list=DM.getAdministratorDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/LibrarianTable",method=RequestMethod.GET)	
		public String LibrarianTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Librarian>list=DM.getLibrarianDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	