/* My Sir G */
/* Lecture - 17 */
/* Taking Input From Keyboard */ 
/* Input from Keyboard */
/**************************************/

import java.util.*;
//import java.util.Scanner; 

class Input
{
	public static void main(String []args)
	{
		System.out.println("Enter your Name and Age ");
		Scanner a = new Scanner(System.in);
		String name = a.nextLine();
		int age = a.nextInt();
		
		System.out.println("Name : " +name);
		System.out.println("Age  : " +age);
	}
}