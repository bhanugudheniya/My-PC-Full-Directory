public class Alphabets
{
	public static void main(String args[])
	{
		printAlphabets();
		printAlphabetsInUpperCase();
	}
	public static void printAlphabets()
	{
		System.out.println("List of alphabets in lowercase :");
		for (char ch = 'a'; ch <= 'z'; ch++)
		{
			System.out.printf("%s ", ch); 
		} 
	}
	
	public static void printAlphabetsInUpperCase()
	{
		System.out.println("\nList of alphabets in upper case :");
		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.printf("%s ", ch); 
		}
	}
}