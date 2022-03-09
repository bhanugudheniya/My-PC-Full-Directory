import java.util.Scanner;

class p1 { 
	
	Scanner sc = new Scanner(System.in); 
	String name , gender , address , contact;
	void accept()
	{
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your gender M/F");
		gender = sc.nextLine();
		System.out.println("Enter your Address");
		address = sc.nextLine();
		System.out.println("Enter your contact");
		contact = sc.nextLine();
	}
		void display()
		{
			System.out.println("Name :" +name);
			System.out.println("Gender :" +gender);
			System.out.println("Address :" +address);
			System.out.println("Contact :" +contact);
			}
	
} 
class student extends p1
{
	String Rollno,course;
	void accept()
	{
		System.out.println("FOR STUDENT");
		super.accept();	
		System.out.println("Enter your Roll No");
		Rollno = sc.nextLine();
		System.out.println("Enter your course");
		course = sc.nextLine();
	}
	void display()
		{
			super.display();
			System.out.println("Rollno:" +Rollno);
			System.out.println("course :" +course);
			
			}
}

class Employee extends p1
{
	String Empid,Department;
	void accept()
	{
		System.out.println("-----------------------------------------------------------------");
		System.out.println("FOR employee");
		super.accept();	
		System.out.println("Enter your EMPID");
		Empid = sc.nextLine();
		System.out.println("Enter your DEPARTMENT");
		Department = sc.nextLine();
	}
	void display()
		{
			super.display();
			System.out.println("Empid:" +Empid);
			System.out.println("Departmet :" +Department);
			
			}
}

class person { 
	public static void main (String[] args) { 
	
	       student s = new student(); 
		Employee emp = new Employee(); 
		Scanner sc = new Scanner(System.in);
		s.accept();
		s.display();
		emp.accept();
		emp.display();
		
	} 
}
