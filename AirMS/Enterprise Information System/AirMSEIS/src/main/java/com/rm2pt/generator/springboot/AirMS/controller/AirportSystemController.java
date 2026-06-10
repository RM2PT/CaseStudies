package com.rm2pt.generator.springboot.AirMS.controller;
import com.rm2pt.generator.springboot.AirMS.service.*;
import com.rm2pt.generator.springboot.AirMS.Message.*;
import java.util.Date;
import com.rm2pt.generator.springboot.AirMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.AirMS.utils.StandardOPs;
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
@RequestMapping("/AirportSystem")
public class AirportSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private AirportSystem airportSystem;
	
	@RequestMapping(value="/createStaff",method=RequestMethod.POST)	
	public String createStaff(CreateStaffMessage createStaffMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createStaff(createStaffMsg.id,createStaffMsg.name,createStaffMsg.pswd,createStaffMsg.phone,createStaffMsg.role,createStaffMsg.bossid));
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
	@RequestMapping(value="/createDevice",method=RequestMethod.POST)	
	public String createDevice(CreateDeviceMessage createDeviceMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createDevice(createDeviceMsg.id,createDeviceMsg.name,createDeviceMsg.location,createDeviceMsg.contactsid));
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
