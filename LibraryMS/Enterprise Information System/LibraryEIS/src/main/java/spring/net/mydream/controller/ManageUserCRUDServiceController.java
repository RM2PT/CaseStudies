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
@RequestMapping("/ManageUserCRUDService")
public class ManageUserCRUDServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManageUserCRUDService manageUserCRUDService;
	
	@RequestMapping(value="/createStudent",method=RequestMethod.POST)	
	public String createStudent(CreateStudentMessage createStudentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.createStudent(createStudentMsg.userID,createStudentMsg.name,createStudentMsg.sex,createStudentMsg.password,createStudentMsg.email,createStudentMsg.faculty,createStudentMsg.major,createStudentMsg.programme,createStudentMsg.registrationStatus));
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
	@RequestMapping(value="/modifyStudent",method=RequestMethod.PUT)	
	public String modifyStudent(ModifyStudentMessage modifyStudentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.modifyStudent(modifyStudentMsg.userID,modifyStudentMsg.name,modifyStudentMsg.sex,modifyStudentMsg.password,modifyStudentMsg.email,modifyStudentMsg.faculty,modifyStudentMsg.major,modifyStudentMsg.programme,modifyStudentMsg.registrationStatus));
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
	@RequestMapping(value="/createFaculty",method=RequestMethod.POST)	
	public String createFaculty(CreateFacultyMessage createFacultyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.createFaculty(createFacultyMsg.userID,createFacultyMsg.name,createFacultyMsg.sex,createFacultyMsg.password,createFacultyMsg.email,createFacultyMsg.faculty,createFacultyMsg.position,createFacultyMsg.status));
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
	@RequestMapping(value="/modifyFaculty",method=RequestMethod.PUT)	
	public String modifyFaculty(ModifyFacultyMessage modifyFacultyMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.modifyFaculty(modifyFacultyMsg.userID,modifyFacultyMsg.name,modifyFacultyMsg.sex,modifyFacultyMsg.password,modifyFacultyMsg.email,modifyFacultyMsg.faculty,modifyFacultyMsg.major,modifyFacultyMsg.position,modifyFacultyMsg.status));
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
	@RequestMapping(value="/createUser",method=RequestMethod.POST)	
	public String createUser(CreateUserMessage createUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.createUser(createUserMsg.userid,createUserMsg.name,createUserMsg.sex,createUserMsg.password,createUserMsg.email,createUserMsg.faculty,createUserMsg.loanednumber,createUserMsg.borrowstatus,createUserMsg.suspensiondays,createUserMsg.overduefee));
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
	@RequestMapping(value="/queryUser",method=RequestMethod.GET)	
	public String queryUser(QueryUserMessage queryUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.queryUser(queryUserMsg.userid));
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
	@RequestMapping(value="/modifyUser",method=RequestMethod.PUT)	
	public String modifyUser(ModifyUserMessage modifyUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.modifyUser(modifyUserMsg.userid,modifyUserMsg.name,modifyUserMsg.sex,modifyUserMsg.password,modifyUserMsg.email,modifyUserMsg.faculty,modifyUserMsg.loanednumber,modifyUserMsg.borrowstatus,modifyUserMsg.suspensiondays,modifyUserMsg.overduefee));
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
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)	
	public String deleteUser(DeleteUserMessage deleteUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manageUserCRUDService.deleteUser(deleteUserMsg.userid));
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
