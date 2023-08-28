package Controlstatement;

import java. util. Scanner;

public class percentage
{
public static void main (String args [])
{
 Scanner sc = new Scanner(System.in);
 
 	System.out.println("Enter your name....");
 	String name = sc.next();
 	
 	System.out.println("Enter your mark of sub1");
 	double sub1 =sc.nextDouble();
 	
 	System.out.println("Enter your mark of sub2");
 	double sub2 =sc.nextDouble();

 	System.out.println("Enter your mark of sub3");
 	double sub3 =sc.nextDouble();
 	
 	System.out.println("Enter your mark of sub4");
 	double sub4 =sc.nextDouble();

 	System.out.println("Enter your mark of sub5");
 	double sub5 =sc.nextDouble();

 	double sum =(sub1+sub2+sub3+sub4+sub5);
 	double per= (sum/500)*100;
 	
 	if (per>36)
 	{
 	 	System.out.println(name+" Has scored"+per+"congratulation !! passed pramoted");
 	 	
 	}
 	else
 	{
 	 	System.out.println(name+" Has scored"+per+"you are fail !!try next time");

 	}
}

}
