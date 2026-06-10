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
@RequestMapping("/AutomaticOutService")
public class AutomaticOutServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private AutomaticOutService automaticOutService;
	
	@RequestMapping(value="/scanPlateNumber",method=RequestMethod.PUT)	
	public String scanPlateNumber(ScanPlateNumberMessage scanPlateNumberMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automaticOutService.scanPlateNumber(scanPlateNumberMsg.plateNumber,scanPlateNumberMsg.time));
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
	@RequestMapping(value="/onlinePay",method=RequestMethod.PUT)	
	public String onlinePay(OnlinePayMessage onlinePayMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automaticOutService.onlinePay(onlinePayMsg.memberID));
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
