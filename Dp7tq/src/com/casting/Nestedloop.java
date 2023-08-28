package com.casting;

import java.util.Scanner;

//percentaage
//>=80:sci & com stream
public class Nestedloop
{
public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter percentage");
	float per =sc.nextFloat();
	
	if (per>=65)
	{
	 {
			System.out.println( " eligible for collage.....");
		}
		
		if(per>=80)
		{
			System.out.println("can opt sci and com stream");
			
		}
		else  
		{
			System.out.println("can opt  com stream");
		}
		
	}
	
		else
		{
			System.out.println(" not eligible for collage.....");

		}
   }

}
