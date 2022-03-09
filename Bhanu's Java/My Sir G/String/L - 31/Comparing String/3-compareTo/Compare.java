public class Compare
{
	public static void main(String []args)
	{
		String s1 = new String("Computer");
		String s2 = new String("computer");
		
		int i = s1.compareTo(s2);
		
		if(i == 0)
		{
			System.out.println("String are Same");
		}
		else
			if(i>0)
		{
			System.out.println("Opposite to Dictionary Order");
		}
		else
		{
			System.out.println("Dictionary Order");
		}
	}
}