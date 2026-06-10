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
@RequestMapping("/LibraryManagementSystemSystem")
public class LibraryManagementSystemSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private LibraryManagementSystemSystem libraryManagementSystemSystem;
	
	@RequestMapping(value="/dueSoonNotification",method=RequestMethod.GET)	
	public String dueSoonNotification() {
		
		
		JSONObject object = new JSONObject();
		try {
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
	@RequestMapping(value="/checkOverDueandComputeOverDueFee",method=RequestMethod.GET)	
	public String checkOverDueandComputeOverDueFee() {
		
		
		JSONObject object = new JSONObject();
		try {
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
	@RequestMapping(value="/countDownSuspensionDay",method=RequestMethod.GET)	
	public String countDownSuspensionDay() {
		
		
		JSONObject object = new JSONObject();
		try {
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
	@RequestMapping(value="/recommendBook",method=RequestMethod.POST)	
	public String recommendBook(RecommendBookMessage recommendBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", libraryManagementSystemSystem.recommendBook(recommendBookMsg.uid,recommendBookMsg.callNo,recommendBookMsg.title,recommendBookMsg.edition,recommendBookMsg.author,recommendBookMsg.publisher,recommendBookMsg.description,recommendBookMsg.isbn));
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
