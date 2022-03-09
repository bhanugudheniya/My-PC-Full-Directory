import java.util.*;

public class Palindrome
{
	public static void main(String []args)
	{
		int i, d, rev = 0, n;
			
			Scanner n1 = new Scanner(System.in);
			System.out.println("Enter a  number ");
			n = n1.nextInt();
			
			d=n;
			
			while(n>0)
			{
				i = n%10;
				rev = rev*10+i;
				n = n/10;
			}
			
			if(rev == d)
			{
				System.out.println("Palindrome ");
			}
			else
			{
				System.out.println("Not Palindrome ");
			}
	}
}