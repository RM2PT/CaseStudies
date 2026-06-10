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
@RequestMapping("/LoanProcessingSystemSystem")
public class LoanProcessingSystemSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private LoanProcessingSystemSystem loanProcessingSystemSystem;
	
	@RequestMapping(value="/bookNewLoan",method=RequestMethod.POST)	
	public String bookNewLoan(BookNewLoanMessage bookNewLoanMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", loanProcessingSystemSystem.bookNewLoan(bookNewLoanMsg.requestid,bookNewLoanMsg.loanid,bookNewLoanMsg.accountid,bookNewLoanMsg.startdate,bookNewLoanMsg.enddate,bookNewLoanMsg.repaymentdays));
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
	@RequestMapping(value="/generateStandardPaymentNotice",method=RequestMethod.GET)	
	public String generateStandardPaymentNotice() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", loanProcessingSystemSystem.generateStandardPaymentNotice());
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
	@RequestMapping(value="/generateLateNotice",method=RequestMethod.GET)	
	public String generateLateNotice() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", loanProcessingSystemSystem.generateLateNotice());
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
	@RequestMapping(value="/loanPayment",method=RequestMethod.PUT)	
	public String loanPayment(LoanPaymentMessage loanPaymentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", loanProcessingSystemSystem.loanPayment(loanPaymentMsg.loanid));
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
	@RequestMapping(value="/closeOutLoan",method=RequestMethod.PUT)	
	public String closeOutLoan(CloseOutLoanMessage closeOutLoanMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", loanProcessingSystemSystem.closeOutLoan(closeOutLoanMsg.loanid));
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
	@RequestMapping(value="/listBookedLoans",method=RequestMethod.GET)	
	public String listBookedLoans() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", loanProcessingSystemSystem.listBookedLoans());
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
