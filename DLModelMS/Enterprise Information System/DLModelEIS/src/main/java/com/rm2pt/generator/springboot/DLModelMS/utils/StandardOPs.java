package com.rm2pt.generator.springboot.DLModelMS.utils;

import java.util.Date;
import java.util.List;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StandardOPs {

	public static Boolean isUnique(List list, String attribute) { 
		
		Object[] l = list.toArray();
		for (int i = 0; i < l.length; i++) {
			for (int j = i+1; j < l.length; j++) {

				 try {
				  //System.out.println("i: " + String.valueOf(i));
				  //System.out.println("j: " + String.valueOf(j));
				  
				  Method getO1Attri = l[i].getClass().getMethod("get" + attribute);
				  Method getO2Attri = l[j].getClass().getMethod("get" + attribute);
				  
				  Class type1 = getO1Attri.getReturnType();
				  //System.out.println(type1);
				  if (type1 == String.class) {
				   String o1 = (String) getO1Attri.invoke(l[i]);
				   String o2 = (String) getO2Attri.invoke(l[j]);
				   
				   System.out.println("o1: " + o1);
				   System.out.println("o2: " + o2);
				   
				   if (o1.equals(o2)) {
				    return false;
				   }
				  } else if(type1 == int.class) {
				   
				   int o1 = (int) getO1Attri.invoke(l[i]);
				   int o2 = (int) getO2Attri.invoke(l[j]);
				   
				   //System.out.println("o1: " + String.valueOf(o1));
				   //System.out.println("o2: " + String.valueOf(o2));
				   
				   if (o1 == o2) {
				    return false;
				   }
				   
				  }
				 } catch (Exception e ){
				  e.printStackTrace();
				 }
			}
		}
		return true;
			
	}
	
	public static Double sum(List<? extends Number> list) {
		
		Double sum = 0.0 ;
		
		for (Number s : list) {
		
			sum += s.doubleValue();
		}
		
		return sum;
		
	}	
		
	public static Boolean oclIsUndefined(Object o) {
		if (o == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Boolean oclIsInvaild(Object o) {
		if (o == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Boolean isEmpty(List list)
	{
		if (list.isEmpty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static Boolean notEmpty(List list)
	{
		if (!list.isEmpty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static Integer size(List list)
	{
		return list.size();
	}
	
	public static Integer size(String str)
	{
		return str.length();
	}
	
	public static Boolean isInteger(Object temp){
		if(temp instanceof Integer)
			return true;
		else 
			return false;
	}
	
	public static Boolean isReal(Object temp){
		if(temp instanceof Float || temp instanceof Double)
			return true;
		else 
			return false;
	}	
	
	public static Boolean includes(List list, Object o)
	{	
		if (list.contains(o))
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public static Boolean excludes(List list, Object o)
	{	
		if (!list.contains(o))
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}	
	
	public static Boolean includesAll(List list, List olist)
	{	
		if (list.containsAll(olist))
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public static Boolean excludesAll(List list, List olist)
	{	
		if (!list.containsAll(olist))
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}		
	public static Date StringToDate(String date)
	{	
		if (date==null)
		{
			return new Date();
		}else {	
//			DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				return simpleDateFormat.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
				return new Date();
			}
		}	
	}		
}
