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
@RequestMapping("/ManageAPIService")
public class ManageAPIServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageAPIService manageAPIService;
	
	@RequestMapping(value="/createAPI",method=RequestMethod.POST)	
	public String createAPI(CreateAPIMessage createAPIMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageAPIService.createAPI(createAPIMsg.token));
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
	@RequestMapping(value="/deleteAPI",method=RequestMethod.DELETE)	
	public String deleteAPI(DeleteAPIMessage deleteAPIMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageAPIService.deleteAPI(deleteAPIMsg.token));
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
	@RequestMapping(value="/modifyAPI",method=RequestMethod.PUT)	
	public String modifyAPI(ModifyAPIMessage modifyAPIMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageAPIService.modifyAPI(modifyAPIMsg.token,modifyAPIMsg.isValid));
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
	@RequestMapping(value="/queryAPI",method=RequestMethod.GET)	
	public String queryAPI(QueryAPIMessage queryAPIMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageAPIService.queryAPI(queryAPIMsg.token));
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
