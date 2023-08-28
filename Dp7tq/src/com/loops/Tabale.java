package com.loops;

import java.util.Scanner;

public class Tabale 
{
	public static void main (String args[])
	{
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enterv the number to print table ");
		
			int num =sc.nextInt();
			
			for (int i=1;i<=10;i++)
				
				System.out.println(num+"X"+i+"="+num*i);
	}
}
