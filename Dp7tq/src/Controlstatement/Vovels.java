package Controlstatement;

import java.util.Scanner;

public class Vovels
{
public static void main (String args[])
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Alphabets");
	char alphabet =sc.next().charAt(0);
	
	if(alphabet=='a'||alphabet=='e' || alphabet=='i' || alphabet=='0'|| alphabet=='u' ) 
	{
		System.out.println("its Vovels");
	}
	
	else
	{
		System.out.println("its not Vovels");

	}
	
	}
}
