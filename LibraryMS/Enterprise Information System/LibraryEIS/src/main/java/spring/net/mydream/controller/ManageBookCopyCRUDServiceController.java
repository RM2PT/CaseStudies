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
@RequestMapping("/ManageBookCopyCRUDService")
public class ManageBookCopyCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageBookCopyCRUDService manageBookCopyCRUDService;
	
	@RequestMapping(value="/addBookCopy",method=RequestMethod.POST)	
	public String addBookCopy(AddBookCopyMessage addBookCopyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCopyCRUDService.addBookCopy(addBookCopyMsg.callNo,addBookCopyMsg.barcode,addBookCopyMsg.location));
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
	@RequestMapping(value="/queryBookCopy",method=RequestMethod.GET)	
	public String queryBookCopy(QueryBookCopyMessage queryBookCopyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCopyCRUDService.queryBookCopy(queryBookCopyMsg.barcode));
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
	@RequestMapping(value="/modifyBookCopy",method=RequestMethod.PUT)	
	public String modifyBookCopy(ModifyBookCopyMessage modifyBookCopyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCopyCRUDService.modifyBookCopy(modifyBookCopyMsg.barcode,modifyBookCopyMsg.status,modifyBookCopyMsg.location,modifyBookCopyMsg.isreserved));
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
	@RequestMapping(value="/deleteBookCopy",method=RequestMethod.DELETE)	
	public String deleteBookCopy(DeleteBookCopyMessage deleteBookCopyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageBookCopyCRUDService.deleteBookCopy(deleteBookCopyMsg.barcode));
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
