package Controlstatement;

import java.util.Scanner;

public class MovieTickit 
{
	public static void main (String args[])
{
		Scanner sc =new Scanner(System.in);
		
			System.out.println("Enter our date");
			int date= sc.nextInt() ;

			System.out.println("Enter movie name");
			String name = sc.next() ;
			
			System.out.println("enter rating");
			int rating= sc.nextInt() ;
			
			System.out.println("Enter price");
			float price = sc.nextFloat() ;
			
			System.out.println("Enter coupon code");
			int code= sc.nextInt() ;

			System.out.println("press 0 for silver and 1 for gold");
			

			if(code==0)
			
			{
				System.out.println("you are getting 50 ru off");
				price=price-50;
				System.out.println("you are ticket is book "+price);

			}
			
			else if (code==1)
			{
				System.out.println("you are getting 100 ru off");
				price=price-100;
				
				System.out.println("you are ticket is book "+price);

			}
			
			else 
			{
				System.out.println("you are not eligible for coupon ");
				
			}
		
			
			
	}

}

