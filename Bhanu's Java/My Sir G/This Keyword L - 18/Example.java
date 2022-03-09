class Box
{
	private int l, b, h;			//instance member variable
	
	public void setDimension(int l, int b, int h)			// instance member function
	
	/* the variables in function "setDimension" is "local variable" */
	/** the name of "instance member variable" and "local variable" are same,
		so it create confusion between both.
		So we can use "this" keyword with instance member variable to 
		differentiate b/w them
	*/
	
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	public void showDimension()
	{
		System.out.println("L = "+l);
		System.out.println("B = "+b);
		System.out.println("H = "+h);
	}
}

public class Example
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.setDimension(12,10,8);
		b1.showDimension();
	}
}