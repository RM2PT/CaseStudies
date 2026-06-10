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
@RequestMapping("/SubmitLoanRequestModule")
public class SubmitLoanRequestModuleController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private SubmitLoanRequestModule submitLoanRequestModule;
	
	@RequestMapping(value="/enterLoanInformation",method=RequestMethod.POST)	
	public String enterLoanInformation(EnterLoanInformationMessage enterLoanInformationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", submitLoanRequestModule.enterLoanInformation(enterLoanInformationMsg.requestid,enterLoanInformationMsg.name,enterLoanInformationMsg.loanamount,enterLoanInformationMsg.loanpurpose,enterLoanInformationMsg.income,enterLoanInformationMsg.phonenumber,enterLoanInformationMsg.postaladdress,enterLoanInformationMsg.zipcode,enterLoanInformationMsg.email,enterLoanInformationMsg.workreferences,enterLoanInformationMsg.creditreferences,enterLoanInformationMsg.checkingaccountnumber,enterLoanInformationMsg.securitynumber));
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
	@RequestMapping(value="/creditRequest",method=RequestMethod.POST)	
	public String creditRequest() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", submitLoanRequestModule.creditRequest());
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
	@RequestMapping(value="/accountStatusRequest",method=RequestMethod.POST)	
	public String accountStatusRequest() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", submitLoanRequestModule.accountStatusRequest());
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
	@RequestMapping(value="/calculateScore",method=RequestMethod.GET)	
	public String calculateScore() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", submitLoanRequestModule.calculateScore());
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
