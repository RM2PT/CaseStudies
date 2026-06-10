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
@RequestMapping("/GenerateLoanLetterAndAgreementModule")
public class GenerateLoanLetterAndAgreementModuleController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private GenerateLoanLetterAndAgreementModule generateLoanLetterAndAgreementModule;
	
	@RequestMapping(value="/listApprovalRequest",method=RequestMethod.GET)	
	public String listApprovalRequest() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", generateLoanLetterAndAgreementModule.listApprovalRequest());
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
	@RequestMapping(value="/genereateApprovalLetter",method=RequestMethod.POST)	
	public String genereateApprovalLetter(GenereateApprovalLetterMessage genereateApprovalLetterMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", generateLoanLetterAndAgreementModule.genereateApprovalLetter(genereateApprovalLetterMsg.id));
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
	@RequestMapping(value="/emailToAppliant",method=RequestMethod.GET)	
	public String emailToAppliant() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", generateLoanLetterAndAgreementModule.emailToAppliant());
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
	@RequestMapping(value="/generateLoanAgreement",method=RequestMethod.POST)	
	public String generateLoanAgreement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", generateLoanLetterAndAgreementModule.generateLoanAgreement());
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
	@RequestMapping(value="/printLoanAgreement",method=RequestMethod.GET)	
	public String printLoanAgreement(PrintLoanAgreementMessage printLoanAgreementMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", generateLoanLetterAndAgreementModule.printLoanAgreement(printLoanAgreementMsg.number));
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
