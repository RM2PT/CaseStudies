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
@RequestMapping("/RepairService")
public class RepairServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private RepairService repairService;
	
	@RequestMapping(value="/approve",method=RequestMethod.POST)	
	public String approve(ApproveMessage approveMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.approve(approveMsg.sid,approveMsg.rid,approveMsg.reject,approveMsg.suggestion));
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
	@RequestMapping(value="/finishRepair",method=RequestMethod.PUT)	
	public String finishRepair(FinishRepairMessage finishRepairMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.finishRepair(finishRepairMsg.id,finishRepairMsg.sid,finishRepairMsg.did,finishRepairMsg.res));
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
	@RequestMapping(value="/feedback",method=RequestMethod.POST)	
	public String feedback(FeedbackMessage feedbackMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.feedback(feedbackMsg.id,feedbackMsg.sid,feedbackMsg.score,feedbackMsg.des));
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
