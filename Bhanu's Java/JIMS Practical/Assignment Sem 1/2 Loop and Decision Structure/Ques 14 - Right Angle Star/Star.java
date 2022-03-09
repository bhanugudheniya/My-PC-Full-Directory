import java.util.Scanner;
public class Star
{
	public static void main(String args[])
	{
		int i, j, row;
		Scanner scan=new Scanner(System.in);
 		System.out.println("Enter the number of rows");
		row=scan.nextInt();

		for(i=0; i<row; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}