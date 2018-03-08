package services.impl;

import services.*;
import entities.*;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThirdPartServicesImpl implements ThirdPartServices{
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	
	/* Generate buiness logic according to functional requirement */
	@SuppressWarnings("unchecked")
	public CreditHistory getCreditHistory(int securityid, String name) throws PreconditionException {
		/* Logic here */
		CreditHistory his =  new CreditHistory();
		his.setBadDebits(0);
		his.setOutstandingDebt(0);
		return his;
	}
	 
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());



	@Override
	public CheckingAccount getCheckingAccountStatus(int cid) throws PreconditionException {
		// TODO Auto-generated method stub
		
		/* Logic here */
		CheckingAccount ca =  new CheckingAccount();
		ca.setBalance(10000);;
		ca.setStatus(CheckingAccountStatus.GOODSTANDING);;
		return ca;
		
		
	}



	@Override
	public boolean sendEmail(String emailaddress, String title, String content) throws PreconditionException {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean print(String content, int numbers) throws PreconditionException {
		// TODO Auto-generated method stub
		return true;
	}






	@Override
	public LoanAccount createLoanAccount(int id) throws PreconditionException {
		// TODO Auto-generated method stub
		LoanAccount la = new LoanAccount();
		la.setBalance(0);
		la.setStatus(LoanAccountStatus.NORMAL);
		
		return new LoanAccount();
	}



	@Override
	public boolean transferFunds(int id, float amount) throws PreconditionException {
		// TODO Auto-generated method stub
		return true;
	}




			
}
