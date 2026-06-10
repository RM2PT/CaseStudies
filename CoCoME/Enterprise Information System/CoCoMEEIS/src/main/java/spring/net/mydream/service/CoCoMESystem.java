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
public class CoCoMESystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean openStore(int storeID) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		Store sto = (Store)GetData(DM.getStoreDao().findById(storeID));
		
		if(StandardOPs.oclIsUndefined(sto) == false && sto.getIsOpened() == false)
		{
			currentUtils.setAttribute("CurrentStore" , sto);
			sto.setIsOpened(true);
			DM.getStoreDao().save(sto);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean closeStore(int storeID) throws PreconditionException{
		Store sto = (Store)GetData(DM.getStoreDao().findById(storeID));
		
		if(StandardOPs.oclIsUndefined(sto) == false && sto.getIsOpened() == true)
		{
			sto.setIsOpened(false);
			DM.getStoreDao().save(sto);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean openCashDesk(int cashDeskID) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		CashDesk CurrentCashDesk=(CashDesk)currentUtils.getAttribute("CurrentCashDesk");
		CashDesk cd = (CashDesk)GetData(DM.getCashDeskDao().findById(cashDeskID));
		
		if(StandardOPs.oclIsUndefined(cd) == false && cd.getIsOpened() == false && StandardOPs.oclIsUndefined(CurrentStore) == false && CurrentStore.getIsOpened() == true)
		{
			currentUtils.setAttribute("CurrentCashDesk" , cd);
			cd.setIsOpened(true);
			DM.getCashDeskDao().save(cd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean closeCashDesk(int cashDeskID) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		CashDesk CurrentCashDesk=(CashDesk)currentUtils.getAttribute("CurrentCashDesk");
		CashDesk cd = (CashDesk)GetData(DM.getCashDeskDao().findById(cashDeskID));
		
		if(StandardOPs.oclIsUndefined(cd) == false && cd.getIsOpened() == true && StandardOPs.oclIsUndefined(CurrentStore) == false && CurrentStore.getIsOpened() == true)
		{
			currentUtils.setAttribute("CurrentCashDesk" , cd);
			cd.setIsOpened(false);
			DM.getCashDeskDao().save(cd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean changePrice(int barcode,double newPrice) throws PreconditionException{
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			item.setPrice(newPrice);
			DM.getItemDao().save(item);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean receiveOrderedProduct(int orderID) throws PreconditionException{
		OrderProduct op = (OrderProduct)GetData(DM.getOrderProductDao().findById(orderID));
		
		if(StandardOPs.oclIsUndefined(op) == false)
		{
			op.setOrderStatus(1);
			for(OrderEntry oe : op.getContainedEntries()){
				oe.getItem().setStockNumber(oe.getItem().getStockNumber() + oe.getQuantity());
			
				DM.getItemDao().save(oe.getItem());
			};
			DM.getOrderProductDao().save(op);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Supplier> listSuppliers() throws PreconditionException{
		
		if(true)
		{
			return DM.getSupplierDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Item> showStockReports() throws PreconditionException{
		
		if(true)
		{
			return DM.getItemDao().findAll();
			
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
