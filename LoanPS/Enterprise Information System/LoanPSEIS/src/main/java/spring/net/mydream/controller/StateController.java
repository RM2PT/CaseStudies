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
		@RequestMapping(value="/LoanRequestTable",method=RequestMethod.GET)	
		public String LoanRequestTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<LoanRequest>list=DM.getLoanRequestDao().findAll();
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
		@RequestMapping(value="/LoanTermTable",method=RequestMethod.GET)	
		public String LoanTermTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<LoanTerm>list=DM.getLoanTermDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CheckingAccountTable",method=RequestMethod.GET)	
		public String CheckingAccountTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CheckingAccount>list=DM.getCheckingAccountDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CreditHistoryTable",method=RequestMethod.GET)	
		public String CreditHistoryTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CreditHistory>list=DM.getCreditHistoryDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/LoanAccountTable",method=RequestMethod.GET)	
		public String LoanAccountTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<LoanAccount>list=DM.getLoanAccountDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ApprovalLetterTable",method=RequestMethod.GET)	
		public String ApprovalLetterTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<ApprovalLetter>list=DM.getApprovalLetterDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/LoanAgreementTable",method=RequestMethod.GET)	
		public String LoanAgreementTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<LoanAgreement>list=DM.getLoanAgreementDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	