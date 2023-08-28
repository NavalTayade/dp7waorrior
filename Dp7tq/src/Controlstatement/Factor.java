package Controlstatement;

import java.util.Scanner;

public class Factor 
{
 public static void main (String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter any number");
	 int num = sc.nextInt();
	 
	 
	 System.out.println("enter factor");
	 int factor = sc.nextInt();

	 if(num%factor==0)
		 
	 {
		 System.out.println("THIS IS FACTOR OF:"+ num);

	 }
	 else
	 {
		 System.out.println(" NOT A FACTOR");

	 }
 }
}
