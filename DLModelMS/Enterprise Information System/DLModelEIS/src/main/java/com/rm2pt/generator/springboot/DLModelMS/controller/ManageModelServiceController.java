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
@RequestMapping("/ManageModelService")
public class ManageModelServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageModelService manageModelService;
	
	@RequestMapping(value="/updateModelInformation",method=RequestMethod.PUT)	
	public String updateModelInformation(UpdateModelInformationMessage updateModelInformationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.updateModelInformation(updateModelInformationMsg.id,updateModelInformationMsg.title,updateModelInformationMsg.keyword,updateModelInformationMsg.version,updateModelInformationMsg.description));
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
	@RequestMapping(value="/updateDataSet",method=RequestMethod.PUT)	
	public String updateDataSet(UpdateDataSetMessage updateDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.updateDataSet(updateDataSetMsg.id,updateDataSetMsg.content));
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
