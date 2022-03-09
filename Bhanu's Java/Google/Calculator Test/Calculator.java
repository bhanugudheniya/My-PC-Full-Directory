/* Calculator */

import java.util.Scanner;

/*class Returnmain
{
	public int choose()
	{
		char choice;
		System.out.println("Do you want to Continue? [Y/N] " );
		Scanner select = new Scanner(System.in);
		choice  = select.next();

		if(choice == 'y' || choice == 'Y')
		{
			return main();
		}
		else
	
		{
			return 0;
		}
	}
}*/

class Calculator
{
	public static void main(String []args)
	{
		double a,b,c;
		int z;
		
		System.out.println("Press 1 for Addition ");
		System.out.println("Press 2 for Subtraction ");
		System.out.println("Press 4 for Multiplication ");
		System.out.println("Press 4 for Division ");
		System.out.println("-----------------");
		
		Scanner operator = new Scanner(System.in);
		z = operator.nextInt();
		
		System.out.println("*****************");
		
		System.out.println("Enter Two Number ");
		Scanner n = new Scanner(System.in);		
		
		switch(z)
		{
			case 1 :
					System.out.println("*****************");
					a = n.nextDouble();
					b = n.nextDouble();
					System.out.println("*****************");
					c = a+b;
					System.out.println("Addition (+)");
					System.out.println("*****************");
					System.out.println("Sum of Two Number : " +c);
				break;
			
			case 2 : 
					a = n.nextDouble();
					b = n.nextDouble();
					System.out.println("*****************");
					c = a-b;
					System.out.println("Subtraction (-)");
					System.out.println("*****************");
					System.out.println("Subtraction of Two Number : " +c);
				break;
				
			case 3 :
					a = n.nextDouble();
					b = n.nextDouble();
					System.out.println("*****************");
					c = a*b;
					System.out.println("Multiplication (*)");
					System.out.println("*****************");
					System.out.println("Product of Two Number : " +c);
				break;
				
			case 4 : 
					a = n.nextDouble();
					b = n.nextDouble();
					System.out.println("*****************");
					c = a/b;
					System.out.println("Division (/)");
					System.out.println("*****************");
					System.out.println("Division of Two Number : " +c);
				break;
				
			default : System.out.println("Invalid User Input");
		}
		System.out.println("=================");
		
		/*Returnmain o1 = new Returnmain();
		o1.choose(); */
	}
}


