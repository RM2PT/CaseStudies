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
@RequestMapping("/MicroKnowledgeSystem")
public class MicroKnowledgeSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private MicroKnowledgeSystem microKnowledgeSystem;
	
	@RequestMapping(value="/projectManagement",method=RequestMethod.GET)	
	public String projectManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.projectManagement());
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
	@RequestMapping(value="/relatedProjectCollection",method=RequestMethod.GET)	
	public String relatedProjectCollection() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.relatedProjectCollection());
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
	@RequestMapping(value="/memberManage",method=RequestMethod.GET)	
	public String memberManage() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.memberManage());
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
	@RequestMapping(value="/memberDynamics",method=RequestMethod.GET)	
	public String memberDynamics() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.memberDynamics());
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
	@RequestMapping(value="/classification",method=RequestMethod.GET)	
	public String classification() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.classification());
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
	@RequestMapping(value="/mKGraph",method=RequestMethod.GET)	
	public String mKGraph() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.mKGraph());
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
	@RequestMapping(value="/mKRecommendation",method=RequestMethod.GET)	
	public String mKRecommendation() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.mKRecommendation());
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
	@RequestMapping(value="/contentEdit",method=RequestMethod.POST)	
	public String contentEdit(ContentEditMessage contentEditMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.contentEdit(contentEditMsg.name,contentEditMsg.content));
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
	@RequestMapping(value="/teamForum",method=RequestMethod.GET)	
	public String teamForum() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.teamForum());
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
	@RequestMapping(value="/businessDataManagement",method=RequestMethod.GET)	
	public String businessDataManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.businessDataManagement());
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
	@RequestMapping(value="/mKManagement",method=RequestMethod.GET)	
	public String mKManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.mKManagement());
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
	@RequestMapping(value="/teamDataManagement",method=RequestMethod.GET)	
	public String teamDataManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.teamDataManagement());
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
	@RequestMapping(value="/basicDataManagement",method=RequestMethod.GET)	
	public String basicDataManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.basicDataManagement());
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
	@RequestMapping(value="/logManagement",method=RequestMethod.GET)	
	public String logManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.logManagement());
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
	@RequestMapping(value="/userManagement",method=RequestMethod.GET)	
	public String userManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.userManagement());
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
	@RequestMapping(value="/researchTeamManagement",method=RequestMethod.GET)	
	public String researchTeamManagement() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", microKnowledgeSystem.researchTeamManagement());
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
