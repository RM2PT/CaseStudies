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
@RequestMapping("/ListBookHistory")
public class ListBookHistoryController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ListBookHistory listBookHistory;
	
	@RequestMapping(value="/listBorrowHistory",method=RequestMethod.GET)	
	public String listBorrowHistory(ListBorrowHistoryMessage listBorrowHistoryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", listBookHistory.listBorrowHistory(listBorrowHistoryMsg.uid));
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
	@RequestMapping(value="/listHodingBook",method=RequestMethod.GET)	
	public String listHodingBook(ListHodingBookMessage listHodingBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", listBookHistory.listHodingBook(listHodingBookMsg.uid));
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
	@RequestMapping(value="/listOverDueBook",method=RequestMethod.GET)	
	public String listOverDueBook(ListOverDueBookMessage listOverDueBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", listBookHistory.listOverDueBook(listOverDueBookMsg.uid));
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
	@RequestMapping(value="/listReservationBook",method=RequestMethod.GET)	
	public String listReservationBook(ListReservationBookMessage listReservationBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", listBookHistory.listReservationBook(listReservationBookMsg.uid));
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
	@RequestMapping(value="/listRecommendBook",method=RequestMethod.GET)	
	public String listRecommendBook(ListRecommendBookMessage listRecommendBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", listBookHistory.listRecommendBook(listRecommendBookMsg.uid));
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
