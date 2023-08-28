package Controlstatement;

import java.util.Scanner;

public class GrossSalary
{
public static void main(String agrs [])
{
  Scanner sc =new Scanner (System.in);
  System.out.println("enter the basic salary");
  int basicsalary=sc.nextInt();
  
  float hra,da;
  if(basicsalary<=10000)
  {
	  hra=basicsalary*0.2f;
	  da=basicsalary*0.8f;
  }
  else if(basicsalary<=20000)
  {
	hra=basicsalary*0.25f;
	da=basicsalary*0.9f;
  }
  else
  {
	hra=basicsalary*0.3f;
	da=basicsalary*0.95f;
  }
  System.out.println("gross salary is:"+(basicsalary+hra+da));
  }
	
}


