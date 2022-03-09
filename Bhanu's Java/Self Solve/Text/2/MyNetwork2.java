import java.io.*;
import java.net.*;
import java.util.*;	
public class MyNetwork2
{
	public static void main(String []args)
	{
		try
		{
			/*******************************************/	
		Scanner a = new Scanner(System.in);
			System.out.println("Enter Message : ");
			String b = a.nextLine();
			
				Socket t = new Socket("localhost",6666);
				DataOutputStream dout = new DataOutputStream(t.getOutputStream());
				dout.writeUTF(b);
				dout.flush();
				dout.close();
				t.close();
				
			/***********************************************/			
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();  //establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String)dis.readUTF();
			System.out.println("message = "+str);
			ss.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}