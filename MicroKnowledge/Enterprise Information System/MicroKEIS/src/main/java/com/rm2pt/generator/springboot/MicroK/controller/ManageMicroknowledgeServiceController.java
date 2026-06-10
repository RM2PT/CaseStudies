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
@RequestMapping("/ManageMicroknowledgeService")
public class ManageMicroknowledgeServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageMicroknowledgeService manageMicroknowledgeService;
	
	@RequestMapping(value="/createMicroknowledge",method=RequestMethod.POST)	
	public String createMicroknowledge(CreateMicroknowledgeMessage createMicroknowledgeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageMicroknowledgeService.createMicroknowledge(createMicroknowledgeMsg.id,createMicroknowledgeMsg.keywords,createMicroknowledgeMsg.content));
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
	// @RequestMapping(value="/modifyMicroknowledge",method=RequestMethod.PUT)	
	// public String modifyMicroknowledge(ModifyMicroknowledgeMessage modifyMicroknowledgeMsg)
	
	
}
