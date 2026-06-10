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
	@RequestMapping("/dueSoonNotification")
	public String dueSoonNotification() {
		return "views/dueSoonNotification";
	}
	@RequestMapping("/checkOverDueandComputeOverDueFee")
	public String checkOverDueandComputeOverDueFee() {
		return "views/checkOverDueandComputeOverDueFee";
	}
	@RequestMapping("/countDownSuspensionDay")
	public String countDownSuspensionDay() {
		return "views/countDownSuspensionDay";
	}
	@RequestMapping("/listBorrowHistory")
	public String listBorrowHistory() {
		return "views/listBorrowHistory";
	}
	@RequestMapping("/listHodingBook")
	public String listHodingBook() {
		return "views/listHodingBook";
	}
	@RequestMapping("/listOverDueBook")
	public String listOverDueBook() {
		return "views/listOverDueBook";
	}
	@RequestMapping("/listReservationBook")
	public String listReservationBook() {
		return "views/listReservationBook";
	}
	@RequestMapping("/listRecommendBook")
	public String listRecommendBook() {
		return "views/listRecommendBook";
	}
	@RequestMapping("/recommendBook")
	public String recommendBook() {
		return "views/recommendBook";
	}
	@RequestMapping("/createStudent")
	public String createStudent() {
		return "views/createStudent";
	}
	@RequestMapping("/modifyStudent")
	public String modifyStudent() {
		return "views/modifyStudent";
	}
	@RequestMapping("/createFaculty")
	public String createFaculty() {
		return "views/createFaculty";
	}
	@RequestMapping("/modifyFaculty")
	public String modifyFaculty() {
		return "views/modifyFaculty";
	}
	@RequestMapping("/sendNotificationEmail")
	public String sendNotificationEmail() {
		return "views/sendNotificationEmail";
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
	@RequestMapping("/createBook")
	public String createBook() {
		return "views/createBook";
	}
	@RequestMapping("/queryBook")
	public String queryBook() {
		return "views/queryBook";
	}
	@RequestMapping("/modifyBook")
	public String modifyBook() {
		return "views/modifyBook";
	}
	@RequestMapping("/deleteBook")
	public String deleteBook() {
		return "views/deleteBook";
	}
	@RequestMapping("/createSubject")
	public String createSubject() {
		return "views/createSubject";
	}
	@RequestMapping("/querySubject")
	public String querySubject() {
		return "views/querySubject";
	}
	@RequestMapping("/modifySubject")
	public String modifySubject() {
		return "views/modifySubject";
	}
	@RequestMapping("/deleteSubject")
	public String deleteSubject() {
		return "views/deleteSubject";
	}
	@RequestMapping("/addBookCopy")
	public String addBookCopy() {
		return "views/addBookCopy";
	}
	@RequestMapping("/queryBookCopy")
	public String queryBookCopy() {
		return "views/queryBookCopy";
	}
	@RequestMapping("/modifyBookCopy")
	public String modifyBookCopy() {
		return "views/modifyBookCopy";
	}
	@RequestMapping("/deleteBookCopy")
	public String deleteBookCopy() {
		return "views/deleteBookCopy";
	}
	@RequestMapping("/createLibrarian")
	public String createLibrarian() {
		return "views/createLibrarian";
	}
	@RequestMapping("/queryLibrarian")
	public String queryLibrarian() {
		return "views/queryLibrarian";
	}
	@RequestMapping("/modifyLibrarian")
	public String modifyLibrarian() {
		return "views/modifyLibrarian";
	}
	@RequestMapping("/deleteLibrarian")
	public String deleteLibrarian() {
		return "views/deleteLibrarian";
	}
	}