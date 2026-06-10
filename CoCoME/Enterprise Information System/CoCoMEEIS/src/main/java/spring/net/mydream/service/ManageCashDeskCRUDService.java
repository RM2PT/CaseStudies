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
public class ManageCashDeskCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createCashDesk(int id,String name,Boolean isopened) throws PreconditionException{
		CashDesk cashdesk = (CashDesk)GetData(DM.getCashDeskDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashdesk) == true)
		{
			CashDesk cas = new CashDesk();
			cas.setId(id);
			cas.setName(name);
			cas.setIsOpened(isopened);
			DM.getCashDeskDao().save(cas);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public CashDesk queryCashDesk(int id) throws PreconditionException{
		CashDesk cashdesk = (CashDesk)GetData(DM.getCashDeskDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashdesk) == false)
		{
			return cashdesk;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyCashDesk(int id,String name,Boolean isopened) throws PreconditionException{
		CashDesk cashdesk = (CashDesk)GetData(DM.getCashDeskDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashdesk) == false)
		{
			cashdesk.setId(id);
			cashdesk.setName(name);
			cashdesk.setIsOpened(isopened);
			DM.getCashDeskDao().save(cashdesk);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteCashDesk(int id) throws PreconditionException{
		CashDesk cashdesk = (CashDesk)GetData(DM.getCashDeskDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(cashdesk) == false && cashdesk!= null)
		{
			DM.getCashDeskDao().delete(cashdesk);
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
