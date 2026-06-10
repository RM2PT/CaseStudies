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
@RequestMapping("/ManageSubjectCRUDService")
public class ManageSubjectCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageSubjectCRUDService manageSubjectCRUDService;
	
	@RequestMapping(value="/createSubject",method=RequestMethod.POST)	
	public String createSubject(CreateSubjectMessage createSubjectMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSubjectCRUDService.createSubject(createSubjectMsg.name));
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
	@RequestMapping(value="/querySubject",method=RequestMethod.GET)	
	public String querySubject(QuerySubjectMessage querySubjectMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSubjectCRUDService.querySubject(querySubjectMsg.name));
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
	@RequestMapping(value="/modifySubject",method=RequestMethod.PUT)	
	public String modifySubject(ModifySubjectMessage modifySubjectMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSubjectCRUDService.modifySubject(modifySubjectMsg.name));
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
	@RequestMapping(value="/deleteSubject",method=RequestMethod.DELETE)	
	public String deleteSubject(DeleteSubjectMessage deleteSubjectMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSubjectCRUDService.deleteSubject(deleteSubjectMsg.name));
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
