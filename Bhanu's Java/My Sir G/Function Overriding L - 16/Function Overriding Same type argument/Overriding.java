class A
{
	public void f1(int x)
	{
		System.out.println("Class A");
	}
}

class B
{
	public void f1(int x)
	{
		System.out.println("Class B");
	}
}

public class Overriding
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.f1(2);
	}
}