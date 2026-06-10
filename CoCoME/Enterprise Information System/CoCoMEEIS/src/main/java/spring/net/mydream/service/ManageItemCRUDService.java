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
public class ManageItemCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createItem(int barcode,String name,double price,int stocknumber,double orderprice) throws PreconditionException{
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(item) == true)
		{
			Item ite = new Item();
			ite.setBarcode(barcode);
			ite.setName(name);
			ite.setPrice(price);
			ite.setStockNumber(stocknumber);
			ite.setOrderPrice(orderprice);
			DM.getItemDao().save(ite);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Item queryItem(int barcode) throws PreconditionException{
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			return item;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyItem(int barcode,String name,double price,int stocknumber,double orderprice) throws PreconditionException{
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			item.setBarcode(barcode);
			item.setName(name);
			item.setPrice(price);
			item.setStockNumber(stocknumber);
			item.setOrderPrice(orderprice);
			DM.getItemDao().save(item);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteItem(int barcode) throws PreconditionException{
		Item item = DM.getItemDao().findByBarcode(barcode);
		
		if(StandardOPs.oclIsUndefined(item) == false && item!= null)
		{
			DM.getItemDao().delete(item);
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
