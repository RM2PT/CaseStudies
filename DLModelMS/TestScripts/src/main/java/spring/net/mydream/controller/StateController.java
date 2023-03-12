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
		@RequestMapping(value="/ModelTable",method=RequestMethod.GET)	
		public String ModelTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Model>list=DM.getModelDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ModelAccessLinkTable",method=RequestMethod.GET)	
		public String ModelAccessLinkTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<ModelAccessLink>list=DM.getModelAccessLinkDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OnlineModelTable",method=RequestMethod.GET)	
		public String OnlineModelTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<OnlineModel>list=DM.getOnlineModelDao().findAll();
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
		@RequestMapping(value="/APITable",method=RequestMethod.GET)	
		public String APITables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<API>list=DM.getAPIDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DataSetTable",method=RequestMethod.GET)	
		public String DataSetTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<DataSet>list=DM.getDataSetDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	