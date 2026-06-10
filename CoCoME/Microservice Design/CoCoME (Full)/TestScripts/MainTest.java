package gui;

import static org.junit.Assert.assertEquals;

import java.util.Map; 

import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;

import gui.Main;
import gui.supportclass.AssociationInfo;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

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

	@Test
	@Ignore
	public void test() {

	}

	@Test
	@Ignore
	public void TestTwoTabs() {

		// add delay for less power computer
		sleep(3000);

		moveTo("System Function");

		sleep(1000);

		clickOn("System State");

		sleep(1000);

		clickOn("System Function");

//    		doubleClickOn("withdrawCash");
//    		sleep(1000);

		// given:
		// rightClickOn("#desktop").moveTo("New").clickOn("Text Document");
//        write("myTextfile.txt").push(ENTER);
//
//        // when:
//        drag(".file").dropTo("#trash-can");
//
//        // then:

//        verifyThat("#desktop", hasChildren(0, ".file"));
	}

	public void validateAttribute(String attribute, String value) {

		TableView tvU = (TableView) ((TitledPane) lookup("#object_statics").query()).getContent();
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(0);
		assertEquals(obU.get(attribute), value);

	}

	public void validateAttribute(String attribute, String value, int order) {

		TableView tvU = (TableView) ((TitledPane) lookup("#object_statics").query()).getContent();
		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(order);
		assertEquals(obU.get(attribute), value);

	}

	public void validateAssociation(String association, int number) {

		TableView tvU = (TableView) ((TitledPane) lookup("#status_left_pane_association").query()).getContent();

		ObservableList<AssociationInfo> l = tvU.getItems();

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

		FxAssert.verifyThat((TitledPane) lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane) lookup("#operation_return_pane").query()).getContent(),
				NodeMatchers.hasChild("true"));

	}

	public void returnValue(String re) {

		FxAssert.verifyThat((TitledPane) lookup("#operation_return_pane").query(), NodeMatchers.isNotNull());
		FxAssert.verifyThat(((TitledPane) lookup("#operation_return_pane").query()).getContent(),
				NodeMatchers.hasChild(re));

	}

	public void returnTable(String attribute, String value, int order) {

		TitledPane n = (TitledPane) lookup("#operation_return_pane").query();
		TableView tvU = (TableView) n.getContent();

		Map<String, String> obU = (Map<String, String>) tvU.getItems().get(order);
		assertEquals(obU.get(attribute), value);
	}

	public void loadData() {

		clickOn("System State");
		clickOn("Load State");
		sleep(1000);
		type(KeyCode.C);
		type(KeyCode.O);
		type(KeyCode.C);
		type(KeyCode.O);
		type(KeyCode.M);
		type(KeyCode.E);
		type(KeyCode.DOWN);
		type(KeyCode.ENTER);

	}

	public void saveData() {

		clickOn("System State");
		clickOn("Save State");
		sleep(2000);
		type(KeyCode.C);
		type(KeyCode.O);
		type(KeyCode.C);
		type(KeyCode.O);
		type(KeyCode.M);
		type(KeyCode.E);
		sleep(1000);
		type(KeyCode.ENTER);
		sleep(1000);
	}

	public void saveDataFinal() {

		clickOn("System State");
		clickOn("Save Status");
		sleep(2000);
		type(KeyCode.C);
		type(KeyCode.O);
		type(KeyCode.C);
		type(KeyCode.O);
		type(KeyCode.M);
		type(KeyCode.E);
		type(KeyCode.F);
		type(KeyCode.I);
		type(KeyCode.N);
		sleep(1000);
		type(KeyCode.ENTER);
		sleep(1000);
	}

	@Test
	public void test_PrepareData() {

		sleep(1000);
		// create store UM
		clickOn("System Function");
		new FxRobot().clickOn("#administrator").sleep(1000).doubleClickOn("manageStore").clickOn("createStore")
				.type(KeyCode.TAB).type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("UM Store").type(KeyCode.TAB)
				.write("University of Macau").clickOn("#execute");
		returnTrue();

		// create cashdesk
		new FxRobot().doubleClickOn("manageCashDesk").clickOn("createCashDesk").type(KeyCode.TAB).type(KeyCode.TAB)
				.write("1").type(KeyCode.TAB).write("CashDeskA").clickOn("#execute");
		returnTrue();
		new FxRobot().doubleClickOn("manageCashDesk");

		// create cashdesk
		new FxRobot().doubleClickOn("manageCashier").clickOn("createCashier").type(KeyCode.TAB).type(KeyCode.TAB)
				.write("1").type(KeyCode.TAB).write("Alice").clickOn("#execute");
		returnTrue();
		new FxRobot().doubleClickOn("manageCashier");

		// create catalog
		new FxRobot().doubleClickOn("manageProductCatalog").clickOn("createProductCatalog").type(KeyCode.TAB)
				.type(KeyCode.TAB).write("1").type(KeyCode.TAB).write("Fruits").clickOn("#execute");
		returnTrue();
		new FxRobot().doubleClickOn("manageProductCatalog");

		// create item
		new FxRobot().doubleClickOn("manageItem").clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("1")
				.type(KeyCode.TAB).write("Apple").type(KeyCode.TAB).write("10").type(KeyCode.TAB).write("1000")
				.type(KeyCode.TAB).write("6").clickOn("#execute");
		returnTrue();
		new FxRobot().clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("2").type(KeyCode.TAB)
				.write("PineApple").type(KeyCode.TAB).write("30").type(KeyCode.TAB).write("1000").type(KeyCode.TAB)
				.write("20").clickOn("#execute");
		returnTrue();
		new FxRobot().clickOn("createItem").type(KeyCode.TAB).type(KeyCode.TAB).write("3").type(KeyCode.TAB)
				.write("Peach").type(KeyCode.TAB).write("12").type(KeyCode.TAB).write("0").type(KeyCode.TAB).write("8")
				.clickOn("#execute");
		returnTrue();
		new FxRobot().doubleClickOn("manageItem");

		// create supplier
		new FxRobot().doubleClickOn("manageSupplier").clickOn("createSupplier").type(KeyCode.TAB).type(KeyCode.TAB)
				.write("1").type(KeyCode.TAB).write("UM").clickOn("#execute");
		returnTrue();

		// Check value
		clickOn("System State");

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

		type(KeyCode.DOWN, 4);
		validateAttribute("Barcode", "1");
		validateAttribute("Name", "Apple");
		validateAttribute("Barcode", "2", 1);
		validateAttribute("Name", "PineApple", 1);
		validateAttribute("Barcode", "3", 2);
		validateAttribute("Name", "Peach", 2);
		sleep(1000);

		type(KeyCode.DOWN, 5);
		validateAttribute("Id", "1");
		validateAttribute("Name", "UM");
		sleep(1000);

	}

	public void test_OpenStoreAndCashiDesk() {

		if (integrationTest == false) {
			// load data
			loadData();
		}

		// open store
		clickOn("System Function");
		new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("openStore").sleep(1000).type(KeyCode.TAB, 3)
				.write("1").clickOn("#execute").sleep(500);
		returnTrue();
		clickOn("System State");
		clickOn("Store");
//		validateAttribute("IsOpened", "true");
		sleep(1000);

		// open cashdesk
		clickOn("System Function").sleep(1000);
		new FxRobot().clickOn("#cashier").sleep(1000).clickOn("openCashDesk").sleep(1000).type(KeyCode.TAB, 4)
				.write("1").clickOn("#execute").sleep(500);
		returnTrue();
		clickOn("System State");
		clickOn("CashDesk");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN);
		type(KeyCode.DOWN);
//		validateAttribute("IsOpened", "true");
//		sleep(1500);

	}

	@Test
	public void test_ProcessSale_CashPay() {

		if (integrationTest == false) {
			// load data
			loadData();

			// open store
			clickOn("System Function");
			new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("openStore").doubleClickOn("#operation_paras")
					.write("1").clickOn("#execute").sleep(500);
			returnTrue();
			clickOn("System State");
			
			clickOn("Store");
			validateAttribute("IsOpened", "true");
			sleep(1500);

			// open cashdesk
			clickOn("System Function");
			new FxRobot().clickOn("#cashier").sleep(1000).clickOn("openCashDesk").clickOn("#operation_paras").write("1")
					.clickOn("#execute").sleep(500);
			returnTrue();
			clickOn("System State");
			type(KeyCode.TAB);
			type(KeyCode.TAB);
			type(KeyCode.DOWN);
			type(KeyCode.DOWN);
			validateAttribute("IsOpened", "true");
			sleep(1500);
		}

		// make a new sale
		clickOn("System Function").sleep(2000);
		new FxRobot().doubleClickOn("processSale").clickOn("makeNewSale").clickOn("#execute");
		returnTrue();
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN);
//		validateAttribute("IsComplete", "false");
//		validateAttribute("IsReadytoPay", "false");
		sleep(1000);

		// make enterItem (10 apple, 2 pine apple)
		clickOn("System Function");
		new FxRobot().clickOn("enterItem").clickOn("#operation_paras").write("1").type(KeyCode.TAB).write("10")
				.clickOn("#execute");
		returnTrue();
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN);
		type(KeyCode.DOWN);
//		validateAttribute("Quantity", "10");
//		validateAttribute("Subamount", "100.0");
		sleep(1000);

		clickOn("System Function");
		new FxRobot().clickOn("enterItem").doubleClickOn("#operation_paras").write("2").type(KeyCode.TAB).write("2")
				.clickOn("#execute");
		returnTrue();
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.UP);
		type(KeyCode.DOWN);
//		validateAttribute("Quantity", "2", 1);
//		validateAttribute("Subamount", "60.0", 1);
		sleep(1000);

		// end sale
		clickOn("System Function");
		new FxRobot().clickOn("endSale").clickOn("#execute");
		returnValue("160.0");
		sleep(1000);
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.UP);
		type(KeyCode.UP);
//		validateAttribute("IsComplete", "false");
//		validateAttribute("IsReadytoPay", "true");
//		validateAttribute("Amount", "160.0");
		sleep(1000);

		// make cash payment
		clickOn("System Function");
		new FxRobot().clickOn("makeCashPayment").type(KeyCode.TAB, 4).write("200").clickOn("#execute");
		returnTrue();
		sleep(1000);
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN, 5);
//		validateAttribute("AmountTendered", "200.0");
//		validateAttribute("Balance", "40.0");
		sleep(1000);

		type(KeyCode.UP, 5);
		validateAttribute("IsComplete", "true");
		validateAttribute("IsReadytoPay", "true");
		validateAttribute("Amount", "160.0");
		sleep(1000);

	}

	public void test_ProcessSale_CardPay() {

		if (integrationTest == false) {

			// load data
			loadData();

			// open store
			clickOn("System Function");
			new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("openStore").doubleClickOn("#operation_paras")
					.write("1").clickOn("#execute").sleep(500);
			returnTrue();
			clickOn("System State");
			clickOn("Store");
			validateAttribute("IsOpened", "true");
			sleep(1500);

			// open cashdesk
			clickOn("System Function");
			new FxRobot().clickOn("#cashier").sleep(1000).clickOn("openCashDesk").clickOn("#operation_paras").write("1")
					.clickOn("#execute").sleep(500);
			returnTrue();
			clickOn("System State");
			type(KeyCode.TAB);
			type(KeyCode.TAB);
			type(KeyCode.DOWN);
			type(KeyCode.DOWN);
			validateAttribute("IsOpened", "true");
			sleep(1500);
		}

		// make a new sale
		clickOn("System Function");
		new FxRobot().doubleClickOn("processSale").clickOn("makeNewSale").clickOn("#execute");
		returnTrue();
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN);
		validateAttribute("IsComplete", "false");
		validateAttribute("IsReadytoPay", "false");
		sleep(1000);

		// make enterItem (10 apple, 2 pine apple)
		clickOn("System Function");
		new FxRobot().clickOn("enterItem").clickOn("#operation_paras").write("1").type(KeyCode.TAB).write("10")
				.clickOn("#execute");
		returnTrue();
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN);
		type(KeyCode.DOWN);
		validateAttribute("Quantity", "10");
		validateAttribute("Subamount", "100.0");
		sleep(1000);

		clickOn("System Function");
		new FxRobot().clickOn("enterItem").doubleClickOn("#operation_paras").write("2").type(KeyCode.TAB).write("2")
				.clickOn("#execute");
		returnTrue();
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.UP);
		type(KeyCode.DOWN);
		validateAttribute("Quantity", "2", 1);
		validateAttribute("Subamount", "60.0", 1);
		sleep(1000);

		// end sale
		clickOn("System Function");
		new FxRobot().clickOn("endSale").clickOn("#execute");
		returnValue("160.0");
		sleep(1000);
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.UP);
		type(KeyCode.UP);
		validateAttribute("IsComplete", "false");
		validateAttribute("IsReadytoPay", "true");
		validateAttribute("Amount", "160.0");
		sleep(1000);

		// make cash payment
		clickOn("System Function");
		new FxRobot().clickOn("makeCardPayment").type(KeyCode.TAB, 4).write("23124331222122316540").type(KeyCode.TAB)
				.write("2018-08-10").type(KeyCode.TAB).write("40").clickOn("#execute");
		returnTrue();
		sleep(1000);
		clickOn("System State");
		type(KeyCode.TAB);
		type(KeyCode.TAB);
		type(KeyCode.DOWN, 6);
		validateAttribute("AmountTendered", "40.0");
		validateAttribute("CardAccountNumber", "23124331222122316540");
		sleep(1000);

		type(KeyCode.UP, 6);
		validateAttribute("IsComplete", "true");
		validateAttribute("IsReadytoPay", "true");
		validateAttribute("Amount", "160.0");
		sleep(1000);

	}

	public void test_ProductManagers() {

		if (integrationTest == false) {
			// load data
			loadData();
		}
		// stock reports
		clickOn("System Function");
		new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("showStockReports").clickOn("#execute").sleep(1000);
		returnTable("StockNumber", "0", 2);

		// list suppliers
		new FxRobot().clickOn("listSuppliers").clickOn("#execute").sleep(1000);
		returnTable("Name", "UM", 0);

		// make new order for peach
		new FxRobot().doubleClickOn("orderProducts").clickOn("makeNewOrder").doubleClickOn("#operation_paras")
				.write("1").clickOn("#execute").sleep(1000);
		returnTrue();

		// check order
		clickOn("System State");
		clickOn("OrderProduct");
		validateAttribute("OrderStatus", "NEW");
		sleep(1000);

		// list all out of stock products
		clickOn("System Function");
		new FxRobot().clickOn("listAllOutOfStoreProducts").clickOn("#execute").sleep(1000);
		returnTable("StockNumber", "0", 0);

		// orderItem
		new FxRobot().clickOn("orderItem").doubleClickOn("#operation_paras").write("3").type(KeyCode.TAB).write("1000")
				.clickOn("#execute").sleep(1000);
		returnTrue();

		// check order item
		clickOn("System State");
		type(KeyCode.TAB, 2);
		type(KeyCode.UP, 2);
		validateAttribute("Quantity", "1000");
		validateAttribute("SubAmount", "8000.0");
		sleep(1000);

		// choose supplier
		clickOn("System Function");
		new FxRobot().clickOn("chooseSupplier").doubleClickOn("#operation_paras").write("1").clickOn("#execute")
				.sleep(1000);
		returnTrue();

		clickOn("System State");
		type(KeyCode.TAB, 2);
		type(KeyCode.DOWN, 2);
		validateAssociation("Supplier", 1);
		sleep(1000);

		// place order
		clickOn("System Function");
		new FxRobot().clickOn("placeOrder").clickOn("#execute").sleep(1000);
		returnTrue();

		clickOn("System State");
		type(KeyCode.TAB, 2);
		type(KeyCode.UP, 1);
		type(KeyCode.DOWN, 1);
		validateAttribute("OrderStatus", "REQUESTED");
		sleep(1000);

		// receive order
		clickOn("System Function");
		new FxRobot().clickOn("receiveOrderedProduct").doubleClickOn("#operation_paras").write("1").clickOn("#execute")
				.sleep(1000);
		returnTrue();

		clickOn("System State");
		type(KeyCode.TAB, 2);
		type(KeyCode.UP, 1);
		type(KeyCode.DOWN, 1);
		validateAttribute("OrderStatus", "RECEIVED");
		sleep(1000);

		// stock reports
		clickOn("System Function");
		new FxRobot().clickOn("#storemanager").sleep(1000).clickOn("showStockReports").clickOn("#execute").sleep(1000);
		returnTable("StockNumber", "1000", 2);
		sleep(1000);

	}

	@Test
	public void integrationTest() {

		integrationTest = true;

		test_PrepareData();
//		saveData();
//		loadData();

		test_OpenStoreAndCashiDesk();
		test_ProcessSale_CashPay();
		test_ProductManagers();

//    	saveDataFinal();

	}

	private boolean integrationTest;

}
