package spring.net.mydream.controller;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/main")
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/create")
	public String create() {
		return "views/create";
	}
	@RequestMapping("/find")
	public String find() {
		return "views/find";
	}
	@RequestMapping("/update")
	public String update() {
		return "views/update";
	}
	@RequestMapping("/changeVersion")
	public String changeVersion() {
		return "views/changeVersion";
	}
	@RequestMapping("/projectManagement")
	public String projectManagement() {
		return "views/projectManagement";
	}
	@RequestMapping("/relatedProjectCollection")
	public String relatedProjectCollection() {
		return "views/relatedProjectCollection";
	}
	@RequestMapping("/memberManage")
	public String memberManage() {
		return "views/memberManage";
	}
	@RequestMapping("/memberDynamics")
	public String memberDynamics() {
		return "views/memberDynamics";
	}
	@RequestMapping("/classification")
	public String classification() {
		return "views/classification";
	}
	@RequestMapping("/mKGraph")
	public String mKGraph() {
		return "views/mKGraph";
	}
	@RequestMapping("/mKRecommendation")
	public String mKRecommendation() {
		return "views/mKRecommendation";
	}
	@RequestMapping("/contentEdit")
	public String contentEdit() {
		return "views/contentEdit";
	}
	@RequestMapping("/teamForum")
	public String teamForum() {
		return "views/teamForum";
	}
	@RequestMapping("/businessDataManagement")
	public String businessDataManagement() {
		return "views/businessDataManagement";
	}
	@RequestMapping("/mKManagement")
	public String mKManagement() {
		return "views/mKManagement";
	}
	@RequestMapping("/teamDataManagement")
	public String teamDataManagement() {
		return "views/teamDataManagement";
	}
	@RequestMapping("/basicDataManagement")
	public String basicDataManagement() {
		return "views/basicDataManagement";
	}
	@RequestMapping("/logManagement")
	public String logManagement() {
		return "views/logManagement";
	}
	@RequestMapping("/userManagement")
	public String userManagement() {
		return "views/userManagement";
	}
	@RequestMapping("/researchTeamManagement")
	public String researchTeamManagement() {
		return "views/researchTeamManagement";
	}
	@RequestMapping("/addComment")
	public String addComment() {
		return "views/addComment";
	}
	@RequestMapping("/addProjectHistory")
	public String addProjectHistory() {
		return "views/addProjectHistory";
	}
	@RequestMapping("/updateComment")
	public String updateComment() {
		return "views/updateComment";
	}
	@RequestMapping("/updateProjectHistory")
	public String updateProjectHistory() {
		return "views/updateProjectHistory";
	}
	@RequestMapping("/addMK")
	public String addMK() {
		return "views/addMK";
	}
	@RequestMapping("/updateMK")
	public String updateMK() {
		return "views/updateMK";
	}
	@RequestMapping("/listProjectHistory")
	public String listProjectHistory() {
		return "views/listProjectHistory";
	}
	@RequestMapping("/listMK")
	public String listMK() {
		return "views/listMK";
	}
	@RequestMapping("/addGroup")
	public String addGroup() {
		return "views/addGroup";
	}
	@RequestMapping("/updateGroup")
	public String updateGroup() {
		return "views/updateGroup";
	}
	@RequestMapping("/listGroup")
	public String listGroup() {
		return "views/listGroup";
	}
	@RequestMapping("/labelMK")
	public String labelMK() {
		return "views/labelMK";
	}
	@RequestMapping("/labelComment")
	public String labelComment() {
		return "views/labelComment";
	}
	@RequestMapping("/addCommentReply")
	public String addCommentReply() {
		return "views/addCommentReply";
	}
	}