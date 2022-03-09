class A
{
	int a;
	
	public A(int x)			//constructor with argument (default constructor doesn't call arguments)
	{
		a = x;
		System.out.println("A");
	}
}

class B extends A
{
	int b;
	
	public B()
	{
		super(4);				//"super" keyword can help to call constructor of super class
		System.out.println("B");
	}
}

class Example
{
	public static void main(String[] args)
	{
		B obj = new B();
	}
}