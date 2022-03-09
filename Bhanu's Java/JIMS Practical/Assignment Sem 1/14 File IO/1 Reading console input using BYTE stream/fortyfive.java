import java.io.*;
class  fortyfive
{
public static void main(String args[]) throws IOException
{
BufferedInputStream br = new BufferedInputStream(System.in);
System.out.println("Enter characters press 'q' to quit");
char c;
do
{c= (char)br.read();
System.out.println(c);
}while(c!='q');}}
