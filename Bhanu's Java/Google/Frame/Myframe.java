import java.awt.*;
public class Myframe extends Frame
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,300);
		this.setTitle("Frame");
	}
	public static void main(String[] args)
	{
		Myframe f = new Myframe();
	}
}