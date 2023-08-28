package Controlstatement;

import java.util.Scanner;

public class SimpleCalculator 
{
public static void main (String args[])
{
	Scanner sc= new Scanner(System.in);
	
	
	 System.out.println("Enter an sign (+, -, *, /): ");
     char operator = sc.next().charAt(0);

	System.out.println("Enter num1");
	double num1=sc.nextInt();
	
	System.out.println("Enter num2");
	double num2=sc.nextInt();

	double result = 0;

    if (operator == '+')
    {
        result = num1 + num2;
    } 
   
    else if (operator == '-')
    {
        result = num1 - num2;
    } 
   
    else if (operator == '*') 
    {
        result = num1 * num2;
    } 
   
    else if (operator == '/') 
    {
    	if (num2 != 0) 
        {
            result = num1 / num2;
        } 
    	
    	else
        
        {
            System.out.println("Error: Cannot divide by zero.");
          
        }
    }
       else
    {
        System.out.println("Error: Invalid sign.");
     
    }

    System.out.println("Result: " + result);


	
	}
}
