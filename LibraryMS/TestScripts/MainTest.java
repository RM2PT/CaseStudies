package gui;

import org.junit.*;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;
import org.testfx.matcher.control.LabeledMatchers;
import org.testfx.matcher.control.TableViewMatchers;
import org.testfx.matcher.control.TextMatchers;

import gui.supportclass.AssociationInfo;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.application.Platform;
import javafx.collections.ObservableList;
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
    
   public void validateAssociation(String association, int number) {
    	
   		TableView tvU = (TableView)((TitledPane)lookup("#status_left_pane_association").query()).getContent();
   		
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
    	
    	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText("true"));
		
    }
    
    public void returnValue(String re) {
    	
    	FxAssert.verifyThat((TitledPane)lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane)lookup("#operation_return_pane").query()).getContent(), NodeMatchers.hasText(re));
		
    }
    
    public void returnTable(String attribute, String value, int order) {
    	
    	TitledPane n = (TitledPane)lookup("#operation_return_pane").query();
    	TableView tvU =  (TableView) n.getContent();
    	
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(order);
		assertEquals(obU.get(attribute), value);
    }
    
    public void loadData() {
    	
    	clickOn("System State");
    	clickOn("Load Status");
    	sleep(1000);
    	type(KeyCode.DOWN);
    	type(KeyCode.ENTER);
    	
    }
    
    public void saveData() {
    	
    	clickOn("System State");
    	clickOn("Save Status");
    	sleep(2000);
    	type(KeyCode.L);
    	type(KeyCode.I);
    	type(KeyCode.B);
    	type(KeyCode.R);
    	type(KeyCode.A);
    	type(KeyCode.R);
    	type(KeyCode.Y);
    	sleep(1000);
    	type(KeyCode.ENTER);
    	sleep(1000);
    }
    
    public void saveData_borrow() {
    	
    	clickOn("System State");
    	clickOn("Save Status");
    	sleep(2000);
    	type(KeyCode.L);
    	type(KeyCode.I);
    	type(KeyCode.B);
    	type(KeyCode.R);
    	type(KeyCode.A);
    	type(KeyCode.R);
    	type(KeyCode.Y);
    	type(KeyCode.B);
    	sleep(1000);
    	type(KeyCode.ENTER);
    	sleep(1000);
    }
    
   public void saveDataFinal() {
    	
    	clickOn("System State");
    	clickOn("Save Status");
    	sleep(2000);
    	type(KeyCode.L);
    	type(KeyCode.I);
    	type(KeyCode.B);
    	type(KeyCode.R);
    	type(KeyCode.A);
    	type(KeyCode.R);
    	type(KeyCode.Y);
    	type(KeyCode.F);
    	type(KeyCode.I);
    	type(KeyCode.N);
    	sleep(1000);
    	type(KeyCode.ENTER);
    	sleep(1000);
    }
    
    @Test
    public void test_PrepareData() {
    		
			//create student
    		clickOn("System Function");
    		new FxRobot().clickOn("#administrator").sleep(1000).doubleClickOn("manageUser").clickOn("createStudent").type(KeyCode.TAB, 5).write("1").type(KeyCode.TAB).write("Yilong Yang").type(KeyCode.TAB).type(KeyCode.TAB).write("123456").type(KeyCode.TAB).write("yylonly@gmail.com").type(KeyCode.TAB).write("FST").type(KeyCode.TAB).write("Software Engineering").type(KeyCode.TAB).type(KeyCode.DOWN, 3).type(KeyCode.ENTER).type(KeyCode.TAB).type(KeyCode.DOWN, 2).type(KeyCode.ENTER).clickOn("#execute");
    		returnTrue();
    		new FxRobot().clickOn("#administrator").sleep(1000).clickOn("createStudent").type(KeyCode.TAB, 5).write("2").type(KeyCode.TAB).write("Alice").type(KeyCode.TAB).type(KeyCode.TAB).write("123456").type(KeyCode.TAB).write("alice@gmail.com").type(KeyCode.TAB).write("FST").type(KeyCode.TAB).write("Software Engineering").type(KeyCode.TAB).type(KeyCode.UP, 2).type(KeyCode.ENTER).type(KeyCode.TAB).type(KeyCode.ENTER).clickOn("#execute");
    		returnTrue();
    		new FxRobot().doubleClickOn("manageUser").sleep(1000);
    		
    		
    		
    		//create librarian
    		new FxRobot().sleep(1000).doubleClickOn("manageLibrarian").clickOn("createLibrarian").type(KeyCode.TAB, 5).write("1").type(KeyCode.TAB).write("Alice").type(KeyCode.TAB).write("123456").clickOn("#execute");
    		returnTrue();
    		new FxRobot().sleep(1000).doubleClickOn("manageLibrarian");

    		//create book
    		new FxRobot().sleep(1000).doubleClickOn("manageBook").clickOn("createBook").type(KeyCode.TAB, 5).write("QA76.758").type(KeyCode.TAB).write("Software engineering").type(KeyCode.TAB).write("6th ed").type(KeyCode.TAB).write("Ian Sommerville").type(KeyCode.TAB).write("Addison-Wesley").type(KeyCode.TAB).write("Computer Science Series").type(KeyCode.TAB).write("9781932159943").type(KeyCode.TAB).write("0").clickOn("#execute");
    		returnTrue();   		
    		new FxRobot().sleep(1000).doubleClickOn("manageBook");
    		
    		//create bookcopy
    		new FxRobot().sleep(1000).doubleClickOn("manageBookCopy").clickOn("addBookCopy").type(KeyCode.TAB, 5).write("QA76.758").type(KeyCode.TAB).write("1234567").type(KeyCode.TAB).write("3/F A2 Science & Medicine").clickOn("#execute");
    		returnTrue(); 
    		new FxRobot().sleep(1000).clickOn("addBookCopy").type(KeyCode.TAB, 5).write("QA76.758").type(KeyCode.TAB).write("7654321").type(KeyCode.TAB).write("3/F A2 Science & Medicine").clickOn("#execute");
    		returnTrue(); 
    		new FxRobot().sleep(1000).doubleClickOn("manageBookCopy").sleep(2000);
    		
    		new FxRobot().clickOn("#administrator").sleep(1000);
    		
    		//Check value
    		clickOn("System State");
   
    		clickOn("Student");
    		validateAttribute("UserID", "1");
    		validateAttribute("Name", "Yilong Yang");
    		sleep(1000);
    		
    		type(KeyCode.DOWN, 2);
    		validateAttribute("CallNo", "QA76.758");
    		validateAttribute("CopyNum", "2");
    		sleep(2000);
    		
    		type(KeyCode.DOWN, 2);
    		validateAttribute("Barcode", "1234567", 0);
    		validateAttribute("Barcode", "7654321", 1);
    		sleep(1000);
    		
    		type(KeyCode.DOWN, 5);
    		validateAttribute("LibrarianID", "1");
    		validateAttribute("Name", "Alice");
    		sleep(1000);
    		 	
        	if (isItegrationTest == false) 
        		saveData();
    		
    }
    
    @Test
    public void test_searchBook() {
    	  	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#student").sleep(1000).doubleClickOn("searchBook").clickOn("searchBookByBarCode").type(KeyCode.TAB, 6).write("1234567").clickOn("#execute").sleep(1000);
		returnTable("CallNo", "QA76.758", 0);
		
		new FxRobot().clickOn("searchBookByTitle").type(KeyCode.TAB, 6).write("Software engineering").clickOn("#execute").sleep(1000);
		returnTable("CallNo", "QA76.758", 0);
		
		new FxRobot().clickOn("searchBookByAuthor").type(KeyCode.TAB, 6).write("Ian Sommerville").clickOn("#execute").sleep(1000);
		returnTable("CallNo", "QA76.758", 0);
		
		new FxRobot().doubleClickOn("searchBook");
		
		new FxRobot().clickOn("#student").sleep(1000);
    	
    }
    
   
    @Test
    public void test_borrowBook() {
    	  	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#librarian").sleep(1000).clickOn("borrowBook").type(KeyCode.TAB, 4).write("1").type(KeyCode.TAB, 1).write("1234567").clickOn("#execute").sleep(1000);
		returnTrue();
		
		//Check value
		clickOn("System State");

		clickOn("Loan");
		validateAssociation("LoanedUser", 1);
		validateAssociation("LoanedCopy", 1);
		validateAttribute("IsReturned", "false");
		sleep(2000);
		type(KeyCode.UP);
		validateAttribute("Status", "LOANED");
		validateAttribute("IsReserved", "false");
		sleep(2000);
		
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#student").sleep(1000).doubleClickOn("listBookHistory").type(KeyCode.DOWN).type(KeyCode.TAB, 6).write("1").clickOn("#execute").sleep(1000);
		returnTable("IsReturned", "false", 0);	
		
    	if (isItegrationTest == false) 
    		saveData_borrow();
		
    }
    
   
    public void test_borrowBook(String ID, String barcode) {
    	  	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#librarian").sleep(1000).clickOn("borrowBook").type(KeyCode.TAB, 4).write(ID).type(KeyCode.TAB, 1).write(barcode).clickOn("#execute").sleep(1000);
		returnTrue();
		
		//Check value
		clickOn("System State");

		clickOn("Loan");
//		validateAssociation("LoanedUser", 1);
//		validateAssociation("LoanedCopy", 1);
		validateAttribute("IsReturned", "false");
		sleep(2000);
		type(KeyCode.UP);
		validateAttribute("Status", "LOANED");
		validateAttribute("IsReserved", "false");
		sleep(2000);
		
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#student").sleep(1000).doubleClickOn("listBookHistory").type(KeyCode.DOWN).type(KeyCode.TAB, 6).write("1").clickOn("#execute").sleep(1000);
		returnTable("IsReturned", "false", 0);	
		
    	if (isItegrationTest == false) 
    		saveData_borrow();
		
    }
    
    public void test_borrowBook(String ID, String barcode, String isreturned, String isreserved) {
	  	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#librarian").sleep(1000).clickOn("borrowBook").type(KeyCode.TAB, 4).write(ID).type(KeyCode.TAB, 1).write(barcode).clickOn("#execute").sleep(1000);
		returnTrue();
	
		
    }
    
 
    @Test
    public void test_returnBook() {
    	  	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#librarian").sleep(1000).clickOn("returnBook").type(KeyCode.TAB, 4).write("1234567").clickOn("#execute").sleep(1000);
		returnTrue();
		
		if (isItegrationTest == false) {
			//Check value
			clickOn("System State");
	
			clickOn("BookCopy");
			validateAttribute("Status", "AVAILABLE");
			sleep(2000);
			type(KeyCode.DOWN, 1);
			validateAttribute("IsReturned", "true");
			sleep(2000);
		}
				
    }
    
    
    @Test
    public void test_renewBook() {
    	  	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#librarian").sleep(1000).clickOn("renewBook").type(KeyCode.TAB, 4).write("1").type(KeyCode.TAB, 1).write("1234567").clickOn("#execute").sleep(1000);
		returnTrue();
		
		//Check value
		clickOn("System State");

		clickOn("Loan");
		validateAssociation("LoanedUser", 1);
		validateAssociation("LoanedCopy", 1);
		sleep(2000);
		
		
    }   
    
    @Test
    public void test_reservation() {
    	  	
    	
    	if (isItegrationTest == false) 
    		loadData();
    	
    	//Check value
		clickOn("System Function");

		new FxRobot().clickOn("#student").sleep(1000).clickOn("makeReservation").type(KeyCode.TAB, 6).write("2").type(KeyCode.TAB, 1).write("1234567").clickOn("#execute").sleep(1000);
		returnTrue();
		
		//Check value
		clickOn("System State");

		clickOn("BookCopy");
		type(KeyCode.UP).type(KeyCode.DOWN);
		validateAttribute("IsReserved", "true", 0);
		sleep(2000);
		
		
    }   
       
    @Test
    public void test_reserved_renew() {
    	
    	isItegrationTest = true;
    	
    	loadData();
    	test_reservation();
    	test_renewBook();
    	
    }
    
    @Test
    public void test_reservation_return_borrow() {
    	
    	isItegrationTest = true;
    	
    	loadData();
    	test_reservation();
    	test_returnBook();
    	test_borrowBook("2", "1234567");
    	sleep(2000);
    	
    }
    
    @Test
    public void test_integration() {
    	
    	isItegrationTest = true;
    	
    	test_PrepareData();
    	test_searchBook();
    	test_borrowBook();
//    	test_reservation();
    	test_returnBook();
//    	test_borrowBook("2", "1234567", "false", "true");
    	sleep(2000);
    	
    	
    }
    
    
    private boolean isItegrationTest;
  
}
