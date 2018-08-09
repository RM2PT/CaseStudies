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
    
   
    @Test
    @Ignore
    public void TestTwoTabs() {
    	
            //add delay for less power computer
    		sleep(3000);
    	
    		moveTo("System Function");
    		
    		sleep(1000);
    		
    		clickOn("System Status");
    		
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
    
    
    public void validateAttribute(String attribute, String value) {
    	
   		TableView tvU = (TableView)((TitledPane)lookup("#object_statics").query()).getContent();
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(0);
		assertEquals(obU.get(attribute), value);
    	
    }
    
    public void validateAttribute(String attribute, String value, int order) {
    	
   		TableView tvU = (TableView)((TitledPane)lookup("#object_statics").query()).getContent();
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(order);
		assertEquals(obU.get(attribute), value);
    	
    }
    
    public void returnTrue() {
    	
    	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
		
    }
    
    @Test
    public void testPrepareData() {
    		
			//create store UM
    		clickOn("System Function");
    		new FxRobot().clickOn("#administrator").sleep(1000).doubleClickOn("manageStore").clickOn("createStore").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("UM Store").type(KeyCode.TAB).write("University of Macau").clickOn("#execute");
    		returnTrue();


			//create cashdesk
    		new FxRobot().doubleClickOn("manageCashDesk").clickOn("createCashDesk").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("CashDeskA").clickOn("#execute");
    		returnTrue();
    		
			//create cashdesk
    		new FxRobot().doubleClickOn("manageCashier").clickOn("createCashier").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Alice").clickOn("#execute");
    		returnTrue();
    		
    		//create catalog
    		new FxRobot().doubleClickOn("manageProductCatalog").clickOn("createProductCatalog").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Fruits").clickOn("#execute");
    		returnTrue();
    		
    		//create catalog
    		new FxRobot().doubleClickOn("manageItem").clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Apple").type(KeyCode.TAB).write("10").type(KeyCode.TAB).write("1000").type(KeyCode.TAB).write("6").clickOn("#execute");
    		returnTrue();
    		new FxRobot().clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("2").type(KeyCode.TAB).write("PineApple").type(KeyCode.TAB).write("30").type(KeyCode.TAB).write("1000").type(KeyCode.TAB).write("20").clickOn("#execute");
    		returnTrue();

    		//Check value
    		clickOn("System Status");
   
    		clickOn("Store");
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "UM Store");
    		sleep(1000);
    		
    		type(KeyCode.DOWN);
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "Fruits");
    		sleep(1000);
    		
    		type(KeyCode.DOWN);
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "CashDeskA");
    		sleep(1000);
    		
    		type(KeyCode.DOWN);
    		type(KeyCode.DOWN);
    		type(KeyCode.DOWN);
    		type(KeyCode.DOWN);
    		validateAttribute("Barcode", "1");
    		validateAttribute("Name", "Apple");
    		validateAttribute("Barcode", "2", 1);
    		validateAttribute("Name", "PineApple", 1);
    		sleep(1000);
    		
    		
    }
    
    @Test
    @Ignore
    public void testWithDraw() {
    	
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
    		
    		//check system status of balances
    		clickOn("System Status").clickOn("BankCard").sleep(1000);
    		
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
    
    @Test
    @Ignore
    public void testDeposit() {
    	
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
    		
    		//check system status of balances
    		clickOn("System Status").clickOn("BankCard").sleep(1000);
    		
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
