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
@RequestMapping("/EvaluateLoanRequestModule")
public class EvaluateLoanRequestModuleController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private EvaluateLoanRequestModule evaluateLoanRequestModule;
	
	@RequestMapping(value="/listTenLoanRequest",method=RequestMethod.GET)	
	public String listTenLoanRequest() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.listTenLoanRequest());
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
	@RequestMapping(value="/chooseOneForReview",method=RequestMethod.GET)	
	public String chooseOneForReview(ChooseOneForReviewMessage chooseOneForReviewMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.chooseOneForReview(chooseOneForReviewMsg.requestid));
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
	@RequestMapping(value="/checkCreditHistory",method=RequestMethod.GET)	
	public String checkCreditHistory() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.checkCreditHistory());
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
	@RequestMapping(value="/reviewCheckingAccount",method=RequestMethod.GET)	
	public String reviewCheckingAccount() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.reviewCheckingAccount());
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
	@RequestMapping(value="/listAvaiableLoanTerm",method=RequestMethod.GET)	
	public String listAvaiableLoanTerm() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.listAvaiableLoanTerm());
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
	@RequestMapping(value="/addLoanTerm",method=RequestMethod.POST)	
	public String addLoanTerm(AddLoanTermMessage addLoanTermMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.addLoanTerm(addLoanTermMsg.termid));
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
	@RequestMapping(value="/approveLoanRequest",method=RequestMethod.GET)	
	public String approveLoanRequest() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluateLoanRequestModule.approveLoanRequest());
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
