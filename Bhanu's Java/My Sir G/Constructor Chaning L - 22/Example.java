class A
{
	public A()
	{
		System.out.println("A 1");
	}
}

class B extends A
{
	public B()
	{
		this(4);
		System.out.println("B 1");
	}
	
	public B(int k)
	{
		System.out.println("B 2");
	}
}
public class Example
{
	public static void main(String []args)
	{
	B b1 = new B();
	}
}