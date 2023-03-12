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
@RequestMapping("/ManageAdministratorService")
public class ManageAdministratorServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageAdministratorService manageAdministratorService;
	
	@RequestMapping(value="/createAdministrator",method=RequestMethod.POST)	
	public String createAdministrator(CreateAdministratorMessage createAdministratorMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageAdministratorService.createAdministrator(createAdministratorMsg.modelId,createAdministratorMsg.administratorId));
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
	@RequestMapping(value="/deleteAdministrator",method=RequestMethod.DELETE)	
	public String deleteAdministrator(DeleteAdministratorMessage deleteAdministratorMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageAdministratorService.deleteAdministrator(deleteAdministratorMsg.modelId,deleteAdministratorMsg.administratorId));
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
