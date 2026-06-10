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
@RequestMapping("/ThirdPartyServices")
public class ThirdPartyServicesController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ThirdPartyServices thirdPartyServices;
	
	@RequestMapping(value="/getCheckingAccountStatus",method=RequestMethod.GET)	
	public String getCheckingAccountStatus(GetCheckingAccountStatusMessage getCheckingAccountStatusMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", thirdPartyServices.getCheckingAccountStatus(getCheckingAccountStatusMsg.cid));
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
	@RequestMapping(value="/getCreditHistory",method=RequestMethod.GET)	
	public String getCreditHistory(GetCreditHistoryMessage getCreditHistoryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", thirdPartyServices.getCreditHistory(getCreditHistoryMsg.securityid,getCreditHistoryMsg.name));
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
	@RequestMapping(value="/sendEmail",method=RequestMethod.GET)	
	public String sendEmail(SendEmailMessage sendEmailMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", thirdPartyServices.sendEmail(sendEmailMsg.emailaddress,sendEmailMsg.title,sendEmailMsg.content));
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
	@RequestMapping(value="/print",method=RequestMethod.GET)	
	public String print(PrintMessage printMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", thirdPartyServices.print(printMsg.content,printMsg.numbers));
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
	@RequestMapping(value="/createLoanAccount",method=RequestMethod.GET)	
	public String createLoanAccount(CreateLoanAccountMessage createLoanAccountMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", thirdPartyServices.createLoanAccount(createLoanAccountMsg.id));
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
	@RequestMapping(value="/transferFunds",method=RequestMethod.GET)	
	public String transferFunds(TransferFundsMessage transferFundsMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", thirdPartyServices.transferFunds(transferFundsMsg.id,transferFundsMsg.amount));
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
