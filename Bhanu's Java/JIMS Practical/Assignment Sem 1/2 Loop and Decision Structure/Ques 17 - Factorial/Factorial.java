//java program to calculate factorial of accepted number

import java.util.Scanner;
class Factorial {   
  public static void main(String args[])   
   {   
    int n, i, fact=1;
     Scanner Scan=new Scanner(System.in);
     System.out.println("Enter the number for factorial");
     n=Scan.nextInt();
     for(i=1;i<=n;i++)
     {    
     fact=fact*i;    
     }    
     System.out.println("Factorial of "+n+" is: "+fact);    
   }   
 }
