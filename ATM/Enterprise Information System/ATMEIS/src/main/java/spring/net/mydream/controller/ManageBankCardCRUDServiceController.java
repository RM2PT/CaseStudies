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
@RequestMapping("/ManageBankCardCRUDService")
public class ManageBankCardCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageBankCardCRUDService manageBankCardCRUDService;
	
	@RequestMapping(value="/createBankCard",method=RequestMethod.POST)	
	public String createBankCard(CreateBankCardMessage createBankCardMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBankCardCRUDService.createBankCard(createBankCardMsg.cardid,createBankCardMsg.cardstatus,createBankCardMsg.catalog,createBankCardMsg.password,createBankCardMsg.balance));
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
	@RequestMapping(value="/queryBankCard",method=RequestMethod.GET)	
	public String queryBankCard(QueryBankCardMessage queryBankCardMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBankCardCRUDService.queryBankCard(queryBankCardMsg.cardid));
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
	@RequestMapping(value="/modifyBankCard",method=RequestMethod.PUT)	
	public String modifyBankCard(ModifyBankCardMessage modifyBankCardMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBankCardCRUDService.modifyBankCard(modifyBankCardMsg.cardid,modifyBankCardMsg.cardstatus,modifyBankCardMsg.catalog,modifyBankCardMsg.password,modifyBankCardMsg.balance));
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
	@RequestMapping(value="/deleteBankCard",method=RequestMethod.DELETE)	
	public String deleteBankCard(DeleteBankCardMessage deleteBankCardMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBankCardCRUDService.deleteBankCard(deleteBankCardMsg.cardid));
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
