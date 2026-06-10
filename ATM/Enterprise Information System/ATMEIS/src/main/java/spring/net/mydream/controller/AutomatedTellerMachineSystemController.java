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
@RequestMapping("/AutomatedTellerMachineSystem")
public class AutomatedTellerMachineSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private AutomatedTellerMachineSystem automatedTellerMachineSystem;
	
	@RequestMapping(value="/inputCard",method=RequestMethod.GET)	
	public String inputCard(InputCardMessage inputCardMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.inputCard(inputCardMsg.cardid));
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
	@RequestMapping(value="/inputPassword",method=RequestMethod.GET)	
	public String inputPassword(InputPasswordMessage inputPasswordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.inputPassword(inputPasswordMsg.password));
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
	@RequestMapping(value="/printReceipt",method=RequestMethod.GET)	
	public String printReceipt() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.printReceipt());
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
	@RequestMapping(value="/checkBalance",method=RequestMethod.GET)	
	public String checkBalance() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.checkBalance());
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
	@RequestMapping(value="/ejectCard",method=RequestMethod.GET)	
	public String ejectCard() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.ejectCard());
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
	@RequestMapping(value="/withdrawCash",method=RequestMethod.GET)	
	public String withdrawCash(WithdrawCashMessage withdrawCashMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.withdrawCash(withdrawCashMsg.quantity));
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
	@RequestMapping(value="/depositFunds",method=RequestMethod.GET)	
	public String depositFunds(DepositFundsMessage depositFundsMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.depositFunds(depositFundsMsg.quantity));
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
	@RequestMapping(value="/cardIdentification",method=RequestMethod.GET)	
	public String cardIdentification() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", automatedTellerMachineSystem.cardIdentification());
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
