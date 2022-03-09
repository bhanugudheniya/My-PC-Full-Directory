//java program to check input no is part of Fibonacci series or not

import java.util.Scanner;
class Fibonacci {
  public static void main(String[] args) {
    int n, t1 = 0, t2 = 1;
     Scanner Scan=new Scanner(System.in);
     System.out.println("Enter the number of terms");
     n=Scan.nextInt();
     System.out.print("First " + n + " terms: ");
       for (int i = 1; i<= n; ++i)
       {
       System.out.print(t1 + " + ");
       int sum = t1 + t2;
       t1 = t2;
       t2 = sum;
       }
    }
 }
