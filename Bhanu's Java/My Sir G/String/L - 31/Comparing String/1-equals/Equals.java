public class Equals
{
	public static void main(String []args)
	{
		String s1 = new String("Computer");
		String s2 = new String("computer");
		
		if(s1.equals(s2))
		{
			System.out.println("String are Same");
		}
		else
		{
			System.out.println("String are not Same");
		}
	}
}