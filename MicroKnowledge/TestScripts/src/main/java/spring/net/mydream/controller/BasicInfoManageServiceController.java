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
@RequestMapping("/BasicInfoManageService")
public class BasicInfoManageServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private BasicInfoManageService basicInfoManageService;
	
	@RequestMapping(value="/create",method=RequestMethod.POST)	
	public String create(CreateMessage createMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.create(createMsg.name));
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
	@RequestMapping(value="/find",method=RequestMethod.GET)	
	public String find(FindMessage findMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.find(findMsg.name));
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
	@RequestMapping(value="/update",method=RequestMethod.PUT)	
	public String update(UpdateMessage updateMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.update(updateMsg.name));
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
	@RequestMapping(value="/addComment",method=RequestMethod.POST)	
	public String addComment(AddCommentMessage addCommentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.addComment(addCommentMsg.name,addCommentMsg.content));
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
	@RequestMapping(value="/addProjectHistory",method=RequestMethod.POST)	
	public String addProjectHistory(AddProjectHistoryMessage addProjectHistoryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.addProjectHistory(addProjectHistoryMsg.title));
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
	@RequestMapping(value="/updateComment",method=RequestMethod.POST)	
	public String updateComment(UpdateCommentMessage updateCommentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.updateComment(updateCommentMsg.name,updateCommentMsg.content));
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
	@RequestMapping(value="/updateProjectHistory",method=RequestMethod.POST)	
	public String updateProjectHistory(UpdateProjectHistoryMessage updateProjectHistoryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.updateProjectHistory(updateProjectHistoryMsg.title));
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
	@RequestMapping(value="/addMK",method=RequestMethod.POST)	
	public String addMK(AddMKMessage addMKMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.addMK(addMKMsg.name,addMKMsg.content));
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
	@RequestMapping(value="/updateMK",method=RequestMethod.POST)	
	public String updateMK(UpdateMKMessage updateMKMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.updateMK(updateMKMsg.name,updateMKMsg.content));
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
	@RequestMapping(value="/listProjectHistory",method=RequestMethod.GET)	
	public String listProjectHistory() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.listProjectHistory());
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
	@RequestMapping(value="/listMK",method=RequestMethod.GET)	
	public String listMK() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.listMK());
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
	@RequestMapping(value="/addGroup",method=RequestMethod.POST)	
	public String addGroup(AddGroupMessage addGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.addGroup(addGroupMsg.name,addGroupMsg.creator));
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
	@RequestMapping(value="/updateGroup",method=RequestMethod.POST)	
	public String updateGroup(UpdateGroupMessage updateGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.updateGroup(updateGroupMsg.name,updateGroupMsg.creator));
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
	@RequestMapping(value="/listGroup",method=RequestMethod.GET)	
	public String listGroup() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.listGroup());
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
	@RequestMapping(value="/labelMK",method=RequestMethod.POST)	
	public String labelMK(LabelMKMessage labelMKMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.labelMK(labelMKMsg.mkname,labelMKMsg.teamname));
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
	@RequestMapping(value="/labelComment",method=RequestMethod.POST)	
	public String labelComment(LabelCommentMessage labelCommentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.labelComment(labelCommentMsg.cmname,labelCommentMsg.teamname));
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
	@RequestMapping(value="/addCommentReply",method=RequestMethod.POST)	
	public String addCommentReply(AddCommentReplyMessage addCommentReplyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", basicInfoManageService.addCommentReply(addCommentReplyMsg.cmname,addCommentReplyMsg.content));
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
