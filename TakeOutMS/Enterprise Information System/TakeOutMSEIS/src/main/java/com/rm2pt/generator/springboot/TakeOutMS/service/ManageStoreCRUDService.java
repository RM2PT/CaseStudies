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
public class ManageStoreCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createStore(int id,String name,String address,Boolean isopened) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store) == true)
		{
			Store sto = new Store();
			sto.setId(id);
			sto.setName(name);
			sto.setAddress(address);
			sto.setIsOpened(isopened);
			DM.getStoreDao().save(sto);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Store queryStore(int id) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store) == false)
		{
			return store;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyStore(int id,String name,String address,Boolean isopened) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store) == false)
		{
			store.setId(id);
			store.setName(name);
			store.setAddress(address);
			store.setIsOpened(isopened);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteStore(int id) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store) == false && store!= null)
		{
			DM.getStoreDao().delete(store);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
