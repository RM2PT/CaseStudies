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
@RequestMapping("/ManageLoanTermCRUDService")
public class ManageLoanTermCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageLoanTermCRUDService manageLoanTermCRUDService;
	
	@RequestMapping(value="/createLoanTerm",method=RequestMethod.POST)	
	public String createLoanTerm(CreateLoanTermMessage createLoanTermMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLoanTermCRUDService.createLoanTerm(createLoanTermMsg.itemid,createLoanTermMsg.content));
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
	@RequestMapping(value="/queryLoanTerm",method=RequestMethod.GET)	
	public String queryLoanTerm(QueryLoanTermMessage queryLoanTermMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLoanTermCRUDService.queryLoanTerm(queryLoanTermMsg.itemid));
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
	@RequestMapping(value="/modifyLoanTerm",method=RequestMethod.PUT)	
	public String modifyLoanTerm(ModifyLoanTermMessage modifyLoanTermMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLoanTermCRUDService.modifyLoanTerm(modifyLoanTermMsg.itemid,modifyLoanTermMsg.content));
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
	@RequestMapping(value="/deleteLoanTerm",method=RequestMethod.DELETE)	
	public String deleteLoanTerm(DeleteLoanTermMessage deleteLoanTermMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageLoanTermCRUDService.deleteLoanTerm(deleteLoanTermMsg.itemid));
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
