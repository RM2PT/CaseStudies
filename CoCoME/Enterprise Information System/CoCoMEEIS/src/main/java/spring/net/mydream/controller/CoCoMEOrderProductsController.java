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
@RequestMapping("/CoCoMEOrderProducts")
public class CoCoMEOrderProductsController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private CoCoMEOrderProducts coCoMEOrderProducts;
	
	@RequestMapping(value="/makeNewOrder",method=RequestMethod.POST)	
	public String makeNewOrder(MakeNewOrderMessage makeNewOrderMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMEOrderProducts.makeNewOrder(makeNewOrderMsg.orderid));
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
	@RequestMapping(value="/listAllOutOfStoreProducts",method=RequestMethod.GET)	
	public String listAllOutOfStoreProducts() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMEOrderProducts.listAllOutOfStoreProducts());
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
	@RequestMapping(value="/orderItem",method=RequestMethod.POST)	
	public String orderItem(OrderItemMessage orderItemMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMEOrderProducts.orderItem(orderItemMsg.barcode,orderItemMsg.quantity));
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
	@RequestMapping(value="/chooseSupplier",method=RequestMethod.PUT)	
	public String chooseSupplier(ChooseSupplierMessage chooseSupplierMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMEOrderProducts.chooseSupplier(chooseSupplierMsg.supplierID));
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
	@RequestMapping(value="/placeOrder",method=RequestMethod.PUT)	
	public String placeOrder() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", coCoMEOrderProducts.placeOrder());
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
