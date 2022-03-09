import java.util.Scanner;
public class Student
{
 	public static void main(String args[])
 	{
 		String firstname, lastname , qualification;
 		int total , percentage;

 		Scanner SC=new Scanner(System.in);

 		System.out.print("Enter First Name: ");
 		firstname=SC.nextLine();

		System.out.print("Enter Last Name: ");
 		lastname=SC.nextLine();

 		System.out.print("Enter Your Qualification: ");
 		qualification=SC.nextLine();

 		System.out.print("Enter your total marks: ");
 		total=SC.nextInt();

		System.out.print("Enter your percentage: ");
 		percentage=SC.nextInt();
		
		System.out.println();	
	
 		System.out.println("Name:" +firstname +" "+lastname);
 		System.out.println("Qualification " +qualification);
 		System.out.println("Total: "+total );
		System.out.println("Percentage: "+percentage );
  	}
}