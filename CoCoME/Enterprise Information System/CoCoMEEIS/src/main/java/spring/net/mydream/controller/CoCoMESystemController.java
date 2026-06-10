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
@RequestMapping("/CoCoMESystem")
public class CoCoMESystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private CoCoMESystem coCoMESystem;
	
	@RequestMapping(value="/openStore",method=RequestMethod.PUT)	
	public String openStore(OpenStoreMessage openStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.openStore(openStoreMsg.storeID));
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
	@RequestMapping(value="/closeStore",method=RequestMethod.PUT)	
	public String closeStore(CloseStoreMessage closeStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.closeStore(closeStoreMsg.storeID));
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
	@RequestMapping(value="/openCashDesk",method=RequestMethod.PUT)	
	public String openCashDesk(OpenCashDeskMessage openCashDeskMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.openCashDesk(openCashDeskMsg.cashDeskID));
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
	@RequestMapping(value="/closeCashDesk",method=RequestMethod.PUT)	
	public String closeCashDesk(CloseCashDeskMessage closeCashDeskMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.closeCashDesk(closeCashDeskMsg.cashDeskID));
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
	@RequestMapping(value="/changePrice",method=RequestMethod.PUT)	
	public String changePrice(ChangePriceMessage changePriceMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.changePrice(changePriceMsg.barcode,changePriceMsg.newPrice));
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
	@RequestMapping(value="/receiveOrderedProduct",method=RequestMethod.PUT)	
	public String receiveOrderedProduct(ReceiveOrderedProductMessage receiveOrderedProductMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.receiveOrderedProduct(receiveOrderedProductMsg.orderID));
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
	@RequestMapping(value="/listSuppliers",method=RequestMethod.GET)	
	public String listSuppliers() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.listSuppliers());
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
	@RequestMapping(value="/showStockReports",method=RequestMethod.GET)	
	public String showStockReports() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMESystem.showStockReports());
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
