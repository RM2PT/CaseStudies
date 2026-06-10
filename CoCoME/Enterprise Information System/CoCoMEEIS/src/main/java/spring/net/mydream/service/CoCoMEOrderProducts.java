package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Transactional
@Service
public class CoCoMEOrderProducts{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean makeNewOrder(int orderid) throws PreconditionException{
		OrderProduct CurrentOrderProduct=(OrderProduct)currentUtils.getAttribute("CurrentOrderProduct");
		
		if(true)
		{
			OrderProduct op = new OrderProduct();
			op.setOrderStatus(0);
			op.setId(orderid);
			op.setTime(new Date());
			DM.getOrderProductDao().save(op);
			currentUtils.setAttribute("CurrentOrderProduct" , op);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Item> listAllOutOfStoreProducts() throws PreconditionException{
		
		if(true)
		{
			return DM.getItemDao().findByStockNumber(0);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean orderItem(int barcode,int quantity) throws PreconditionException{
		OrderProduct CurrentOrderProduct=(OrderProduct)currentUtils.getAttribute("CurrentOrderProduct");
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			OrderEntry order = new OrderEntry();
			order.setQuantity(quantity);
			order.setSubAmount(item.getOrderPrice() * quantity);
			order.setItem(item);
			DM.getOrderEntryDao().save(order);
			CurrentOrderProduct.getContainedEntries().add(order);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean chooseSupplier(int supplierID) throws PreconditionException{
		OrderProduct CurrentOrderProduct=(OrderProduct)currentUtils.getAttribute("CurrentOrderProduct");
		Supplier sup = (Supplier)GetData(DM.getSupplierDao().findById(supplierID));
		
		if(StandardOPs.oclIsUndefined(sup) == false && StandardOPs.oclIsUndefined(CurrentOrderProduct) == false)
		{
			CurrentOrderProduct.setSupplier(sup);
			DM.getOrderProductDao().save(CurrentOrderProduct);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean placeOrder() throws PreconditionException{
		OrderProduct CurrentOrderProduct=(OrderProduct)currentUtils.getAttribute("CurrentOrderProduct");
		
		if(StandardOPs.oclIsUndefined(CurrentOrderProduct) == false)
		{
			CurrentOrderProduct.setOrderStatus(2);
			for(OrderEntry o : CurrentOrderProduct.getContainedEntries()){
				CurrentOrderProduct.setAmount(CurrentOrderProduct.getAmount() + o.getSubAmount());
			
			};
			DM.getOrderProductDao().save(CurrentOrderProduct);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
