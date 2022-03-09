//Person class -- Base Class

class Person
{
	private int age;
	private String name;
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return(name);
	}
	
	public int getAge()
	{
		return(age);
	}
}

//Student class -- Derived Class
class Student extends Person
{
	private int rollno;
	
	public void setRollNumber(int r)
	{
		rollno = r;
	}
	
	public int getRollNumber()
	{
		return(rollno);
	}
}

//Main Function

public class Inheritance
{
	public static void main(String []args)
	{
		Student s1 = new Student();
		
		s1.setRollNumber(100);
		s1.setName("Bhanu Gudheniya");
		s1.setAge(20);
		
		System.out.println("Roll Number : " +s1.getRollNumber());
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());
	}
}