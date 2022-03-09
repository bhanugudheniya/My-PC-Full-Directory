//Program 3 || Example 4
//Inverted Half Pyramid Using Star

class Inverted_Pattern_Using_Star
{
	public static void main(String[] args)
	{
		int rows = 5;
		
		for(int i = rows; i>=1; --i)
		{
			for(int j = 1; j<=i; ++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}