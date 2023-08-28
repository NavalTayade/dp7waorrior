package Controlstatement;

import java.util.Scanner;

public class BloodDonation 
{
	public static void main(String args[])
{
		Scanner sc =new Scanner(System.in);
 
		System.out.println("enter your age");
		int age =sc.nextInt();
 
		//System.out.println("enter your weight");
		//float weight =sc.nextFloat();
 
		if(age>18)
		{
		System.out.println("enter your weight");
		float weight =sc.nextFloat();

		
			if (weight>=70)
				

			{

				System.out.println("eligible to donate blood");
			}
		
		else
		{
			System.out.println("your under age");
		}
}
		else
		{
			System.out.println("your age is not match");

		}
   }
}
