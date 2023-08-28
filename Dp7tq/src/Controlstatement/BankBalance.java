package Controlstatement;

import java.util.Scanner;

public class BankBalance
{
		public static void main (String args[]) 
  {
			Scanner sc=new Scanner(System.in);
	 
			int balance = 20000;
	 
			System.out.println("welcome to the 	HDFC Bank (ATM) ");
			System.out.println("ENTER THE PIN ");
			int pin = sc.nextInt();
	
	if(pin==5596)
	{
		 System.out.println("1, deposit ");
		 System.out.println("2,withdraw ");
		 System.out.println("3,check balance ");
		 System.out.println("4,exit ");
	
	
	     System.out.println("enter option ");
	     int option =sc .nextInt();
	     
    if(option==1)
	     {
		     System.out.println("enter amount you deposit ");
		     int  deposit=sc .nextInt();
		     balance=balance+deposit;
		     System.out.println("avialabl balance is"+ balance);
		     
		 }
	 if(option==2)
	     {
	    	 System.out.println("enter amount you withdraw ");
		     int  withdraw =sc .nextInt();
		     balance=balance-withdraw;
		     System.out.println("avialabl balance is :"+ balance);
		     
	     }
	}
	 else 
	     {
		     System.out.println("plzz enter valid pin");

	     }
	
   }

}
