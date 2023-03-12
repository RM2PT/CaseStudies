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
public class ManageModelAccessService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createAccess(String symbol,int maxNum) throws PreconditionException{
		ModelAccessLink access = DM.getModelAccessLinkDao().findBySymbol(symbol);
		
		if(StandardOPs.oclIsUndefined(access) == true)
		{
			ModelAccessLink mal = new ModelAccessLink();
			mal.setSymbol(symbol);
			mal.setCurrentVisitNumber(0);
			mal.setMaximumVisitNumber(maxNum);
			DM.getModelAccessLinkDao().save(mal);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteAccess(String symbol) throws PreconditionException{
		ModelAccessLink a = DM.getModelAccessLinkDao().findBySymbol(symbol);
		
		if(StandardOPs.oclIsUndefined(a) == false && a!= null)
		{
			DM.getModelAccessLinkDao().delete(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyAccess(String symbol,int maxNum) throws PreconditionException{
		ModelAccessLink a = DM.getModelAccessLinkDao().findBySymbol(symbol);
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			a.setSymbol(symbol);
			a.setMaximumVisitNumber(maxNum);
			DM.getModelAccessLinkDao().save(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public ModelAccessLink queryAccess(String symbol) throws PreconditionException{
		ModelAccessLink a = DM.getModelAccessLinkDao().findBySymbol(symbol);
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a;
			
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
