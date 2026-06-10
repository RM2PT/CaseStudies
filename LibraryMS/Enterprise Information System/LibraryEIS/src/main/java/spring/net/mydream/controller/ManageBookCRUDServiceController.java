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
@RequestMapping("/ManageBookCRUDService")
public class ManageBookCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageBookCRUDService manageBookCRUDService;
	
	@RequestMapping(value="/createBook",method=RequestMethod.POST)	
	public String createBook(CreateBookMessage createBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCRUDService.createBook(createBookMsg.callno,createBookMsg.title,createBookMsg.edition,createBookMsg.author,createBookMsg.publisher,createBookMsg.description,createBookMsg.isbn,createBookMsg.copynum));
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
	@RequestMapping(value="/queryBook",method=RequestMethod.GET)	
	public String queryBook(QueryBookMessage queryBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCRUDService.queryBook(queryBookMsg.callno));
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
	@RequestMapping(value="/modifyBook",method=RequestMethod.PUT)	
	public String modifyBook(ModifyBookMessage modifyBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCRUDService.modifyBook(modifyBookMsg.callno,modifyBookMsg.title,modifyBookMsg.edition,modifyBookMsg.author,modifyBookMsg.publisher,modifyBookMsg.description,modifyBookMsg.isbn,modifyBookMsg.copynum));
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
	@RequestMapping(value="/deleteBook",method=RequestMethod.DELETE)	
	public String deleteBook(DeleteBookMessage deleteBookMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCRUDService.deleteBook(deleteBookMsg.callno));
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
