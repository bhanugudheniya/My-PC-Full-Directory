import java.util.Scanner;
public class Student
{
 	public static void main(String args[])
 	{
 		int total , eng , hindi , math;
		float perc;

 		Scanner SC=new Scanner(System.in);

 		System.out.println("Enter Hindi Marks ");
  		hindi=SC.nextInt();

		System.out.println("Enter English Marks: ");
 		eng=SC.nextInt();

 		System.out.println("Enter Maths Marks: ");
 		math=SC.nextInt();

 		total= math + eng + hindi;
		System.out.println("Total Marks: "+total );
		perc = ((total*100)/300);
		System.out.println("Percentage : " +perc);
		
		if ((perc>=80) && (perc<=100))
		{
			System.out.println("Your Grade is A");
		}
		else if ((perc>=60) && (perc<=79))
		{
			System.out.println("Your Grade is B");
		}
		else if ((perc>=40) && (perc<=59))
		{
			System.out.println("Your Grade is c");
		}
		else
		{
			System.out.println("Your Grade is D");
		}
 	}
}