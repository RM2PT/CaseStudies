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
public class ManageBankCardCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createBankCard(int cardid,Integer cardstatus,Integer catalog,int password,double balance) throws PreconditionException{
		BankCard bankcard = DM.getBankCardDao().findByCardID(cardid);
		
		if(StandardOPs.oclIsUndefined(bankcard) == true)
		{
			BankCard ban = new BankCard();
			ban.setCardID(cardid);
			ban.setCardStatus(cardstatus);
			ban.setCatalog(catalog);
			ban.setPassword(password);
			ban.setBalance(balance);
			DM.getBankCardDao().save(ban);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public BankCard queryBankCard(int cardid) throws PreconditionException{
		BankCard bankcard = DM.getBankCardDao().findByCardID(cardid);
		
		if(StandardOPs.oclIsUndefined(bankcard) == false)
		{
			return bankcard;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyBankCard(int cardid,Integer cardstatus,Integer catalog,int password,double balance) throws PreconditionException{
		BankCard bankcard = DM.getBankCardDao().findByCardID(cardid);
		
		if(StandardOPs.oclIsUndefined(bankcard) == false)
		{
			bankcard.setCardID(cardid);
			bankcard.setCardStatus(cardstatus);
			bankcard.setCatalog(catalog);
			bankcard.setPassword(password);
			bankcard.setBalance(balance);
			DM.getBankCardDao().save(bankcard);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteBankCard(int cardid) throws PreconditionException{
		BankCard bankcard = DM.getBankCardDao().findByCardID(cardid);
		
		if(StandardOPs.oclIsUndefined(bankcard) == false && bankcard!= null)
		{
			DM.getBankCardDao().delete(bankcard);
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
