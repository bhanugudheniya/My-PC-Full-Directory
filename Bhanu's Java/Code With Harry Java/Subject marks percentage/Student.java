import java.util.Scanner;

class Student{
	public static void main(String []args){
		Scanner subjectInput = new Scanner(System.in);
		Scanner subjectMarks = new Scanner(System.in);
		Scanner allMarks = new Scanner(System.in);

		System.out.println();

		System.out.println("***** Welcome to Student Software *****");

		System.out.print("Enter First Subject Name : ");
		String first_Subject = subjectInput.nextLine();
		System.out.print("Enter " + first_Subject + " Marks : ");
		int first_Subject_Marks = subjectMarks.nextInt();
		
		System.out.println();

		System.out.print("Enter Second Subject Name : ");
		String second_Subject = subjectInput.nextLine();
		System.out.print("Enter " + second_Subject + " Marks : ");
		int second_Subject_Marks = subjectMarks.nextInt();

		System.out.println();

		System.out.print("Enter Third Subject Name : ");
		String third_Subject = subjectInput.nextLine();
		System.out.print("Enter " + third_Subject + " Marks : ");
		int third_Subject_Marks = subjectMarks.nextInt();

		System.out.println();

		System.out.print("Enter Fourth Subject Name : ");
		String fourth_Subject = subjectInput.nextLine();
		System.out.print("Enter " + fourth_Subject + " Marks : ");
		int fourth_Subject_Marks = subjectMarks.nextInt();

		System.out.println();

		System.out.print("Enter Fifth Subject Name : ");
		String fifth_Subject = subjectInput.nextLine();
		System.out.print("Enter " + fifth_Subject + " Marks : ");
		int fifth_Subject_Marks = subjectMarks.nextInt();

		System.out.println();

		System.out.print("Enter Total Marks : ");
		int totalMarks = allMarks.nextInt();
		

		int obtain_sum = first_Subject_Marks + second_Subject_Marks + third_Subject_Marks + 			    			 fourth_Subject_Marks + fifth_Subject_Marks;

		float percentage = ((obtain_sum*100)/totalMarks);

		System.out.println();

		System.out.println("****************************************");
		System.out.println("********** Student Mark Sheet ********* ");
		System.out.println("****************************************");
		System.out.println();

		System.out.println(first_Subject + " = " + first_Subject_Marks);
		System.out.println(second_Subject + " = " + second_Subject_Marks);
		System.out.println(third_Subject + " = " + third_Subject_Marks);
		System.out.println(fourth_Subject + " = " + fourth_Subject_Marks);
		System.out.println(fifth_Subject + " = " + fifth_Subject_Marks);
		
		System.out.println();

		System.out.println("Obtain Marks : " + obtain_sum);

		System.out.println();

		System.out.println("Maximum Marks : " +totalMarks);

		System.out.println();

		System.out.println("Percentage of Total Subject Marks : " +percentage);
		
		System.out.println();

		System.out.println("Thank You For Use This Software");

	}
}