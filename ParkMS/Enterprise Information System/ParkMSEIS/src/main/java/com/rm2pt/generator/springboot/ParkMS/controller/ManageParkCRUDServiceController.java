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
@RequestMapping("/ManageParkCRUDService")
public class ManageParkCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageParkCRUDService manageParkCRUDService;
	
	@RequestMapping(value="/createPark",method=RequestMethod.POST)	
	public String createPark(CreateParkMessage createParkMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageParkCRUDService.createPark(createParkMsg.id,createParkMsg.name,createParkMsg.location,createParkMsg.smallprice,createParkMsg.largeprice,createParkMsg.motoprice));
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
	@RequestMapping(value="/queryPark",method=RequestMethod.GET)	
	public String queryPark(QueryParkMessage queryParkMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageParkCRUDService.queryPark(queryParkMsg.id));
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
	@RequestMapping(value="/modifyPark",method=RequestMethod.PUT)	
	public String modifyPark(ModifyParkMessage modifyParkMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageParkCRUDService.modifyPark(modifyParkMsg.id,modifyParkMsg.name,modifyParkMsg.location,modifyParkMsg.smallprice,modifyParkMsg.largeprice,modifyParkMsg.motoprice));
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
	@RequestMapping(value="/deletePark",method=RequestMethod.DELETE)	
	public String deletePark(DeleteParkMessage deleteParkMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageParkCRUDService.deletePark(deleteParkMsg.id));
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
