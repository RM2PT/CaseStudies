package gui;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;
import org.testfx.matcher.control.LabeledMatchers;
import org.testfx.matcher.control.TableViewMatchers;
import org.testfx.matcher.control.TextMatchers;

import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTest extends ApplicationTest {
	
//    public static void main(String[] args) throws Exception {
//        FxToolkit.registerPrimaryStage();
//        FxToolkit.setupApplication(Main.class);
// 
//    }
	
    @Override 
    public void start(Stage stage) throws Exception {
        new Main().start(stage);
    }
    
   
   
    public void TestTwoTabs() {
    	
    		moveTo("System Function");
    		
    		sleep(1000);
    		
    		clickOn("System State");
    		
    		sleep(1000);
    		
    		clickOn("System Function");
    		

    }
    

    
    @Test
    public void atestSubmitLoanRequest() {
    	
    	//enterLoanInformation
    	sleep(2000);
    	clickOn("#applicant").sleep(1000).doubleClickOn("submitLoanRequest").clickOn("enterLoanInformation").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Yilong Yang").type(KeyCode.TAB).write("10000").type(KeyCode.TAB).write("Buy Car").type(KeyCode.TAB).write("20000").type(KeyCode.TAB).write("65583353").type(KeyCode.TAB).write("University of Macau").type(KeyCode.TAB).write("100000").type(KeyCode.TAB).write("yylonly@gmail.com").type(KeyCode.TAB).write("work references").type(KeyCode.TAB).write("credit references").type(KeyCode.TAB).write("1111").type(KeyCode.TAB).write("2222").clickOn("#execute").sleep(2000);
    	
    	//check result
    	clickOn("System State").clickOn("LoanRequest").sleep(1000);
    	
    	//creditRequest
    	clickOn("System Function").sleep(1000).clickOn("creditRequest").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.DOWN).type(KeyCode.DOWN).type(KeyCode.DOWN).sleep(1000).clickOn("LoanRequest").sleep(1000).clickOn("RequestedCreditHistory").sleep(2000);
    	
    	//accountStatusRequest
    	clickOn("System Function").sleep(1000).clickOn("accountStatusRequest").sleep(1000).clickOn("#execute").sleep(1000);
    	
       	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.DOWN).type(KeyCode.DOWN).sleep(1000).clickOn("LoanRequest").sleep(1000).clickOn("RequestedCAHistory").sleep(2000);

    	//accountStatusRequest
    	clickOn("System Function").sleep(1000).clickOn("calculateScore").sleep(1000).clickOn("#execute").sleep(1000);
    	
       	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.UP).sleep(2000);
    	
    }
    
    @Test
    public void btestEnterValidatedCreditReference() {
    	    	    	
    	//listSubmittedLoanRequest
    	clickOn("#loanassistant").sleep(1000).doubleClickOn("enterValidatedCreditReferences").clickOn("listSubmitedLoanRequest").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//chooseLoanRequest		
    	clickOn("chooseLoanRequest").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
    	
    	//markRequestValid
    	clickOn("markRequestValid").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.UP).sleep(2000);

    }
    
    @Test
    public void ctestEnterValidatedCreditReference() {
    	    	    	
    	//prepare item
    	clickOn("System Function").sleep(1000).clickOn("#loanofficer").sleep(1000).doubleClickOn("manageLoanTerm").clickOn("createLoanTerm").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Term One").sleep(1000).clickOn("#execute").sleep(1000);

    	//EvaluateLoanRequestModule
    	doubleClickOn("evaluateLoanRequest").clickOn("listTenLoanRequest").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//chooseOneForReview		
    	clickOn("chooseOneForReview").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
    	
    	//checkCreditHistory
    	clickOn("checkCreditHistory").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//reviewCheckingAccount
    	clickOn("reviewCheckingAccount").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//listAvaiableLoanTerm
    	clickOn("listAvaiableLoanTerm").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//addLoanTerm		
    	clickOn("addLoanTerm").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
    	
    	//approveLoanRequest
    	clickOn("approveLoanRequest").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.UP).sleep(2000);

    }
    
    
    @Test
    public void dtestGenerateLoanLetterAndAgreement() {
    	    	    	
    	//GenerateLoanLetterAndAgreement
    	clickOn("System Function").sleep(1000).clickOn("#loanclerk").sleep(1000).doubleClickOn("generateLoanLetterAndAgreement").clickOn("listApprovalRequest").clickOn("#execute").sleep(1000);

    	//genereateApprovalLetter
    	clickOn("genereateApprovalLetter").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//emailToAppliant
    	clickOn("emailToAppliant").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//generateLoanAgreement
    	clickOn("generateLoanAgreement").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//printLoanAgreement
    	clickOn("printLoanAgreement").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").sleep(1000).clickOn("#execute").sleep(1000);
    	
    	//check result
//    	clickOn("System State").sleep(1000).clickOn("ApprovalLetter").sleep(2000).clickOn("LoanAgreement").sleep(2000);
//    	
//    	clickOn("System State");
//    	clickOn("Save Status");
//    	sleep(2000);
//    	type(KeyCode.L);
//    	type(KeyCode.O);
//    	type(KeyCode.A);
//    	type(KeyCode.N);
//    	sleep(1000);
//    	type(KeyCode.ENTER);
//    	sleep(1000);
    	
    }
    
    
    @Test
    public void ftestLoanManagementModule() {
    	    	    	
    	//BookNewLoan
    	clickOn("System Function").sleep(1000).clickOn("#loanclerk").sleep(1000).clickOn("bookNewLoan").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("2018-02-01").type(KeyCode.TAB).write("2018-03-01").type(KeyCode.TAB).write("30").clickOn("#execute").sleep(1000);

    	//check result
    	clickOn("System State").sleep(1000).clickOn("Loan").sleep(2000).clickOn("LoanAccount").sleep(2000);
    	
    	//generateStandardPaymentNotice and generateLateNotice
    	clickOn("System Function").sleep(1000).clickOn("#scheduler").sleep(2000).clickOn("generateStandardPaymentNotice").clickOn("#execute").sleep(1000).clickOn("generateLateNotice").clickOn("#execute").sleep(1000);

    	//loanPayment
    	clickOn("#loanclerk").sleep(1000).clickOn("loanPayment").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
    	
    	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.UP).sleep(2000);

    	//generateStandardPaymentNotice and generateLateNotice
    	clickOn("System Function").sleep(1000).clickOn("#loanclerk").sleep(1000).clickOn("closeOutLoan").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);

    	//check result
    	clickOn("System State").sleep(1000).type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.DOWN).type(KeyCode.UP).sleep(2000);
    }
    
    
//    @Test
//    public void testPrepareData() {
//    		
//		//create user Yilong
//    		new FxRobot().clickOn("#applicant").sleep(1000).clickOn("createUser").type(KeyCode.TAB).type(KeyCode.TAB).write("1");
//        	
//        	type(KeyCode.TAB);
//        	write("Yilong Yang");
//        	
//        	type(KeyCode.TAB);
//        	write("University of Macau");
//        	
//        	clickOn("#execute");
//        	
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//
//    		sleep(1000);
//    		
//    		clickOn("System State");
//    		clickOn("User");
//    		
//    		
//    		TableView tvU = (TableView)((TitledPane)lookup("#object_statics").query()).getContent();
//    		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(0);
//    		assertEquals(obU.get("UserID"), "1");
//    		
//    		sleep(1000);
//    		
//    		
//    		//create bank card for user1
//    		clickOn("System Function");
//    		
//    		
//    		clickOn("createBankCard");
//   		clickOn("#operation_paras"); 
//    		type(KeyCode.TAB);
//    		write("1");
//    		type(KeyCode.TAB);
//    		write("1");
//    		
//    		type(KeyCode.TAB);
//    		type(KeyCode.TAB);
//    		type(KeyCode.DOWN);
//    		type(KeyCode.DOWN);
//    		type(KeyCode.ENTER);
//
//    		type(KeyCode.TAB);
//    		write("123456");
//    		type(KeyCode.TAB);
//    		write("20000");
//    		
//
//    		
//    		clickOn("#execute");
//
//    		FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//
//    		sleep(1000);
//    		
//    		clickOn("System State");
//    		type(KeyCode.TAB);
//    		type(KeyCode.TAB);
//    		type(KeyCode.UP);
//    		
//    		
//    		TableView tv = (TableView)((TitledPane)lookup("#object_statics").query()).getContent();
//    		Map<String, String> ob = (Map<String, String>) tv.getItems().get(0);
//    		assertEquals(ob.get("CardID"), "1");
//    		
//    		sleep(1000);
//    		
//    }
    
//    @Test
//    public void testWithDraw() {
//    	
//    		//input card with id 1
//    		clickOn("#customer").sleep(1000).doubleClickOn("withdrawCash").clickOn("inputCard").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
//    		
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    		//input password 123456
//    		clickOn("inputPassword").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("123456").clickOn("#execute").sleep(1000);
//    		
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    		//withdraw 2000
//    		clickOn("withDraw").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("2000").clickOn("#execute").sleep(1000);
//    		
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    		//check System State of balances
//    		clickOn("System State").clickOn("BankCard").sleep(1000);
//    		
//    		//print recipt
//    		clickOn("System Function").clickOn("printReceipt").clickOn("#execute").sleep(1000);
//     	
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("2000.0"));
//    		
//    		//print recipt
//    		clickOn("ejectCard").clickOn("#execute").sleep(1000);
//     	
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    	
//    }
//    
//    @Test
//    public void testDeposit() {
//    	
//    		//input card with id 1
//    		doubleClickOn("depositFunds").clickOn("inputCard").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
//    		
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    		//input password 123456
//    		clickOn("inputPassword").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("123456").clickOn("#execute").sleep(1000);
//    		
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    		//withdraw 2000
//    		clickOn("deposit").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("2000").clickOn("#execute").sleep(1000);
//    		
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    		//check System State of balances
//    		clickOn("System State").clickOn("BankCard").sleep(1000);
//    		
//    		//print recipt
//    		clickOn("System Function").clickOn("printReceipt").clickOn("#execute").sleep(1000);
//     	
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("2000.0"));
//    		
//    		//print recipt
//    		clickOn("ejectCard").clickOn("#execute").sleep(1000);
//     	
//    		//verify return result
//        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
//    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
//    		
//    	    
//    		
//    }
}
