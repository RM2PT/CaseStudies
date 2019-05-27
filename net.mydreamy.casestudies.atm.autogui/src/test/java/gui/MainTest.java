package gui;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;

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

import gui.Main;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainTest extends ApplicationTest {
	
//    public static void main(String[] args) throws Exception {
//        FxToolkit.registerPrimaryStage();
//        FxToolkit.setupApplication(Main.class);
// 
//    }
	
    @Override public void start(Stage stage) throws Exception {
        new Main().start(stage);
    }
    
   
  
    public void TestTwoTabs() {
    	
            //add delay for less power computer
    		sleep(5000);
    	
    		moveTo("System Function");
    		
    		sleep(1000);
    		
    		clickOn("System State");
    		
    		sleep(1000);
    		
    		clickOn("System Function");
    		
//    		doubleClickOn("withdrawCash");
//    		sleep(1000);
    		
        // given:
        //rightClickOn("#desktop").moveTo("New").clickOn("Text Document");
//        write("myTextfile.txt").push(ENTER);
//
//        // when:
//        drag(".file").dropTo("#trash-can");
//
//        // then:
    		
//        verifyThat("#desktop", hasChildren(0, ".file"));
    }
    
    @Test
    public void a_TestPrepareData() {
    		
			//create user Yilong
    		new FxRobot().clickOn("#bankclerk").sleep(1000).doubleClickOn("manageUser").clickOn("createUser").type(KeyCode.TAB).type(KeyCode.TAB).write("1");
        	
        	type(KeyCode.TAB);
        	write("Yilong Yang");
        	
        	type(KeyCode.TAB);
        	write("University of Macau");
        	
        	clickOn("#execute");
        	
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));

    		sleep(1000);
    		
    		clickOn("System State");
    		clickOn("User");
    		
    		
    		TableView tvU = (TableView)((TitledPane)lookup("#object_statics").query()).getContent();
    		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(0);
    		assertEquals(obU.get("UserID"), "1");
    		
    		sleep(1000);
    		
    		
    		//create bank card for user1
    		clickOn("System Function");
    		
    		
    		doubleClickOn("manageBankCard").clickOn("createBankCard");
    		clickOn("#operation_paras"); 
    		type(KeyCode.TAB);
    		write("1");
//    		type(KeyCode.TAB);
//    		write("1");
    		
    		type(KeyCode.TAB);
    		type(KeyCode.TAB);
    		type(KeyCode.DOWN);
    		type(KeyCode.DOWN);
    		type(KeyCode.ENTER);

    		type(KeyCode.TAB);
    		write("123456");
    		type(KeyCode.TAB);
    		write("20000");
    		
//    		GridPane gp = ((GridPane)((TitledPane)lookup("#operation_paras").query()).getContent());
//    		moveTo(((GridPane)((TitledPane)lookup("#operation_paras").query()).getContent()).getChildren().get(3));
    		
    		clickOn("#execute");

    		FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));

    		sleep(1000);
    		
    		clickOn("System State");
    		type(KeyCode.TAB);
    		type(KeyCode.TAB);
    		type(KeyCode.UP);
    		
    		
    		TableView tv = (TableView)((TitledPane)lookup("#object_statics").query()).getContent();
    		Map<String, String> ob = (Map<String, String>) tv.getItems().get(0);
    		assertEquals(ob.get("CardID"), "1");
    		
    		sleep(1000);
    		
//    		//save status
//    		clickOn("Save Status");
//    		sleep(2000);
//    		write("ATM");
//    		push(KeyCode.ENTER);
//    		sleep(2000);
    		
    		
    }
    
    @Test
    public void b_TestWithDraw() {
    	
    		//input card with id 1
    		clickOn("#customer").sleep(1000).doubleClickOn("withdrawCash").clickOn("inputCard").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
    		
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    		//input password 123456
    		clickOn("inputPassword").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("123456").clickOn("#execute").sleep(1000);
    		
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    		//withdraw 2000
    		clickOn("withDraw").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("2000").clickOn("#execute").sleep(1000);
    		
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    		//check System State of balances
    		clickOn("System State").clickOn("BankCard").sleep(1000);
    		
    		//print recipt
    		clickOn("System Function").clickOn("printReceipt").clickOn("#execute").sleep(1000);
     	
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("2000.0"));
    		
    		//print recipt
    		clickOn("ejectCard").clickOn("#execute").sleep(1000);
     	
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    	
    }
    
    
    public void c_TestDeposit() {
    	
    		//input card with id 1
    		doubleClickOn("depositFunds").clickOn("inputCard").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("1").clickOn("#execute").sleep(1000);
    		
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    		//input password 123456
    		clickOn("inputPassword").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("123456").clickOn("#execute").sleep(1000);
    		
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    		//withdraw 2000
    		clickOn("deposit").type(KeyCode.TAB).type(KeyCode.TAB).type(KeyCode.TAB).write("2000").clickOn("#execute").sleep(1000);
    		
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    		
    		//check System State of balances
    		clickOn("System State").clickOn("BankCard").sleep(1000);
    		
    		//print recipt
    		clickOn("System Function").clickOn("printReceipt").clickOn("#execute").sleep(1000);
     	
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("2000.0"));
    		
    		//print recipt
    		clickOn("ejectCard").clickOn("#execute").sleep(1000);
     	
    		//verify return result
        	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
    		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
    			
    }
}
