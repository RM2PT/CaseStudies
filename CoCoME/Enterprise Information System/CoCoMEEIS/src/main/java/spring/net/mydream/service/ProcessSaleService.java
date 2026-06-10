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
public class ProcessSaleService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean makeNewSale() throws PreconditionException{
		CashDesk CurrentCashDesk=(CashDesk)currentUtils.getAttribute("CurrentCashDesk");
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		
		if(StandardOPs.oclIsUndefined(CurrentCashDesk) == false && CurrentCashDesk.getIsOpened() == true && (StandardOPs.oclIsUndefined(CurrentSale) == true || (StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == true)))
		{
			Sale s = new Sale();
			s.setBelongedCashDesk(CurrentCashDesk);
			CurrentCashDesk.getContainedSales().add(s);
			s.setIsComplete(false);
			s.setIsReadytoPay(false);
			DM.getSaleDao().save(s);
			currentUtils.setAttribute("CurrentSale" , s);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean enterItem(int barcode,int quantity) throws PreconditionException{
		SalesLineItem CurrentSaleLine=(SalesLineItem)currentUtils.getAttribute("CurrentSaleLine");
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == false && StandardOPs.oclIsUndefined(item) == false && item.getStockNumber() > 0)
		{
			SalesLineItem sli = new SalesLineItem();
			currentUtils.setAttribute("CurrentSaleLine" , sli);
			sli.setBelongedSale(CurrentSale);
			CurrentSale.getContainedSalesLine().add(sli);
			sli.setQuantity(quantity);
			sli.setBelongedItem(item);
			item.setStockNumber(item.getStockNumber() - quantity);
			sli.setSubamount(item.getPrice() * quantity);
			DM.getSalesLineItemDao().save(sli);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public double endSale() throws PreconditionException{
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		List<SalesLineItem> sls = new ArrayList<SalesLineItem>();
		sls = CurrentSale.getContainedSalesLine();
		List<Double> sub = new ArrayList<Double>();
		for ( SalesLineItem s:  sls){
			sub.add(s.getSubamount()); 
		}
		
		if(StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == false && CurrentSale.getIsReadytoPay() == false)
		{
			CurrentSale.setAmount(StandardOPs.sum(sub));
			CurrentSale.setIsReadytoPay(true);
			DM.getSaleDao().save(CurrentSale);
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
			cp.setBelongedSale(CurrentSale);
			CurrentSale.setAssoicatedPayment(cp);
			CurrentSale.setBelongedstore(CurrentStore);
			CurrentStore.getSales().add(CurrentSale);
			CurrentSale.setIsComplete(true);
			CurrentSale.setTime(new Date());
			cp.setBalance(amount-CurrentSale.getAmount());
			DM.getCashPaymentDao().save(cp);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean makeCardPayment(String cardAccountNumber,Date expiryDate,double fee) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		Sale CurrentSale=(Sale)currentUtils.getAttribute("CurrentSale");
		
		if(StandardOPs.oclIsUndefined(CurrentSale) == false && CurrentSale.getIsComplete() == false && CurrentSale.getIsReadytoPay() == true && ((ThirdPartyServices) serviceManage.getService("ThirdPartyServices")).thirdPartyCardPaymentService(cardAccountNumber,expiryDate,fee))
		{
			CardPayment cdp = new CardPayment();
			cdp.setAmountTendered(fee);
			cdp.setBelongedSale(CurrentSale);
			CurrentSale.setAssoicatedPayment(cdp);
			cdp.setCardAccountNumber(cardAccountNumber);
			cdp.setExpiryDate(expiryDate);
			DM.getCardPaymentDao().save(cdp);
			CurrentSale.setBelongedstore(CurrentStore);
			CurrentStore.getSales().add(CurrentSale);
			CurrentSale.setIsComplete(true);
			CurrentSale.setTime(new Date());
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
