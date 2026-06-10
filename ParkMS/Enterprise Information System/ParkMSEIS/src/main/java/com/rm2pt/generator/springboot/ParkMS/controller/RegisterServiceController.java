package com.rm2pt.generator.springboot.ParkMS.controller;
import com.rm2pt.generator.springboot.ParkMS.service.*;
import com.rm2pt.generator.springboot.ParkMS.Message.*;
import java.util.Date;
import com.rm2pt.generator.springboot.ParkMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.ParkMS.utils.StandardOPs;
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
@RequestMapping("/RegisterService")
public class RegisterServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private RegisterService registerService;
	
	@RequestMapping(value="/registerMember",method=RequestMethod.POST)	
	public String registerMember(RegisterMemberMessage registerMemberMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", registerService.registerMember(registerMemberMsg.memberID,registerMemberMsg.name));
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
	@RequestMapping(value="/registerVehicle",method=RequestMethod.POST)	
	public String registerVehicle(RegisterVehicleMessage registerVehicleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", registerService.registerVehicle(registerVehicleMsg.vehicleID,registerVehicleMsg.plateNumber,registerVehicleMsg.type));
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
