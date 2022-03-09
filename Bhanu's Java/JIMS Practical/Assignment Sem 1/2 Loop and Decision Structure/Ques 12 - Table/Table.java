// java program to print table from 0 to accepted number, using loops and keyboard inputs. 

import java.util.Scanner;
public class Table
{
	public static void main(String args[])
	{
		int n , i,j;
		Scanner scan=new Scanner(System.in);
 		System.out.println("Enter the number till you want table");
		n=scan.nextInt();
		for (i=0 ; i<=n ;i++)
		{
			for (j=1;j<=10 ;j++)
			{
				System.out.println( i+ " x " + j + " = " + (i * j));
			}
		}
	}
}