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
		@RequestMapping(value="/TeamTable",method=RequestMethod.GET)	
		public String TeamTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Team>list=DM.getTeamDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ActivityLogTable",method=RequestMethod.GET)	
		public String ActivityLogTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<ActivityLog>list=DM.getActivityLogDao().findAll();
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
		@RequestMapping(value="/MKTable",method=RequestMethod.GET)	
		public String MKTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<MK>list=DM.getMKDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ProjectTable",method=RequestMethod.GET)	
		public String ProjectTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Project>list=DM.getProjectDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ProjectHistoryTable",method=RequestMethod.GET)	
		public String ProjectHistoryTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<ProjectHistory>list=DM.getProjectHistoryDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/GrpTable",method=RequestMethod.GET)	
		public String GrpTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Grp>list=DM.getGrpDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CommentTable",method=RequestMethod.GET)	
		public String CommentTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Comment>list=DM.getCommentDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CommentReplyTable",method=RequestMethod.GET)	
		public String CommentReplyTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CommentReply>list=DM.getCommentReplyDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/KeywordTable",method=RequestMethod.GET)	
		public String KeywordTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Keyword>list=DM.getKeywordDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	