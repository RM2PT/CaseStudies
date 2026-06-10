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
public class ManageCashierCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createCashier(int id,String name) throws PreconditionException{
		Cashier cashier = (Cashier)GetData(DM.getCashierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashier) == true)
		{
			Cashier cas = new Cashier();
			cas.setId(id);
			cas.setName(name);
			DM.getCashierDao().save(cas);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Cashier queryCashier(int id) throws PreconditionException{
		Cashier cashier = (Cashier)GetData(DM.getCashierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashier) == false)
		{
			return cashier;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyCashier(int id,String name) throws PreconditionException{
		Cashier cashier = (Cashier)GetData(DM.getCashierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashier) == false)
		{
			cashier.setId(id);
			cashier.setName(name);
			DM.getCashierDao().save(cashier);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteCashier(int id) throws PreconditionException{
		Cashier cashier = (Cashier)GetData(DM.getCashierDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashier) == false && cashier!= null)
		{
			DM.getCashierDao().delete(cashier);
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
