//java program to print

import java.util.Scanner;
class Pattern {   
  public static void main(String args[])   
    {   
     int i, j, row;
      Scanner Scan=new Scanner(System.in);
      System.out.println("Enter the number of ROWS");
      row=Scan.nextInt();
	for (i= 0; i<= row-1; i++)  
        {  
        for (j=0; j<=i; j++)   
        {  
        System.out.print("*"+ " ");  
        }   
        System.out.println("");   
        }   
        for (i=row-1; i>=0; i--)  
        {  
        for(j=0; j <= i-1;j++)  
        {  
        System.out.print("*"+ " ");  
        }  
        System.out.println("");  
        }  
     }   
  }
