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
@RequestMapping("/SetPriceService")
public class SetPriceServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private SetPriceService setPriceService;
	
	@RequestMapping(value="/setSmallPrice",method=RequestMethod.PUT)	
	public String setSmallPrice(SetSmallPriceMessage setSmallPriceMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", setPriceService.setSmallPrice(setSmallPriceMsg.parkID,setSmallPriceMsg.price));
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
	@RequestMapping(value="/setLargePrice",method=RequestMethod.PUT)	
	public String setLargePrice(SetLargePriceMessage setLargePriceMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", setPriceService.setLargePrice(setLargePriceMsg.parkID,setLargePriceMsg.price));
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
	@RequestMapping(value="/setMotoPrice",method=RequestMethod.PUT)	
	public String setMotoPrice(SetMotoPriceMessage setMotoPriceMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", setPriceService.setMotoPrice(setMotoPriceMsg.parkID,setMotoPriceMsg.price));
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
