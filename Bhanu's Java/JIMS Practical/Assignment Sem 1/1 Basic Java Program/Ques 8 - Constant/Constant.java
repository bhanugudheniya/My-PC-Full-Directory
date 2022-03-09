//Constant in java

import java.util.Scanner;
public class Constant
{
	private static final double PRICE=234.90;
	public static void main(String[] args)
	{
		int unit;
		double total_bill;

		System.out.print("Enter the number of units you have used: ");
		Scanner sc=new Scanner(System.in);

		unit=sc.nextInt();
		total_bill=PRICE*unit;

		System.out.println("The total amount you have to deposit is: "+total_bill);
	}
}