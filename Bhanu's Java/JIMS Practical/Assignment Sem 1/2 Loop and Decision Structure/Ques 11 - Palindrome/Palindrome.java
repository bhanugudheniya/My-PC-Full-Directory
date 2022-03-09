//java program to check if number is “palindrome”  or not.

import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int n,r, temp , sum=0;

		Scanner scan=new Scanner(System.in);

 		System.out.println("Enter the number you want to check ");
		n=scan.nextInt();

		temp=n;
		while(n>0){
 		r=n%10; //getting remainder
 		sum=(sum*10)+r;
 		n=n/10;
 	}
 	if(temp==sum)
 	System.out.println("palindrome number ");
	else
 	System.out.println("not palindrome");
	}
}