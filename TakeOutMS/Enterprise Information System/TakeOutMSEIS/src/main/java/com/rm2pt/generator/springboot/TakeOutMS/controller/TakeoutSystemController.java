package com.rm2pt.generator.springboot.TakeOutMS.controller;
import com.rm2pt.generator.springboot.TakeOutMS.service.*;
import com.rm2pt.generator.springboot.TakeOutMS.Message.*;
import java.util.Date;
import com.rm2pt.generator.springboot.TakeOutMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.TakeOutMS.utils.StandardOPs;
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
@RequestMapping("/TakeoutSystem")
public class TakeoutSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private TakeoutSystem takeoutSystem;
	
	@RequestMapping(value="/acceptOrder",method=RequestMethod.POST)	
	public String acceptOrder(AcceptOrderMessage acceptOrderMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", takeoutSystem.acceptOrder(acceptOrderMsg.name));
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
	@RequestMapping(value="/terminateOrder",method=RequestMethod.PUT)	
	public String terminateOrder(TerminateOrderMessage terminateOrderMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", takeoutSystem.terminateOrder(terminateOrderMsg.name));
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
	@RequestMapping(value="/excursionPublicOrder",method=RequestMethod.GET)	
	public String excursionPublicOrder(ExcursionPublicOrderMessage excursionPublicOrderMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", takeoutSystem.excursionPublicOrder(excursionPublicOrderMsg.id));
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
	@RequestMapping(value="/enterStore",method=RequestMethod.GET)	
	public String enterStore(EnterStoreMessage enterStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", takeoutSystem.enterStore(enterStoreMsg.id));
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
	@RequestMapping(value="/search",method=RequestMethod.GET)	
	public String search(SearchMessage searchMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", takeoutSystem.search(searchMsg.itemname));
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
