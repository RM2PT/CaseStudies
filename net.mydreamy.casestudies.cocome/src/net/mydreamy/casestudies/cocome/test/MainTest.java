package net.mydreamy.casestudies.cocome.test;

import java.time.LocalDateTime;

import entities.*;
import services.*;
import services.impl.CoCoMEManagementImpl;
import services.impl.CoCoMEProcessSaleImpl;


public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoCoMEManagement manage = new CoCoMEManagementImpl();
		CoCoMEProcessSale processale = new CoCoMEProcessSaleImpl();
		
		
		/* ----------------- Initial System --------------- */
		System.out.println("----------------- Initial System ---------------");
		/* create new store */
		Store s = new Store();
		s.setId(001);
		s.setName("UMStore");
		s.setAddress("Macau");
		System.out.println("create store UMStore: " + manage.createStore(s));
		
		/* create cash desk */
		CashDesk cashdesk = new CashDesk();
		cashdesk.setId(001);
		System.out.println("create cashdesk 001: " + manage.createCashDesk(cashdesk, 001));

		/* create Product Catalog*/
		ProductCatalog pc = new ProductCatalog();
		pc.setId(001);
		pc.setName("meat");
		System.out.println("create Product Catalog meat: " + manage.createProductCatalog(pc));

		/* create item beef meat */
		Item beef = new Item();
		beef.setBarcode(000001);
		beef.setDescription("beef meat");
		beef.setPrice(20);
		System.out.println("create item beef meat: " + manage.createItem(beef, 001));

		/* create item pock meat */
		Item pock = new Item();
		pock.setBarcode(000002);
		pock.setDescription("pock meat");
		pock.setPrice(15);
		System.out.println("create item pock meat: " + manage.createItem(pock, 001));
		
		/* create Product Catalog milk*/
		ProductCatalog milk = new ProductCatalog();
		pc.setId(002);
		pc.setName("milk");
		System.out.println("create Product Catalog milk: " + manage.createProductCatalog(milk));

		/* create item beef meat */
		Item yoghurt = new Item();
		yoghurt.setBarcode(000003);
		yoghurt.setDescription("yoghurt milk");
		yoghurt.setPrice(5);
		System.out.println("create yoghurt milk: " + manage.createItem(yoghurt, 002));

		/* create item pock meat */
		Item strawberry = new Item();
		strawberry.setBarcode(000004);
		strawberry.setDescription("strawberry milk");
		strawberry.setPrice(15);
		System.out.println("create strawberry milk: " + manage.createItem(strawberry, 002));
		
		
		/* ----------------- Test Process Sale --------------- */
		
		System.out.println("----------------- Inital Process Sale Service ---------------");
		System.out.println("set current store");
		processale.setCurrentStore(s);
		System.out.println("set current cashdesk");
		processale.setCurrentCashDesk(cashdesk);
		
		System.out.println("----------------- Test Process Sale - Cash Payment ----------");
		
		System.out.println("makeNewSale: " + processale.makeNewSale());
		System.out.println("enter 2 yoghurt milk: " + processale.enterItem(000003, 2));
		System.out.println("subamount: " + processale.getCurrentSaleLine().getSubamount());
		
		System.out.println("enter 5 pock meat: " + processale.enterItem(000002, 5));
		System.out.println("subamount: " + processale.getCurrentSaleLine().getSubamount());

		System.out.println("endSale: " + processale.endSale());

		System.out.println("amount: " + processale.getCurrentSale().getAmount());
		
		System.out.println("make cash payment: " + processale.makeCashPayment(90));
		
		System.out.println("tendered money: " + processale.getCurrentSale().getAssoicatedPayment().getAmountTendered());
		System.out.println("balance: " + ((CashPayment)processale.getCurrentSale().getAssoicatedPayment()).getBalance());

		System.out.println("Is sale complete: " + processale.getCurrentSale().getIsComplete());
		
		System.out.println("----------------- Test Process Sale - Card Payment ----------");
		
		System.out.println("makeNewSale: " + processale.makeNewSale());
		System.out.println("enter 2 yoghurt milk: " + processale.enterItem(000003, 2));
		System.out.println("subamount: " + processale.getCurrentSaleLine().getSubamount());
		
		System.out.println("enter 3 pock meat: " + processale.enterItem(000002, 3));
		System.out.println("subamount: " + processale.getCurrentSaleLine().getSubamount());

		System.out.println("endSale: " + processale.endSale());

		System.out.println("amount: " + processale.getCurrentSale().getAmount());
		
		System.out.println("Is sale complete: " + processale.getCurrentSale().getIsComplete());
		
		System.out.println("make card payment: " + processale.makeCardPayment("12348765987098731", LocalDateTime.now().plusYears(1)));
		
		System.out.println("Is sale complete: " + processale.getCurrentSale().getIsComplete());


		
	}

}
