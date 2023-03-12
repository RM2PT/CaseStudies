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
@RequestMapping("/ManageModelService")
public class ManageModelServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageModelService manageModelService;
	
	@RequestMapping(value="/modifyModel",method=RequestMethod.PUT)	
	public String modifyModel(ModifyModelMessage modifyModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.modifyModel(modifyModelMsg.modelId,modifyModelMsg.version,modifyModelMsg.location));
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
	@RequestMapping(value="/downModel",method=RequestMethod.GET)	
	public String downModel(DownModelMessage downModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.downModel(downModelMsg.modelId));
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
	@RequestMapping(value="/listOnlineModel",method=RequestMethod.GET)	
	public String listOnlineModel(ListOnlineModelMessage listOnlineModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.listOnlineModel(listOnlineModelMsg.modelId));
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
	@RequestMapping(value="/listAllAdministrator",method=RequestMethod.GET)	
	public String listAllAdministrator(ListAllAdministratorMessage listAllAdministratorMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.listAllAdministrator(listAllAdministratorMsg.modelId));
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
	@RequestMapping(value="/listAllDataSet",method=RequestMethod.GET)	
	public String listAllDataSet(ListAllDataSetMessage listAllDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.listAllDataSet(listAllDataSetMsg.modelId));
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
	@RequestMapping(value="/listAllAccess",method=RequestMethod.GET)	
	public String listAllAccess(ListAllAccessMessage listAllAccessMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.listAllAccess(listAllAccessMsg.modelId));
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
	@RequestMapping(value="/serchModel",method=RequestMethod.GET)	
	public String serchModel(SerchModelMessage serchModelMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelService.serchModel(serchModelMsg.modelId));
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
