import java.util.*;

public class Factorial
{
	public static void main(String []args)
	{
		int i, n,fact = 1;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		n = a.nextInt();
		
		if(n<0)
		{
			System.out.println("Negative Number ");
		}
		else
		{
			for(i=1; i<=n; i++)
			fact = fact*i;
			{
				System.out.println("Factrotial of " +n+ "is " +fact);
			}
		}
	}
}