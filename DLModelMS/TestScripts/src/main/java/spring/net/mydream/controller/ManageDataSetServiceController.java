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
@RequestMapping("/ManageDataSetService")
public class ManageDataSetServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageDataSetService manageDataSetService;
	
	@RequestMapping(value="/createDataSet",method=RequestMethod.POST)	
	public String createDataSet(CreateDataSetMessage createDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageDataSetService.createDataSet(createDataSetMsg.id,createDataSetMsg.content));
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
	@RequestMapping(value="/deleteDataSet",method=RequestMethod.DELETE)	
	public String deleteDataSet(DeleteDataSetMessage deleteDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageDataSetService.deleteDataSet(deleteDataSetMsg.id));
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
	@RequestMapping(value="/modifyDataSet",method=RequestMethod.PUT)	
	public String modifyDataSet(ModifyDataSetMessage modifyDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageDataSetService.modifyDataSet(modifyDataSetMsg.id,modifyDataSetMsg.content));
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
	@RequestMapping(value="/queryDataSet",method=RequestMethod.GET)	
	public String queryDataSet(QueryDataSetMessage queryDataSetMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageDataSetService.queryDataSet(queryDataSetMsg.id));
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
