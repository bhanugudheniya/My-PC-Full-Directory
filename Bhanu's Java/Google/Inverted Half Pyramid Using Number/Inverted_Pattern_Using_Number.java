//Program 3 || Example 5
//Inverted Hlf Pyramid Using Number

class Inverted_Pattern_Using_Number
{
	public static void main(String[] args)
	{
		int rows = 5;
		
		for(int i = rows; i>=1; --i)
		{
			for(int j = 1; j<=i; ++j)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
}