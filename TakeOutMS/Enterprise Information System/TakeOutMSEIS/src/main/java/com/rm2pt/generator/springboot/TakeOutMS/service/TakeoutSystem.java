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
public class TakeoutSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean acceptOrder(String name) throws PreconditionException{
		Dilivery CurrentDilivery=(Dilivery)currentUtils.getAttribute("CurrentDilivery");
		Sale order = DM.getSaleDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(order) == false && order.getIsAccept() == false)
		{
			order.setIsAccept(true);
			order.setSaletoDilivery(CurrentDilivery);
			CurrentDilivery.getDiliverytoSale().add(order);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean terminateOrder(String name) throws PreconditionException{
		Dilivery CurrentDilivery=(Dilivery)currentUtils.getAttribute("CurrentDilivery");
		Sale order = DM.getSaleDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(order) == false && order.getIsAccept() == true && order.getSaletoDilivery() == CurrentDilivery)
		{
			order.setIsComplete(true);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Sale> excursionPublicOrder(String id) throws PreconditionException{
		Dilivery di = (Dilivery)GetData(DM.getDiliveryDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(di) == false)
		{
			return DM.getSaleDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean enterStore(int id) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store) == false)
		{
			currentUtils.setAttribute("CurrentStore" , store);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Item search(String itemname) throws PreconditionException{
		Store CurrentStore=(Store)currentUtils.getAttribute("CurrentStore");
		Item item = DM.getItemDao().findByNameAndItemtoStore(itemname,CurrentStore);
		
		if(StandardOPs.oclIsUndefined(item) == false)
		{
			return item;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
