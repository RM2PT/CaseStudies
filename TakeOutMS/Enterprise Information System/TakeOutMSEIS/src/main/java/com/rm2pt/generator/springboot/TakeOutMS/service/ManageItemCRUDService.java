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
public class ManageItemCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createItem(int id,String name,double price,int stocknumber,double orderprice) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		Item item = (Item)GetData(DM.getItemDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(item) == true && StandardOPs.oclIsUndefined(CurrentStore) == false)
		{
			Item ite = new Item();
			ite.setId(id);
			ite.setName(name);
			ite.setPrice(price);
			ite.setStockNumber(stocknumber);
			ite.setOrderPrice(orderprice);
			ite.setItemtoStore(CurrentStore);
			DM.getItemDao().save(ite);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Item queryItem(int id) throws PreconditionException{
		Item item = (Item)GetData(DM.getItemDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			return item;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyItem(int id,String name,double price,int stocknumber,double orderprice) throws PreconditionException{
		Item item = (Item)GetData(DM.getItemDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			item.setId(id);
			item.setName(name);
			item.setPrice(price);
			item.setStockNumber(stocknumber);
			item.setOrderPrice(orderprice);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteItem(int id) throws PreconditionException{
		Item item = (Item)GetData(DM.getItemDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(item) == false && item!= null)
		{
			DM.getItemDao().delete(item);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
