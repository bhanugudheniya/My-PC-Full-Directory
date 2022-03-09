// My Sir G -- Lecture - 14 -- Inheritance
/***********************************************/

//Base Class

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
	
	public int getAge()
	{
		return(age);
	}
	
	public String getName()
	{
		return(name);
	}
}

//Derived class

class Student extends Person	
{
	private int rollno;
	
	public void setRollno(int r)
	{
		rollno = r;
	}
	
	public int getRollno()
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
		s1.setRollno(100);
		s1.setName("Bhanu");
		s1.setAge(19);
		
	System.out.println("Roll No  : " +s1.getRollno());
	System.out.println("Name : " +s1.getName());
	System.out.println("Age : " +s1.getAge());
	}
}