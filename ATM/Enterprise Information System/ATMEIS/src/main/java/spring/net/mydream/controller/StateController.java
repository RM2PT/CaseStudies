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
		@RequestMapping(value="/BankCardTable",method=RequestMethod.GET)	
		public String BankCardTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<BankCard>list=DM.getBankCardDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/UserTable",method=RequestMethod.GET)	
		public String UserTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<User>list=DM.getUserDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	