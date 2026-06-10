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
	@RequestMapping("/inputCard")
	public String inputCard() {
		return "views/inputCard";
	}
	@RequestMapping("/inputPassword")
	public String inputPassword() {
		return "views/inputPassword";
	}
	@RequestMapping("/printReceipt")
	public String printReceipt() {
		return "views/printReceipt";
	}
	@RequestMapping("/checkBalance")
	public String checkBalance() {
		return "views/checkBalance";
	}
	@RequestMapping("/ejectCard")
	public String ejectCard() {
		return "views/ejectCard";
	}
	@RequestMapping("/withdrawCash")
	public String withdrawCash() {
		return "views/withdrawCash";
	}
	@RequestMapping("/depositFunds")
	public String depositFunds() {
		return "views/depositFunds";
	}
	@RequestMapping("/createBankCard")
	public String createBankCard() {
		return "views/createBankCard";
	}
	@RequestMapping("/queryBankCard")
	public String queryBankCard() {
		return "views/queryBankCard";
	}
	@RequestMapping("/modifyBankCard")
	public String modifyBankCard() {
		return "views/modifyBankCard";
	}
	@RequestMapping("/deleteBankCard")
	public String deleteBankCard() {
		return "views/deleteBankCard";
	}
	@RequestMapping("/createUser")
	public String createUser() {
		return "views/createUser";
	}
	@RequestMapping("/queryUser")
	public String queryUser() {
		return "views/queryUser";
	}
	@RequestMapping("/modifyUser")
	public String modifyUser() {
		return "views/modifyUser";
	}
	@RequestMapping("/deleteUser")
	public String deleteUser() {
		return "views/deleteUser";
	}
	@RequestMapping("/cardIdentification")
	public String cardIdentification() {
		return "views/cardIdentification";
	}
	}