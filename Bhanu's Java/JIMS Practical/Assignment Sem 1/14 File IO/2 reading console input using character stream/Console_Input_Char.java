import java.io.*;
class  Console_Input_Char
{

public static void main(String args[]) throws IOException
{
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
System.out.println("Enter characters press 'q' to quit");
char c;
do
{
c= (char)br.read();
System.out.println(c);
}while(c!='q');

}

}
