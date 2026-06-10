package com.rm2pt.generator.springboot.DLModelMS.controller;
import com.rm2pt.generator.springboot.DLModelMS.service.*;
import com.rm2pt.generator.springboot.DLModelMS.Message.*;
import java.util.Date;
import com.rm2pt.generator.springboot.DLModelMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.DLModelMS.utils.StandardOPs;
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
@RequestMapping("/DeployModelService")
public class DeployModelServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private DeployModelService deployModelService;
	
	@RequestMapping(value="/deployModel",method=RequestMethod.POST)	
	public String deployModel(DeployModelMessage deployModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", deployModelService.deployModel(deployModelMsg.runningModelId,deployModelMsg.assignedResource,deployModelMsg.api));
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
	@RequestMapping(value="/createKey",method=RequestMethod.POST)	
	public String createKey(CreateKeyMessage createKeyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", deployModelService.createKey(createKeyMsg.keyId));
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
