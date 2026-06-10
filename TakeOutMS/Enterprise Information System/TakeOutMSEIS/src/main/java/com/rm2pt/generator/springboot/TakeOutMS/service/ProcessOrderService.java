package com.rm2pt.generator.springboot.TakeOutMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;
import com.rm2pt.generator.springboot.TakeOutMS.utils.DaoManage;
import com.rm2pt.generator.springboot.TakeOutMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.TakeOutMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.TakeOutMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.TakeOutMS.redis.CurrentUtils;

@Transactional
@Service
public class ProcessOrderService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

			
	// public Boolean makeNewOrder() throws PreconditionException
	
	public Boolean enterItem(int id,int quantity) throws PreconditionException{
		OrderLineItem CurrentOrderLine=(OrderLineItem)currentUtils.getAttribute("CurrentOrderLine");
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		Item item = (Item)GetData(DM.getItemDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == false && StandardOPs.oclIsUndefined(item) == false && item.getStockNumber() > 0)
		{
			OrderLineItem sli = new OrderLineItem();
			currentUtils.setAttribute("CurrentOrderLine" , sli);
			sli.setOrderLineItemtoSale(CurrentSale);
			CurrentSale.getSaletoOrderLineItem().add(sli);
			sli.setQuantity(quantity);
			sli.setOrderLineItemtoItem(item);
			item.setStockNumber(item.getStockNumber() - quantity);
			sli.setSubamount(item.getPrice() * quantity);
			DM.getOrderLineItemDao().save(sli);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public double endOrder() throws PreconditionException{
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		List<OrderLineItem> sls = new ArrayList<OrderLineItem>();
		sls = CurrentSale.getSaletoOrderLineItem();
		List<Double> sub = new ArrayList<Double>();
		for ( OrderLineItem s:  sls){
			sub.add(s.getSubamount()); 
		}
		
		if(StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == false && CurrentSale.getIsReadytoPay() == false)
		{
			CurrentSale.setAmount(StandardOPs.sum(sub));
			CurrentSale.setIsReadytoPay(true);
			return CurrentSale.getAmount();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean makeCashPayment(double amount) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		
		if(StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == false && CurrentSale.getIsReadytoPay() == true && amount >= CurrentSale.getAmount())
		{
			CashPayment cp = new CashPayment();
			cp.setAmountTendered(amount);
			cp.setPaymenttoSale(CurrentSale);
			CurrentSale.setSaletoPayment(cp);
			CurrentSale.setSaletoStore(CurrentStore);
			CurrentStore.getStoretoSale().add(CurrentSale);
			cp.setBalance(amount-CurrentSale.getAmount());
			DM.getCashPaymentDao().save(cp);
			CurrentSale.setIsAccept(false);
			CurrentSale.setName(CurrentStore.getName());
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
