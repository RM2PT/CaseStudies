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
@RequestMapping("/ManageOnlineModelService")
public class ManageOnlineModelServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageOnlineModelService manageOnlineModelService;
	
	@RequestMapping(value="/deployOnlineModel",method=RequestMethod.POST)	
	public String deployOnlineModel(DeployOnlineModelMessage deployOnlineModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageOnlineModelService.deployOnlineModel(deployOnlineModelMsg.modelId,deployOnlineModelMsg.onlineModelId,deployOnlineModelMsg.assignedResource));
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
	@RequestMapping(value="/queryOnlineModel",method=RequestMethod.GET)	
	public String queryOnlineModel(QueryOnlineModelMessage queryOnlineModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageOnlineModelService.queryOnlineModel(queryOnlineModelMsg.onlineModelId));
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
	@RequestMapping(value="/stopOnlineModel",method=RequestMethod.DELETE)	
	public String stopOnlineModel(StopOnlineModelMessage stopOnlineModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageOnlineModelService.stopOnlineModel(stopOnlineModelMsg.onlineModelId));
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
	@RequestMapping(value="/listAllAPI",method=RequestMethod.GET)	
	public String listAllAPI(ListAllAPIMessage listAllAPIMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageOnlineModelService.listAllAPI(listAllAPIMsg.onlineModelId));
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
