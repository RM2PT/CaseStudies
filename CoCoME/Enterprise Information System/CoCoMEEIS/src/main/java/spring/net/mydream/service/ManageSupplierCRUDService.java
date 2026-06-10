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
public class ManageSupplierCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createSupplier(int id,String name) throws PreconditionException{
		Supplier supplier = (Supplier)GetData(DM.getSupplierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(supplier) == true)
		{
			Supplier sup = new Supplier();
			sup.setId(id);
			sup.setName(name);
			DM.getSupplierDao().save(sup);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Supplier querySupplier(int id) throws PreconditionException{
		Supplier supplier = (Supplier)GetData(DM.getSupplierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(supplier) == false)
		{
			return supplier;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifySupplier(int id,String name) throws PreconditionException{
		Supplier supplier = (Supplier)GetData(DM.getSupplierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(supplier) == false)
		{
			supplier.setId(id);
			supplier.setName(name);
			DM.getSupplierDao().save(supplier);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteSupplier(int id) throws PreconditionException{
		Supplier supplier = (Supplier)GetData(DM.getSupplierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(supplier) == false && supplier!= null)
		{
			DM.getSupplierDao().delete(supplier);
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
