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
@RequestMapping("/ManageVehicleCRUDService")
public class ManageVehicleCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageVehicleCRUDService manageVehicleCRUDService;
	
	@RequestMapping(value="/createVehicle",method=RequestMethod.POST)	
	public String createVehicle(CreateVehicleMessage createVehicleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageVehicleCRUDService.createVehicle(createVehicleMsg.id,createVehicleMsg.platenumber,createVehicleMsg.type));
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
	@RequestMapping(value="/queryVehicle",method=RequestMethod.GET)	
	public String queryVehicle(QueryVehicleMessage queryVehicleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageVehicleCRUDService.queryVehicle(queryVehicleMsg.id));
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
	@RequestMapping(value="/modifyVehicle",method=RequestMethod.PUT)	
	public String modifyVehicle(ModifyVehicleMessage modifyVehicleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageVehicleCRUDService.modifyVehicle(modifyVehicleMsg.id,modifyVehicleMsg.platenumber,modifyVehicleMsg.type));
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
	@RequestMapping(value="/deleteVehicle",method=RequestMethod.DELETE)	
	public String deleteVehicle(DeleteVehicleMessage deleteVehicleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageVehicleCRUDService.deleteVehicle(deleteVehicleMsg.id));
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
