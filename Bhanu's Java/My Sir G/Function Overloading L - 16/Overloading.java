class A
{
	void f1(int x)
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void f1(int x, int y)
	{
		System.out.println("Class B");
	}
}

class Overloading
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.f1(2);
		obj.f1(1,4);
	}
}