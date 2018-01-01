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
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			CreditHistory his =  new CreditHistory();
			his.setBadDebits(0);
			his.setOutstandingDebt(0);
			return his;
		}
		else
		{
			throw new PreconditionException();				
		}
		//string parameters: [name]
	}
	 
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
