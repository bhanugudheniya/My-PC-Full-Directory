import java.util.Scanner;
public class Max_Min_Avg
{
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
        	int num[]=new int[5];
        	int average=0;
        	int i=0;
        	int sum=0;
        	for (i=0;i<5;i++) {
            	System.out.println("enter a number");
            	num[i]=in.nextInt();
            	sum=sum+num[i];
	}
        int min=num[0];
        int max=num[0];
        for(i=0;i<5;i++)   
        {
	  if (num[i]<min) {
          min=num[i];
          }
          if (num[i]>max) {
          max=num[i];
          }
	}
        average=sum/5;
        System.out.println("Min="+ min);
        System.out.println("Max="+ max);
        System.out.println("Sum="+ sum);
        System.out.println("Average="+ average);
}
}
