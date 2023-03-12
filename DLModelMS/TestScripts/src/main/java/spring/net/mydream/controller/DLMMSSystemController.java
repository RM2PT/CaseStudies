package spring.net.mydream.controller;
import spring.net.mydream.service.*;
import spring.net.mydream.Message.*;
import java.util.Date;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.StandardOPs;
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
@RequestMapping("/DLMMSSystem")
public class DLMMSSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private DLMMSSystem dLMMSSystem;
	
	@RequestMapping(value="/uploadModel",method=RequestMethod.POST)	
	public String uploadModel(UploadModelMessage uploadModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", dLMMSSystem.uploadModel(uploadModelMsg.modelId,uploadModelMsg.version,uploadModelMsg.location));
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
	@RequestMapping(value="/deleteModel",method=RequestMethod.DELETE)	
	public String deleteModel(DeleteModelMessage deleteModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", dLMMSSystem.deleteModel(deleteModelMsg.modelId));
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
	@RequestMapping(value="/visitModel",method=RequestMethod.GET)	
	public String visitModel(VisitModelMessage visitModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", dLMMSSystem.visitModel(visitModelMsg.symbol));
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
	@RequestMapping(value="/visitOnlineModel",method=RequestMethod.GET)	
	public String visitOnlineModel(VisitOnlineModelMessage visitOnlineModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", dLMMSSystem.visitOnlineModel(visitOnlineModelMsg.token));
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
