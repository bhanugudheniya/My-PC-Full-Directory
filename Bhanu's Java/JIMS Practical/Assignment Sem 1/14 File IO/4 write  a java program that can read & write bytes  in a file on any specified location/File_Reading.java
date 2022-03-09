import java.io.*;
class File_Reading 
{
FileInputStream in;
File f1;
File dir;
FileOutputStream out;


File_Reading()throws IOException
{
//File class constructors

//      dir = new File(C:\\Program Files\\Java\\JavaCodes);
//	f1 = new File(dir, "My_file.docx");
//	f1 = new File();
	f1 = new File("E:\\Bhanu's Folder 4\\Programming Folder\\Bhanu's Java\\JIMS Practical\\Assignment Sem 1\\14 File IO\\4 write  a java program that can read & write bytes  in a file on any specified location\\My_file1.docx");
	out = new FileOutputStream(f1,true);
        in = new FileInputStream(f1);
}

void write_file() throws IOException
{

	String d = "this is my file";
	byte c[] = d.getBytes();
	for(int i=0;i<c.length;i++){
	 out.write(c[i]);
	}
	System.out.println("data written in file");
	out.close();
}

void read_file() throws IOException
{

 int t_bytes = in.available();
 for(int i=0;i<t_bytes;i++)
        {
	    char d=(char)in.read();
            System.out.print(d);
        }
System.out.println(" ");
System.out.println("-----------reach end of file----------");
in.close();
}

public static void main(String args[]) throws IOException
{
File_Reading f1 = new File_Reading();
System.out.println("writing files through file Input stream class");
f1.write_file();
System.out.println(" ");
System.out.println("Reading files through file Output stream class");
f1.read_file();
}}
