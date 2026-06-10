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
@RequestMapping("/ProcessSaleService")
public class ProcessSaleServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ProcessSaleService processSaleService;
	
	@RequestMapping(value="/makeNewSale",method=RequestMethod.POST)	
	public String makeNewSale() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processSaleService.makeNewSale());
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
	@RequestMapping(value="/enterItem",method=RequestMethod.POST)	
	public String enterItem(EnterItemMessage enterItemMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processSaleService.enterItem(enterItemMsg.barcode,enterItemMsg.quantity));
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
	@RequestMapping(value="/endSale",method=RequestMethod.PUT)	
	public String endSale() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processSaleService.endSale());
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
	@RequestMapping(value="/makeCashPayment",method=RequestMethod.POST)	
	public String makeCashPayment(MakeCashPaymentMessage makeCashPaymentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processSaleService.makeCashPayment(makeCashPaymentMsg.amount));
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
	@RequestMapping(value="/makeCardPayment",method=RequestMethod.POST)	
	public String makeCardPayment(MakeCardPaymentMessage makeCardPaymentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", processSaleService.makeCardPayment(makeCardPaymentMsg.cardAccountNumber,makeCardPaymentMsg.expiryDate,makeCardPaymentMsg.fee));
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
