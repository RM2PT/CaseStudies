package gui;

import static org.junit.Assert.assertEquals;

import java.util.Map;

//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.base.NodeMatchers;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import gui.supportclass.AssociationInfo;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.VerticalDirection;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

@ExtendWith(ApplicationExtension.class)
public class MainTest {
	
//    public static void main(String[] args) throws Exception {
//        FxToolkit.registerPrimaryStage();
//        FxToolkit.setupApplication(Main.class);
// 
//    }
	
    @Start
    public void onStart(Stage stage) {
        new Main().start(stage);
    }
    
    @Test
    public void should_contain_button() {
        // expect:
    	new FxRobot().clickOn("System Status");
    	new FxRobot().sleep(5000);
        
    }

   
    @Test
  
    public void test() {
    	
   	
    }
    
    
    @Test
    public void TestTwoTabs() {
    	
            //add delay for less power computer
    		new FxRobot().sleep(3000);
    	
    		new FxRobot().moveTo("System Function");
    		
    		new FxRobot().sleep(1000);
    		
    		new FxRobot().clickOn("System Status");
    		
    		new FxRobot().sleep(1000);
    		
    		new FxRobot().clickOn("System Function");
    		
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
    	
   		TableView tvU = (TableView)((TitledPane)new FxRobot().lookup("#object_statics").query()).getContent();
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(0);
		assertEquals(obU.get(attribute), value);
    	
    }
    
    public void validateAttribute(String attribute, String value, int order) {
    	
   		TableView tvU = (TableView)((TitledPane)new FxRobot().lookup("#object_statics").query()).getContent();
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(order);
		assertEquals(obU.get(attribute), value);
    	
    }
    
   public void validateAssociation(String association, int number) {
    	
   		TableView tvU = (TableView)((TitledPane)new FxRobot().lookup("#status_left_pane_association").query()).getContent();
   		
   		ObservableList<AssociationInfo> l =  tvU.getItems();
   		
   		
   		AssociationInfo obU = null;
   		
   		for (AssociationInfo m : l) {
   			
   			if (m.getAssociationName().equals(association)) {
   				
   				obU = m;
   				break;
   			}
   		}
		
		assertEquals(obU.getNumber(), number);
    	
    }
    
    public void returnTrue() {
    	
    	FxAssert.verifyThat((TitledPane)new FxRobot().lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane)new FxRobot().lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasChild("true"));
		
    }
    
    public void returnValue(String re) {
    	
    	FxAssert.verifyThat((TitledPane)new FxRobot().lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane)new FxRobot().lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasChild(re));
		
    }
    
    public void returnTable(String attribute, String value, int order) {
    	
    	TitledPane n = (TitledPane)new FxRobot().lookup("#operation_return_pane").query();
    	TableView tvU =  (TableView) n.getContent();
    	
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(order);
		assertEquals(obU.get(attribute), value);
    }
    
    public void loadData() {
    	
    	new FxRobot().clickOn("System Status");
    	new FxRobot().clickOn("Load Status");
    	new FxRobot().sleep(1000);
    	new FxRobot().type(KeyCode.DOWN);
    	new FxRobot().type(KeyCode.ENTER);
    	
    }
    
    public void saveData() {
    	
    	new FxRobot().clickOn("System Status");
    	new FxRobot().clickOn("Save Status");
    	new FxRobot().sleep(2000);
    	new FxRobot().type(KeyCode.C);
    	new FxRobot().type(KeyCode.O);
    	new FxRobot().type(KeyCode.C);
    	new FxRobot().type(KeyCode.O);
    	new FxRobot().type(KeyCode.M);
    	new FxRobot().type(KeyCode.E);
    	new FxRobot().sleep(1000);
    	new FxRobot().type(KeyCode.ENTER);
    	new FxRobot().sleep(1000);
    }
    
   public void saveDataFinal() {
    	
	   new FxRobot().clickOn("System Status");
	   new FxRobot().clickOn("Save Status");
	   new FxRobot().sleep(2000);
	   new FxRobot().type(KeyCode.C);
	   new FxRobot().type(KeyCode.O);
	   new FxRobot().type(KeyCode.C);
	   new FxRobot().type(KeyCode.O);
	   new FxRobot().type(KeyCode.M);
	   new FxRobot().type(KeyCode.E);
	   new FxRobot().type(KeyCode.F);
	   new FxRobot().type(KeyCode.I);
	   new FxRobot().type(KeyCode.N);
	   new FxRobot().sleep(1000);
	   new FxRobot().type(KeyCode.ENTER);
	   new FxRobot().sleep(1000);
    }
    
    @Test
    public void test_PrepareData() {
    		
			//create store UM
    	new FxRobot().clickOn("System Function");
    		new FxRobot().clickOn("#administrator").sleep(1000).doubleClickOn("manageStore").clickOn("createStore").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("UM Store").type(KeyCode.TAB).write("University of Macau").clickOn("#execute");
    		returnTrue();


			//create cashdesk
    		new FxRobot().doubleClickOn("manageCashDesk").clickOn("createCashDesk").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("CashDeskA").clickOn("#execute");
    		returnTrue();
    		
			//create cashdesk
    		new FxRobot().doubleClickOn("manageCashier").clickOn("createCashier").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Alice").clickOn("#execute");
    		returnTrue();
    		
    		new FxRobot().doubleClickOn("manageSupplier").clickOn("createSupplier").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("UM").clickOn("#execute");
    		returnTrue();
    		
    		//create catalog
    		new FxRobot().doubleClickOn("manageProductCatalog").clickOn("createProductCatalog").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Fruits").clickOn("#execute");
    		returnTrue();
    		
    		//create item
    		new FxRobot().doubleClickOn("manageItem").clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Apple").type(KeyCode.TAB).write("10").type(KeyCode.TAB).write("1000").type(KeyCode.TAB).write("6").clickOn("#execute");
    		returnTrue();
    		new FxRobot().clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("2").type(KeyCode.TAB).write("PineApple").type(KeyCode.TAB).write("30").type(KeyCode.TAB).write("1000").type(KeyCode.TAB).write("20").clickOn("#execute");
    		returnTrue();
    		new FxRobot().clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("3").type(KeyCode.TAB).write("Peach").type(KeyCode.TAB).write("12").type(KeyCode.TAB).write("0").type(KeyCode.TAB).write("8").clickOn("#execute");
    		returnTrue();
    		
    		
//    		new FxRobot().clickOn("createItem").scroll(100, VerticalDirection.DOWN);
    		//create supplie
    		
    		

    		//Check value
    		new FxRobot().clickOn("System Status");
   
    		new FxRobot().clickOn("Store");
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "UM Store");
    		new FxRobot().sleep(1000);
    		
    		new FxRobot().type(KeyCode.DOWN);
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "Fruits");
    		new FxRobot().sleep(1000);
    		
    		new FxRobot().type(KeyCode.DOWN);
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "CashDeskA");
    		new FxRobot().sleep(1000);
    		
    		new FxRobot().type(KeyCode.DOWN, 4);
    		validateAttribute("Barcode", "1");
    		validateAttribute("Name", "Apple");
    		validateAttribute("Barcode", "2", 1);
    		validateAttribute("Name", "PineApple", 1);
    		validateAttribute("Barcode", "3", 2);
    		validateAttribute("Name", "Peach", 2);
    		new FxRobot().sleep(1000);
    		
    		new FxRobot().type(KeyCode.DOWN, 5);
    		validateAttribute("Id", "1");
    		validateAttribute("Name", "UM");
    		new FxRobot().sleep(1000);  	
    		
    }
    
    public void test_OpenStoreAndCashiDesk() {

    	if (integrationTest == false) {
	    	//load data
	    	loadData();
    	}	
    	
    	//open store
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("openStore").doubleClickOn("#operation_paras").write("1").clickOn("#execute").sleep(500);
    	returnTrue();
    	new FxRobot().clickOn("System Status");
    	new FxRobot().clickOn("Store");
    	validateAttribute("IsOpened", "true");
    	new FxRobot().sleep(1500);
    	
    	//open cashdesk
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("#cashier").sleep(1000).clickOn("openCashDesk").clickOn("#operation_paras").write("1").clickOn("#execute").sleep(500);
    	returnTrue();
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB);
    	new FxRobot().type(KeyCode.TAB);
    	new FxRobot().type(KeyCode.DOWN);
    	new FxRobot().type(KeyCode.DOWN);
    	validateAttribute("IsOpened", "true");
    	new FxRobot().sleep(1500);
    	
    }
    
    @Test 
    public void test_ProcessSale_CashPay() {
    	
    	if (integrationTest == false) {
	    	//load data
	    	loadData();
	    	
	    	//open store
	    	new FxRobot().clickOn("System Function");
	    	new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("openStore").doubleClickOn("#operation_paras").write("1").clickOn("#execute").sleep(500);
	    	returnTrue();
	    	new FxRobot().clickOn("System Status");
	    	new FxRobot().clickOn("Store");
	    	validateAttribute("IsOpened", "true");
	    	new FxRobot().sleep(1500).
	    	
	    	//open cashdesk
	    	clickOn("System Function").
	    	clickOn("#cashier").sleep(1000).clickOn("openCashDesk").clickOn("#operation_paras").write("1").clickOn("#execute").sleep(500);
	    	returnTrue();
	    	new FxRobot().clickOn("System Status").
	    	type(KeyCode.TAB).
			type(KeyCode.TAB).
	    	type(KeyCode.DOWN).
			type(KeyCode.DOWN);
	    	validateAttribute("IsOpened", "true");
	    	new FxRobot().sleep(1500);
    	}
    	
    	//make a new sale
    	new FxRobot().clickOn("System Function");	
		new FxRobot().doubleClickOn("processSale").clickOn("makeNewSale").clickOn("#execute");
		returnTrue();
		new FxRobot().clickOn("System Status").
		type(KeyCode.TAB).
		type(KeyCode.TAB).
    	type(KeyCode.DOWN);
    	validateAttribute("IsComplete", "false");
    	validateAttribute("IsReadytoPay", "false");
    	new FxRobot().sleep(1000);
		
    	//make enterItem (10 apple, 2 pine apple)
    	new FxRobot().clickOn("System Function").	
    	clickOn("enterItem").clickOn("#operation_paras").write("1").type(KeyCode.TAB).write("10").clickOn("#execute");
    	returnTrue();
    	new FxRobot().clickOn("System Status").
		type(KeyCode.TAB).
		type(KeyCode.TAB).
		type(KeyCode.DOWN).
		type(KeyCode.DOWN);
		validateAttribute("Quantity", "10");
    	validateAttribute("Subamount", "100.0");
    	new FxRobot().sleep(1000);
		
    	new FxRobot().clickOn("System Function");	
    	new FxRobot().clickOn("enterItem").doubleClickOn("#operation_paras").write("2").type(KeyCode.TAB).write("2").clickOn("#execute");
    	returnTrue();
    	new FxRobot().clickOn("System Status").
		type(KeyCode.TAB).
		type(KeyCode.TAB).
		type(KeyCode.UP).
		type(KeyCode.DOWN);
		validateAttribute("Quantity", "2", 1);
    	validateAttribute("Subamount", "60.0", 1);
    	new FxRobot().sleep(1000);
		
		//end sale 	
    	new FxRobot().clickOn("System Function");	
		new FxRobot().clickOn("endSale").clickOn("#execute");
		returnValue("160.0");
		new FxRobot().sleep(1000).
		clickOn("System Status").
		type(KeyCode.TAB).
		type(KeyCode.TAB).
    	type(KeyCode.UP).
    	type(KeyCode.UP);
    	validateAttribute("IsComplete", "false");
    	validateAttribute("IsReadytoPay", "true");
    	validateAttribute("Amount", "160.0");
    	new FxRobot().sleep(1000);
    	 	
		//make cash payment	
    	new FxRobot().clickOn("System Function");	
		new FxRobot().clickOn("makeCashPayment").doubleClickOn("#operation_paras").write("200").clickOn("#execute");
		returnTrue();
		new FxRobot().sleep(1000).
		clickOn("System Status").
		type(KeyCode.TAB).
		type(KeyCode.TAB).
    	type(KeyCode.DOWN, 5);
    	validateAttribute("AmountTendered", "200.0");
    	validateAttribute("Balance", "40.0");
    	new FxRobot().sleep(1000);   
    	
    	new FxRobot().type(KeyCode.UP, 5);
    	validateAttribute("IsComplete", "true");
    	validateAttribute("IsReadytoPay", "true");
    	validateAttribute("Amount", "160.0");
    	new FxRobot().sleep(1000);  	
    	
    }
    
    @Test 
    public void test_ProcessSale_CardPay() {
    	
    	if (integrationTest == false) {
    		
	    	//load data
	    	loadData(); 
	  	
	    	//open store
	    	new FxRobot().clickOn("System Function");
	    	new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("openStore").doubleClickOn("#operation_paras").write("1").clickOn("#execute").sleep(500);
	    	returnTrue();
	    	new FxRobot().clickOn("System Status");
	    	new FxRobot().clickOn("Store");
	    	validateAttribute("IsOpened", "true");
	    	new FxRobot().sleep(1500);
	    	
	    	//open cashdesk
	    	new FxRobot().clickOn("System Function");
	    	new FxRobot().clickOn("#cashier").sleep(1000).clickOn("openCashDesk").clickOn("#operation_paras").write("1").clickOn("#execute").sleep(500);
	    	returnTrue();
	    	new FxRobot().clickOn("System Status");
	    	new FxRobot().type(KeyCode.TAB);
	    	new FxRobot().type(KeyCode.TAB);
	    	new FxRobot().type(KeyCode.DOWN);
	    	new FxRobot().type(KeyCode.DOWN);
	    	validateAttribute("IsOpened", "true");
	    	new FxRobot().sleep(1500);
    	}
    	
    	//make a new sale
    	new FxRobot().clickOn("System Function");	
		new FxRobot().doubleClickOn("processSale").clickOn("makeNewSale").clickOn("#execute");
		returnTrue();
		new FxRobot().clickOn("System Status");
		new FxRobot().type(KeyCode.TAB);
		new FxRobot().type(KeyCode.TAB);
		new FxRobot().type(KeyCode.DOWN);
    	validateAttribute("IsComplete", "false");
    	validateAttribute("IsReadytoPay", "false");
    	new FxRobot().sleep(1000);
		
    	//make enterItem (10 apple, 2 pine apple)
    	new FxRobot().clickOn("System Function");	
    	new FxRobot().clickOn("enterItem").clickOn("#operation_paras").write("1").type(KeyCode.TAB).write("10").clickOn("#execute");
    	returnTrue();
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB);
    	new FxRobot().type(KeyCode.TAB);
    	new FxRobot().type(KeyCode.DOWN);
    	new FxRobot().type(KeyCode.DOWN);
		validateAttribute("Quantity", "10");
    	validateAttribute("Subamount", "100.0");
    	new FxRobot().sleep(1000);
		
    	new FxRobot().clickOn("System Function");	
    	new FxRobot().clickOn("enterItem").doubleClickOn("#operation_paras").write("2").type(KeyCode.TAB).write("2").clickOn("#execute");
    	returnTrue();
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB);
    	new FxRobot().type(KeyCode.TAB);
    	new FxRobot().type(KeyCode.UP);
    	new FxRobot().type(KeyCode.DOWN);
		validateAttribute("Quantity", "2", 1);
    	validateAttribute("Subamount", "60.0", 1);
    	new FxRobot().sleep(1000);
		
		//end sale 	
    	new FxRobot().clickOn("System Function");	
		new FxRobot().clickOn("endSale").clickOn("#execute");
		returnValue("160.0");
		new FxRobot().sleep(1000);
		new FxRobot().clickOn("System Status");
		new FxRobot().type(KeyCode.TAB);
		new FxRobot().type(KeyCode.TAB);
		new FxRobot().type(KeyCode.UP);
		new FxRobot().type(KeyCode.UP);
    	validateAttribute("IsComplete", "false");
    	validateAttribute("IsReadytoPay", "true");
    	validateAttribute("Amount", "160.0");
    	new FxRobot().sleep(1000);
    	 	
		//make cash payment	
    	new FxRobot().clickOn("System Function");	
		new FxRobot().clickOn("makeCardPayment").type(KeyCode.TAB, 4).write("23124331222122316540").type(KeyCode.TAB).write("2018-08-10").type(KeyCode.TAB).write("40").clickOn("#execute");
		returnTrue();
		new FxRobot().sleep(1000);
		new FxRobot().clickOn("System Status");
		new FxRobot().type(KeyCode.TAB);
		new FxRobot().type(KeyCode.TAB);
		new FxRobot().type(KeyCode.DOWN, 6);
    	validateAttribute("AmountTendered", "40.0");
    	validateAttribute("CardAccountNumber", "23124331222122316540");
    	new FxRobot().sleep(1000);   
    	
    	new FxRobot().type(KeyCode.UP, 6);
    	validateAttribute("IsComplete", "true");
    	validateAttribute("IsReadytoPay", "true");
    	validateAttribute("Amount", "160.0");
    	new FxRobot().sleep(1000);  	
    	
    }    
    
    
    @Test
    public void test_ProductManagers() {
    	
    	if (integrationTest == false) {
	    	//load data
	    	loadData();  
    	}
    	//stock reports
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("showStockReports").clickOn("#execute").sleep(1000);
    	returnTable("StockNumber", "0", 2);
    	
    	//list suppliers
    	new FxRobot().clickOn("listSuppliers").clickOn("#execute").sleep(1000);
    	returnTable("Name", "UM", 0);
    	
    	//make new order for peach
    	new FxRobot().doubleClickOn("orderProducts").clickOn("makeNewOrder").doubleClickOn("#operation_paras").write("1").clickOn("#execute").sleep(1000);
    	returnTrue();
    	
    	//check order
    	new FxRobot().clickOn("System Status");
    	new FxRobot().clickOn("OrderProduct");
    	validateAttribute("OrderStatus", "NEW");
    	new FxRobot().sleep(1000);
    	
    	//list all out of stock products
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("listAllOutOfStoreProducts").clickOn("#execute").sleep(1000);
    	returnTable("StockNumber", "0", 0);
    	
    	//orderItem
    	new FxRobot().clickOn("orderItem").doubleClickOn("#operation_paras").write("3").type(KeyCode.TAB).write("1000").clickOn("#execute").sleep(1000);
    	returnTrue();
    	
    	//check order item
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB, 2);
    	new FxRobot().type(KeyCode.UP, 2);
    	validateAttribute("Quantity", "1000");
    	validateAttribute("SubAmount", "8000.0");
    	new FxRobot().sleep(1000);
    	
    	//choose supplier
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("chooseSupplier").doubleClickOn("#operation_paras").write("1").clickOn("#execute").sleep(1000);
    	returnTrue();
    
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB, 2);
    	new FxRobot().type(KeyCode.DOWN, 2);
    	validateAssociation("Supplier", 1);
    	new FxRobot().sleep(1000);
    	
    	//place order
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("placeOrder").clickOn("#execute").sleep(1000);
    	returnTrue();
    	
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB, 2);
    	new FxRobot().type(KeyCode.UP, 1);
    	new FxRobot().type(KeyCode.DOWN, 1);
    	validateAttribute("OrderStatus", "REQUESTED");
    	new FxRobot().sleep(1000);
    	
    	//receive order
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("receiveOrderedProduct").doubleClickOn("#operation_paras").write("1").clickOn("#execute").sleep(1000);
    	returnTrue();
    	
    	new FxRobot().clickOn("System Status");
    	new FxRobot().type(KeyCode.TAB, 2);
    	new FxRobot().type(KeyCode.UP, 1);
    	new FxRobot().type(KeyCode.DOWN, 1);
    	validateAttribute("OrderStatus", "RECEIVED");
    	new FxRobot().sleep(1000);
    	
    	//stock reports
    	new FxRobot().clickOn("System Function");
    	new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("showStockReports").clickOn("#execute").sleep(1000);
    	returnTable("StockNumber", "1000", 2);
    	new FxRobot().sleep(1000);
    	
    }
    
    @Test
    public void integrationTest() {
    	
    	integrationTest = true;
    	
    	test_PrepareData();
//    	saveData();
//    	loadData();
    	
    	test_OpenStoreAndCashiDesk();
    	test_ProcessSale_CashPay();
    	test_ProductManagers();
    	
//    	saveDataFinal();
    	
    }
    
    private boolean integrationTest;
    
}