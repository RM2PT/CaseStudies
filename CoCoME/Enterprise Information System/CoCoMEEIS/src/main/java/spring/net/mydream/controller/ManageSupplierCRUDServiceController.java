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
@RequestMapping("/ManageSupplierCRUDService")
public class ManageSupplierCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageSupplierCRUDService manageSupplierCRUDService;
	
	@RequestMapping(value="/createSupplier",method=RequestMethod.POST)	
	public String createSupplier(CreateSupplierMessage createSupplierMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSupplierCRUDService.createSupplier(createSupplierMsg.id,createSupplierMsg.name));
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
	@RequestMapping(value="/querySupplier",method=RequestMethod.GET)	
	public String querySupplier(QuerySupplierMessage querySupplierMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSupplierCRUDService.querySupplier(querySupplierMsg.id));
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
	@RequestMapping(value="/modifySupplier",method=RequestMethod.PUT)	
	public String modifySupplier(ModifySupplierMessage modifySupplierMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSupplierCRUDService.modifySupplier(modifySupplierMsg.id,modifySupplierMsg.name));
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
	@RequestMapping(value="/deleteSupplier",method=RequestMethod.DELETE)	
	public String deleteSupplier(DeleteSupplierMessage deleteSupplierMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageSupplierCRUDService.deleteSupplier(deleteSupplierMsg.id));
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
