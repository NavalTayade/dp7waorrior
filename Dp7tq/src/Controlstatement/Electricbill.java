package Controlstatement;

import java.util.Scanner;

public class Electricbill
{
	 
		public static void main(String args[]) 
	{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Unit");
			int unit=sc.nextInt();
			
			double amount,billamount,surcharge;
			
			if(unit<=50)
			{
				amount=unit*0.5;
			}
			else if(unit<=100)
			{
				amount=unit*0.75;
			}
			else
			{
				amount=unit*1.20;
			}
			surcharge=amount*0.2;
			billamount=amount+surcharge;
			
			System.out.println("Total electricity bill :"+billamount);
			
			
			
		}

	}

