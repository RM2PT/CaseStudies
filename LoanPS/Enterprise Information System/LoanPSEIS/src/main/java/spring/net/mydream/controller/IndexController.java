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
	@RequestMapping("/enterLoanInformation")
	public String enterLoanInformation() {
		return "views/enterLoanInformation";
	}
	@RequestMapping("/creditRequest")
	public String creditRequest() {
		return "views/creditRequest";
	}
	@RequestMapping("/accountStatusRequest")
	public String accountStatusRequest() {
		return "views/accountStatusRequest";
	}
	@RequestMapping("/calculateScore")
	public String calculateScore() {
		return "views/calculateScore";
	}
	@RequestMapping("/listSubmitedLoanRequest")
	public String listSubmitedLoanRequest() {
		return "views/listSubmitedLoanRequest";
	}
	@RequestMapping("/chooseLoanRequest")
	public String chooseLoanRequest() {
		return "views/chooseLoanRequest";
	}
	@RequestMapping("/markRequestValid")
	public String markRequestValid() {
		return "views/markRequestValid";
	}
	@RequestMapping("/listTenLoanRequest")
	public String listTenLoanRequest() {
		return "views/listTenLoanRequest";
	}
	@RequestMapping("/chooseOneForReview")
	public String chooseOneForReview() {
		return "views/chooseOneForReview";
	}
	@RequestMapping("/checkCreditHistory")
	public String checkCreditHistory() {
		return "views/checkCreditHistory";
	}
	@RequestMapping("/reviewCheckingAccount")
	public String reviewCheckingAccount() {
		return "views/reviewCheckingAccount";
	}
	@RequestMapping("/listAvaiableLoanTerm")
	public String listAvaiableLoanTerm() {
		return "views/listAvaiableLoanTerm";
	}
	@RequestMapping("/addLoanTerm")
	public String addLoanTerm() {
		return "views/addLoanTerm";
	}
	@RequestMapping("/approveLoanRequest")
	public String approveLoanRequest() {
		return "views/approveLoanRequest";
	}
	@RequestMapping("/listApprovalRequest")
	public String listApprovalRequest() {
		return "views/listApprovalRequest";
	}
	@RequestMapping("/genereateApprovalLetter")
	public String genereateApprovalLetter() {
		return "views/genereateApprovalLetter";
	}
	@RequestMapping("/emailToAppliant")
	public String emailToAppliant() {
		return "views/emailToAppliant";
	}
	@RequestMapping("/generateLoanAgreement")
	public String generateLoanAgreement() {
		return "views/generateLoanAgreement";
	}
	@RequestMapping("/printLoanAgreement")
	public String printLoanAgreement() {
		return "views/printLoanAgreement";
	}
	@RequestMapping("/bookNewLoan")
	public String bookNewLoan() {
		return "views/bookNewLoan";
	}
	@RequestMapping("/generateStandardPaymentNotice")
	public String generateStandardPaymentNotice() {
		return "views/generateStandardPaymentNotice";
	}
	@RequestMapping("/generateLateNotice")
	public String generateLateNotice() {
		return "views/generateLateNotice";
	}
	@RequestMapping("/loanPayment")
	public String loanPayment() {
		return "views/loanPayment";
	}
	@RequestMapping("/closeOutLoan")
	public String closeOutLoan() {
		return "views/closeOutLoan";
	}
	@RequestMapping("/createLoanTerm")
	public String createLoanTerm() {
		return "views/createLoanTerm";
	}
	@RequestMapping("/queryLoanTerm")
	public String queryLoanTerm() {
		return "views/queryLoanTerm";
	}
	@RequestMapping("/modifyLoanTerm")
	public String modifyLoanTerm() {
		return "views/modifyLoanTerm";
	}
	@RequestMapping("/deleteLoanTerm")
	public String deleteLoanTerm() {
		return "views/deleteLoanTerm";
	}
	@RequestMapping("/getCheckingAccountStatus")
	public String getCheckingAccountStatus() {
		return "views/getCheckingAccountStatus";
	}
	@RequestMapping("/getCreditHistory")
	public String getCreditHistory() {
		return "views/getCreditHistory";
	}
	@RequestMapping("/sendEmail")
	public String sendEmail() {
		return "views/sendEmail";
	}
	@RequestMapping("/print")
	public String print() {
		return "views/print";
	}
	@RequestMapping("/createLoanAccount")
	public String createLoanAccount() {
		return "views/createLoanAccount";
	}
	@RequestMapping("/transferFunds")
	public String transferFunds() {
		return "views/transferFunds";
	}
	@RequestMapping("/listBookedLoans")
	public String listBookedLoans() {
		return "views/listBookedLoans";
	}
	}