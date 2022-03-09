import java.io.*;
import java.net.*;
import java.util.*;	
	public class MyClient
	{
		public static void main(String []args)
		{
			Scanner a = new Scanner(System.in);
			System.out.println("Enter Message : ");
			String b = a.nextLine();
			
			try{
				Socket s = new Socket("localhost",6666);
				DataOutputStream dout = new DataOutputStream(s.getOutputStream());
				dout.writeUTF(b);
				dout.flush();
				dout.close();
				s.close();
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}