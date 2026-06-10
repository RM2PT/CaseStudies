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
@RequestMapping("/ManageUserService")
public class ManageUserServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageUserService manageUserService;
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)	
	public String createUser(CreateUserMessage createUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserService.createUser(createUserMsg.id,createUserMsg.password,createUserMsg.name));
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
