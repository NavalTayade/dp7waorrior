package com.casting;

import java.util.Scanner;

public class Admission 
{
 public static void main (String args[])
 {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage");
		double per =sc.nextDouble();
		
		System.out.println("Enter pcm");
		double pcm =sc.nextDouble();
		
		
		if(per >=90 || pcm >= 85)
		{
			System.out.println( "eligibal for admission.....");
			

		}
		else
		{
			System.out.println( " not eligibal for admission.....");

		}
 }
}
