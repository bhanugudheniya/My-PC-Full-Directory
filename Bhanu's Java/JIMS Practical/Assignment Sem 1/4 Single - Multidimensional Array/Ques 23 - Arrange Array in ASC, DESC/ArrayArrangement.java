import java.util.*;
class ArrayArrangement
{
	public static void main(String args[])
	{
		int [] x=new int[10];
		int [] y=new int[10];
		int a,b,n=10;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
				System.out.print("enter number:");
				x[i]=sc.nextInt();	
				y[i]=x[i];		
		}
		for(int i=0;i<n;i++)
		{
			for( int j=i+1;j<n;j++)
			{
				if(x[i]>x[j])
				{
					 a =  x[i];
                   				 x[i] = x[j];
                   				 x[j] = a;
				}
				if(y[i]<y[j])
				{
					 b =  y[i];
                   				 y[i] = y[j];
                   				 y[j] = b;
				}
								
			}
		}
		System.out.println("ACSENDING ORDER"); 
		for(int i=0;i<n;i++)
		{
			System.out.print(x[i]+" , ");
		}					
		System.out.println("\nDESCENDING ORDER"); 
		for(int i=0;i<n;i++)
		{
			System.out.print(y[i]+" , ");
		}	
	}
}
