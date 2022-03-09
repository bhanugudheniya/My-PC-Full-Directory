public class IndexOf
{
	public static void main(String []args)
	{
		String s1 = new String("Computer");
		int i = s1.indexOf("ute",4);	// it works on String, indexing from (any no) 4. 
		
		System.out.println("Index is : " +i);
	}
}