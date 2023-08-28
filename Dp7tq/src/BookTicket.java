import java.util.Scanner;

public class BookTicket 
{
	public static void main (String args [])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter air line name");
		char name= sc.next().charAt(0);
		
		System.out.println("enter depart place");
		char place= sc.next().charAt(0);
		
		System.out.println("enter destination place");
		char desplace= sc.next().charAt(0);
		
		System.out.println("enter coupon code if you have it");
		int code= sc.nextInt();
		
		if (code == 12345)
		{
			float price = 177000f;
			System.out.println("providing you 10% discount");
		
			float Totalprice = 177000/100*10f;
			
			System.out.println("your price" + Totalprice );
			System.out.println("enjoy your journey........." );
			
			}
		
		else
		{
			System.out.println("no such code availablea" );
			System.out.println("actual price is 50000" );

		}	
	}

}
