import java.util.*;

public class CString
{
	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter First String ");
		String a = s1.nextLine();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter Second String ");
		String b = s2.nextLine();
		
		System.out.println("Conacatination of two Strings are : " +a+b);
	}
}