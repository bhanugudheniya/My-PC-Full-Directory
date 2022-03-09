import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Try
{
	public static void main(String []args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Website URL : ");
		String b = a.nextLine();
		
		try{
		InetAddress ip = InetAddress.getByName(b);
		System.out.println("Host Name : " +ip.getHostName());
			System.out.println("IP Address : "+ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}