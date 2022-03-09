import java.io.*;

class File_char_Reading 
{
FileWriter outs;
FileReader ins;
File f;

File_char_Reading() throws IOException
{
 f = new File("My_file1.docx");
 ins = new FileReader(f);
//f = new File("My_file1.docx");
 outs = new FileWriter(f);
}

void read_char_file() throws IOException
{
 int c;
 while ((c = ins.read()) != -1)
        {
           System.out.print((char)c);
         }
System.out.println(" ");
System.out.println("------------reach end of file-----------");
ins.close();
}

void write_char_file() throws IOException
{
	String d = "File writer Class is used for writing";
        System.out.println("File contents are:" + d);
	outs.write(d);
	System.out.println(" ");
	System.out.println("data written in file");
	outs.close();	
}

public static void main(String args[]) throws IOException
{
File_char_Reading  f1 = new File_char_Reading ();
System.out.println("writing files through fileWriter class");
f1.write_char_file();
System.out.println(" ");
System.out.println("Reading files through fileReader class");
f1.read_char_file();
}}

