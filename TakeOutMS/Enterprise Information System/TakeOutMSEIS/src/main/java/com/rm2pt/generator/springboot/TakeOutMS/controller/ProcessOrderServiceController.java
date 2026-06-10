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
@RequestMapping("/ProcessOrderService")
public class ProcessOrderServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ProcessOrderService processOrderService;
			
	// @RequestMapping(value="/makeNewOrder",method=RequestMethod.POST)	
	// public String makeNewOrder()
	
	
	@RequestMapping(value="/enterItem",method=RequestMethod.POST)	
	public String enterItem(EnterItemMessage enterItemMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processOrderService.enterItem(enterItemMsg.id,enterItemMsg.quantity));
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
	@RequestMapping(value="/endOrder",method=RequestMethod.PUT)	
	public String endOrder() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processOrderService.endOrder());
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
	@RequestMapping(value="/makeCashPayment",method=RequestMethod.POST)	
	public String makeCashPayment(MakeCashPaymentMessage makeCashPaymentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processOrderService.makeCashPayment(makeCashPaymentMsg.amount));
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
