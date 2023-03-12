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
	@RequestMapping("/uploadModel")
	public String uploadModel() {
		return "views/uploadModel";
	}
	@RequestMapping("/deleteModel")
	public String deleteModel() {
		return "views/deleteModel";
	}
	@RequestMapping("/visitModel")
	public String visitModel() {
		return "views/visitModel";
	}
	@RequestMapping("/visitOnlineModel")
	public String visitOnlineModel() {
		return "views/visitOnlineModel";
	}
	@RequestMapping("/createAdministrator")
	public String createAdministrator() {
		return "views/createAdministrator";
	}
	@RequestMapping("/deleteAdministrator")
	public String deleteAdministrator() {
		return "views/deleteAdministrator";
	}
	@RequestMapping("/modifyModel")
	public String modifyModel() {
		return "views/modifyModel";
	}
	@RequestMapping("/downModel")
	public String downModel() {
		return "views/downModel";
	}
	@RequestMapping("/listOnlineModel")
	public String listOnlineModel() {
		return "views/listOnlineModel";
	}
	@RequestMapping("/listAllAdministrator")
	public String listAllAdministrator() {
		return "views/listAllAdministrator";
	}
	@RequestMapping("/listAllDataSet")
	public String listAllDataSet() {
		return "views/listAllDataSet";
	}
	@RequestMapping("/listAllAccess")
	public String listAllAccess() {
		return "views/listAllAccess";
	}
	@RequestMapping("/deployOnlineModel")
	public String deployOnlineModel() {
		return "views/deployOnlineModel";
	}
	@RequestMapping("/queryOnlineModel")
	public String queryOnlineModel() {
		return "views/queryOnlineModel";
	}
	@RequestMapping("/stopOnlineModel")
	public String stopOnlineModel() {
		return "views/stopOnlineModel";
	}
	@RequestMapping("/listAllAPI")
	public String listAllAPI() {
		return "views/listAllAPI";
	}
	@RequestMapping("/createAPI")
	public String createAPI() {
		return "views/createAPI";
	}
	@RequestMapping("/deleteAPI")
	public String deleteAPI() {
		return "views/deleteAPI";
	}
	@RequestMapping("/modifyAPI")
	public String modifyAPI() {
		return "views/modifyAPI";
	}
	@RequestMapping("/queryAPI")
	public String queryAPI() {
		return "views/queryAPI";
	}
	@RequestMapping("/createDataSet")
	public String createDataSet() {
		return "views/createDataSet";
	}
	@RequestMapping("/deleteDataSet")
	public String deleteDataSet() {
		return "views/deleteDataSet";
	}
	@RequestMapping("/modifyDataSet")
	public String modifyDataSet() {
		return "views/modifyDataSet";
	}
	@RequestMapping("/queryDataSet")
	public String queryDataSet() {
		return "views/queryDataSet";
	}
	@RequestMapping("/createAccess")
	public String createAccess() {
		return "views/createAccess";
	}
	@RequestMapping("/deleteAccess")
	public String deleteAccess() {
		return "views/deleteAccess";
	}
	@RequestMapping("/modifyAccess")
	public String modifyAccess() {
		return "views/modifyAccess";
	}
	@RequestMapping("/queryAccess")
	public String queryAccess() {
		return "views/queryAccess";
	}
	@RequestMapping("/serchModel")
	public String serchModel() {
		return "views/serchModel";
	}
	@RequestMapping("/downLoad")
	public String downLoad() {
		return "views/downLoad";
	}
	}