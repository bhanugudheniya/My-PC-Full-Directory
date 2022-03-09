public class Box
{
	public int l,b,h;
	
	public Box()
	{
		l=10;
		b=8;
		h=7;
	}
	
	public Box(int L, int B, int H)
	{
		l=L;
		b=B;
		h=H;
		
		System.out.println(" "+L+ " "+B+ " "+H);
	}
	
	public static void main(String []args)
	{
		Box b1 = new Box();
		Box b2 = new Box();
	}
}
	