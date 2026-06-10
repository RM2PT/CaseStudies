package com.rm2pt.generator.springboot.MicroK.controller;
import com.rm2pt.generator.springboot.MicroK.service.*;
import com.rm2pt.generator.springboot.MicroK.Message.*;
import java.util.Date;
import com.rm2pt.generator.springboot.MicroK.utils.PreconditionException;
import com.rm2pt.generator.springboot.MicroK.utils.StandardOPs;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/MicroKnowledgeSystem")
public class MicroKnowledgeSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private MicroKnowledgeSystem microKnowledgeSystem;
	
	@RequestMapping(value="/logIn",method=RequestMethod.GET)	
	public String logIn(LogInMessage logInMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.logIn(logInMsg.userId,logInMsg.password));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/searchUserByName",method=RequestMethod.GET)	
	public String searchUserByName(SearchUserByNameMessage searchUserByNameMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.searchUserByName(searchUserByNameMsg.name));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/listMicroknowledgeOfUser",method=RequestMethod.GET)	
	public String listMicroknowledgeOfUser(ListMicroknowledgeOfUserMessage listMicroknowledgeOfUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.listMicroknowledgeOfUser(listMicroknowledgeOfUserMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/searchMicroknowledge",method=RequestMethod.GET)	
	public String searchMicroknowledge(SearchMicroknowledgeMessage searchMicroknowledgeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.searchMicroknowledge(searchMicroknowledgeMsg.keywords));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/viewMicroknowledge",method=RequestMethod.GET)	
	public String viewMicroknowledge(ViewMicroknowledgeMessage viewMicroknowledgeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.viewMicroknowledge(viewMicroknowledgeMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/starMicroknowledge",method=RequestMethod.POST)	
	public String starMicroknowledge() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.starMicroknowledge());
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/writeComment",method=RequestMethod.POST)	
	public String writeComment(WriteCommentMessage writeCommentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.writeComment(writeCommentMsg.content));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/listStaredMicroknowledge",method=RequestMethod.GET)	
	public String listStaredMicroknowledge() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.listStaredMicroknowledge());
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	
}
