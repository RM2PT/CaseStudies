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
@RequestMapping("/ManageModelAccessService")
public class ManageModelAccessServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageModelAccessService manageModelAccessService;
	
	@RequestMapping(value="/createAccess",method=RequestMethod.POST)	
	public String createAccess(CreateAccessMessage createAccessMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelAccessService.createAccess(createAccessMsg.symbol,createAccessMsg.maxNum));
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
	@RequestMapping(value="/deleteAccess",method=RequestMethod.DELETE)	
	public String deleteAccess(DeleteAccessMessage deleteAccessMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelAccessService.deleteAccess(deleteAccessMsg.symbol));
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
	@RequestMapping(value="/modifyAccess",method=RequestMethod.PUT)	
	public String modifyAccess(ModifyAccessMessage modifyAccessMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelAccessService.modifyAccess(modifyAccessMsg.symbol,modifyAccessMsg.maxNum));
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
	@RequestMapping(value="/queryAccess",method=RequestMethod.GET)	
	public String queryAccess(QueryAccessMessage queryAccessMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageModelAccessService.queryAccess(queryAccessMsg.symbol));
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
