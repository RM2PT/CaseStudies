package services.impl;

import services.*;
import entities.*;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThirdPartServicesImpl implements ThirdPartServices{
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	
	/* Generate buiness logic according to functional requirement */
	@SuppressWarnings("unchecked")
	public boolean thirdPartyCardPaymentService(String cardAccountNumber, LocalDate expiryDate, float fee) throws PreconditionException {
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			//return primitive type	
			return true;
		}
		else
		{
			throw new PreconditionException();				
		}
		//string parameters: [cardAccountNumber]
	}
	 
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
