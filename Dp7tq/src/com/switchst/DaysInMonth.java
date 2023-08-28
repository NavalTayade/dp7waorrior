package com.switchst;

import java.util.Scanner;

public class DaysInMonth
{
public static void main (String args[])
{
	Scanner sc = new Scanner (System.in);
	
	System.out.println("enter the month name (lower case)");
	
	String mName =sc.next();
	
	switch(mName)
	{
	case   "january":
	case   "march":
	case   "may":
	case   "july":
	case   "septeember":
	case   "november" :  System.out.println(" 31 DAYS IN THIS MONTH.....");
	break;
	
	case   "april":
	case   "june":
	case   "august":
	case   "octomber":
	case   "december" : System.out.println(" 30 DAYS IN THIS MONTH.....");
	break;
	
	case "February":
	
	System.out.println(" ENTER YEAR.....");
	int year=sc.nextInt();
	
	if(year%400==0 || year%4==0 && year%100!=0)
	{
		System.out.println(" 29 DAYS IN THIS MONTH.....");
	}
	else
	{
		System.out.println(" 28 DAYS IN THIS MONTH.....");
	}
	break;
	      
	    default : System.out.println(" ERROR INPUT.....");
	
	
	}
	
	
}

}