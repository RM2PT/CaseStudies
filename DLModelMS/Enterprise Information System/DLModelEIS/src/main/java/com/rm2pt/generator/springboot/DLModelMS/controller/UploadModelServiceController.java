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
@RequestMapping("/UploadModelService")
public class UploadModelServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private UploadModelService uploadModelService;
	
	@RequestMapping(value="/uploadModelInformation",method=RequestMethod.POST)	
	public String uploadModelInformation(UploadModelInformationMessage uploadModelInformationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", uploadModelService.uploadModelInformation(uploadModelInformationMsg.id,uploadModelInformationMsg.title,uploadModelInformationMsg.keyword,uploadModelInformationMsg.version,uploadModelInformationMsg.description));
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
	@RequestMapping(value="/uploadModelAttachment",method=RequestMethod.POST)	
	public String uploadModelAttachment() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", uploadModelService.uploadModelAttachment());
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
	@RequestMapping(value="/uploadDataSet",method=RequestMethod.POST)	
	public String uploadDataSet(UploadDataSetMessage uploadDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", uploadModelService.uploadDataSet(uploadDataSetMsg.id,uploadDataSetMsg.content));
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
