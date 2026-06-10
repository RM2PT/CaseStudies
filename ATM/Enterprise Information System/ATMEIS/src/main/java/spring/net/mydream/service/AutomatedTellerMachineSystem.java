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
public class AutomatedTellerMachineSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean inputCard(int cardid) throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		BankCard bc = DM.getBankCardDao().findByCardID(cardid);
		
		if(true)
		{
			if((StandardOPs.oclIsUndefined(bc) == false)){
				currentUtils.setAttribute("CardIDValidated" , true);
			currentUtils.setAttribute("InputCard" , bc);
			return true;
			
			}else{
				currentUtils.setAttribute("CardIDValidated" , false);
			return false;
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean inputPassword(int password) throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		Boolean PasswordValidated=(Boolean)currentUtils.getAttribute("PasswordValidated");
		BankCard t = InputCard;
		
		if(CardIDValidated == true && StandardOPs.oclIsUndefined(InputCard) == false)
		{
			if(t.getPassword() == password){
				currentUtils.setAttribute("PasswordValidated" , true);
			return true;
			
			}else{
				currentUtils.setAttribute("PasswordValidated" , false);
			return false;
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public double printReceipt() throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		double DepositedNumber=(double)currentUtils.getAttribute("DepositedNumber");
		Boolean IsWithdraw=(Boolean)currentUtils.getAttribute("IsWithdraw");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		Boolean PasswordValidated=(Boolean)currentUtils.getAttribute("PasswordValidated");
		double WithdrawedNumber=(double)currentUtils.getAttribute("WithdrawedNumber");
		Boolean IsDeposit=(Boolean)currentUtils.getAttribute("IsDeposit");
		
		if(CardIDValidated == true && PasswordValidated == true && StandardOPs.oclIsUndefined(InputCard) == false)
		{
			if(IsWithdraw == true){
				return WithdrawedNumber;
			
			}else{
				if(IsDeposit == true){
				return DepositedNumber;
			
			}else{
				return 0;
			
			}
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public double checkBalance() throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		Boolean PasswordValidated=(Boolean)currentUtils.getAttribute("PasswordValidated");
		
		if(PasswordValidated == true && CardIDValidated == true && StandardOPs.oclIsUndefined(InputCard) == false)
		{
			return InputCard.getBalance();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean ejectCard() throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		double DepositedNumber=(double)currentUtils.getAttribute("DepositedNumber");
		Boolean IsWithdraw=(Boolean)currentUtils.getAttribute("IsWithdraw");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		Boolean PasswordValidated=(Boolean)currentUtils.getAttribute("PasswordValidated");
		double WithdrawedNumber=(double)currentUtils.getAttribute("WithdrawedNumber");
		Boolean IsDeposit=(Boolean)currentUtils.getAttribute("IsDeposit");
		
		if(PasswordValidated == true && CardIDValidated == true && StandardOPs.oclIsUndefined(InputCard) == false)
		{
			currentUtils.setAttribute("InputCard" , null);
			currentUtils.setAttribute("PasswordValidated" , false);
			currentUtils.setAttribute("CardIDValidated" , false);
			currentUtils.setAttribute("IsWithdraw" , false);
			currentUtils.setAttribute("IsDeposit" , false);
			currentUtils.setAttribute("WithdrawedNumber" , 0);
			currentUtils.setAttribute("DepositedNumber" , 0);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean withdrawCash(int quantity) throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		Boolean IsWithdraw=(Boolean)currentUtils.getAttribute("IsWithdraw");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		Boolean PasswordValidated=(Boolean)currentUtils.getAttribute("PasswordValidated");
		double WithdrawedNumber=(double)currentUtils.getAttribute("WithdrawedNumber");
		
		if(PasswordValidated == true && CardIDValidated == true && StandardOPs.oclIsUndefined(InputCard) == false && Balance >= quantity)
		{
			currentUtils.setAttribute("Balance" , ;
			currentUtils.setAttribute("WithdrawedNumber" , quantity);
			currentUtils.setAttribute("IsWithdraw" , true);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean depositFunds(double quantity) throws PreconditionException{
		BankCard InputCard=(BankCard)currentUtils.getAttribute("InputCard");
		double DepositedNumber=(double)currentUtils.getAttribute("DepositedNumber");
		Boolean CardIDValidated=(Boolean)currentUtils.getAttribute("CardIDValidated");
		Boolean PasswordValidated=(Boolean)currentUtils.getAttribute("PasswordValidated");
		Boolean IsDeposit=(Boolean)currentUtils.getAttribute("IsDeposit");
		
		if(PasswordValidated == true && CardIDValidated == true && StandardOPs.oclIsUndefined(InputCard) == false && quantity >= 100)
		{
			currentUtils.setAttribute("Balance" , ;
			currentUtils.setAttribute("IsDeposit" , true);
			currentUtils.setAttribute("DepositedNumber" , quantity);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean cardIdentification() throws PreconditionException{
		
		if(true)
		{
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
