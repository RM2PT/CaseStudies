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
			DM.getStoreDao().save(store);
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
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
