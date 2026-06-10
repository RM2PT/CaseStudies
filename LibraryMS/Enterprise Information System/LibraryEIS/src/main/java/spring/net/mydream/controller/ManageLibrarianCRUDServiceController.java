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
@RequestMapping("/ManageLibrarianCRUDService")
public class ManageLibrarianCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageLibrarianCRUDService manageLibrarianCRUDService;
	
	@RequestMapping(value="/createLibrarian",method=RequestMethod.POST)	
	public String createLibrarian(CreateLibrarianMessage createLibrarianMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLibrarianCRUDService.createLibrarian(createLibrarianMsg.librarianid,createLibrarianMsg.name,createLibrarianMsg.password));
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
	@RequestMapping(value="/queryLibrarian",method=RequestMethod.GET)	
	public String queryLibrarian(QueryLibrarianMessage queryLibrarianMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLibrarianCRUDService.queryLibrarian(queryLibrarianMsg.librarianid));
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
	@RequestMapping(value="/modifyLibrarian",method=RequestMethod.PUT)	
	public String modifyLibrarian(ModifyLibrarianMessage modifyLibrarianMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLibrarianCRUDService.modifyLibrarian(modifyLibrarianMsg.librarianid,modifyLibrarianMsg.name,modifyLibrarianMsg.password));
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
	@RequestMapping(value="/deleteLibrarian",method=RequestMethod.DELETE)	
	public String deleteLibrarian(DeleteLibrarianMessage deleteLibrarianMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLibrarianCRUDService.deleteLibrarian(deleteLibrarianMsg.librarianid));
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
