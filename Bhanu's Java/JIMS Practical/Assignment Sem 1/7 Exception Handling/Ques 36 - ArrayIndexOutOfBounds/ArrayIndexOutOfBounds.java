import java.util.*;
class ArrayIndexOutOfBounds
{
	public static void main(String args[])
	{
		int [] x=new int[5];
		int [] y=new int[5];
		int a,b,n=5;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=11;i++)
		{
			try{
				System.out.print("enter number:");
				x[i]=sc.nextInt();	
				y[i]=x[i];	
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("only 5 values allowed");
				break;
			}					
																	
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

        System.out.println();
	}
}