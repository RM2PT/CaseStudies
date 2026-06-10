package spring.net.mydream.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.net.mydream.entity.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import spring.net.mydream.utils.DaoManage;

@RestController
@RequestMapping("/state")
	public class StateController {
		@Autowired 
		private DaoManage DM;
		@RequestMapping(value="/StoreTable",method=RequestMethod.GET)	
		public String StoreTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Store>list=DM.getStoreDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ProductCatalogTable",method=RequestMethod.GET)	
		public String ProductCatalogTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<ProductCatalog>list=DM.getProductCatalogDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CashDeskTable",method=RequestMethod.GET)	
		public String CashDeskTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CashDesk>list=DM.getCashDeskDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SaleTable",method=RequestMethod.GET)	
		public String SaleTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Sale>list=DM.getSaleDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CashierTable",method=RequestMethod.GET)	
		public String CashierTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Cashier>list=DM.getCashierDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SalesLineItemTable",method=RequestMethod.GET)	
		public String SalesLineItemTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<SalesLineItem>list=DM.getSalesLineItemDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ItemTable",method=RequestMethod.GET)	
		public String ItemTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Item>list=DM.getItemDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/PaymentTable",method=RequestMethod.GET)	
		public String PaymentTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Payment>list=DM.getPaymentDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OrderEntryTable",method=RequestMethod.GET)	
		public String OrderEntryTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<OrderEntry>list=DM.getOrderEntryDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SupplierTable",method=RequestMethod.GET)	
		public String SupplierTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Supplier>list=DM.getSupplierDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OrderProductTable",method=RequestMethod.GET)	
		public String OrderProductTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<OrderProduct>list=DM.getOrderProductDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	