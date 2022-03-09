//convert  Celsius  into Fahrenheit

import java.util.Scanner;
public class Celsius
{
	public static void main(String args[])
	{
		double cel , fah;

		Scanner scan=new Scanner(System.in);

 		System.out.print("Enter the temp in celsius ");
 		cel=scan.nextDouble();

		fah = ( cel * 1.8) + 32;

		System.out.println(" value of temperature in fahrenheit:" + fah);
		if((cel % 2) == 0)
		{
			System.out.println(" The accepted number is even");
		}
		else
		{
			System.out.println(" The accepted degree is odd");
		}
	}
}