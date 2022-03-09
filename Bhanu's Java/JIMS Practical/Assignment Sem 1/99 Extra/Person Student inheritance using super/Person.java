import java.util.*;

class Person
{	
	Scanner sc = new Scanner(System.in);
	String name;
	
	String address;
	void accept()
	{	
		
		System.out.println("Enter your name ");
		name = sc.nextLine();
		
		System.out.println("Enter your address ");
		address = sc.nextLine();
	}
	void display()
	{
		System.out.println("Your name : " +name);
		System.out.println("Your address "+address);
		
	}
};
class Student1 extends Person
	{
		
		int roll;
		String course;
		
		void accept()
	{
		super.accept();
		System.out.println("Enter your course ");
		course = sc.nextLine();
		System.out.println("Enter your roll no. ");
		roll = sc.nextInt();

		
	}
		void display()
		{	
			super.display();
			System.out.println("Your roll no : " +roll);
			System.out.println("Your course "+course);
		}


		public static void main(String args[])   
	{
		Student1 s = new Student1();
		s.accept();
		s.display();   
	}
};
