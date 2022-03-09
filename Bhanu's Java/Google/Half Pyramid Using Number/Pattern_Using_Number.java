//Program 3 || Example 2
//Half Pyramid Using Number

class Pattern_Using_Number
{
	public static void main(String[] args)
	{
		int rows = 5;
		
		for(int i = 1; i<=rows; ++i)
		{
			for(int j = 1; j<=i; ++j)
			{
				System.out.print(j+"");
			}
		System.out.println();
		}
	}
}