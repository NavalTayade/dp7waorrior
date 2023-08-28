package Controlstatement;

import java.util.Scanner;

public class DayInMonth
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the month from 1 to 12");
		int month =sc.nextInt();
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
		System.out.println("day inmonth 31");
		}
		else if (month==4 || month==6 || month==9 || month==11  )
		{
			System.out.println("day in month 30");
		}
		else if(month==2)
		{
			System.out.println("day inmonth 29");

		}
			
	}

}
