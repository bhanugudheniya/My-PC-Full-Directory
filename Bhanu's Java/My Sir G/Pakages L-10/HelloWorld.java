// My Sir G -- Lecture - 10 -- Pakages
/* package will make folder and the .java file after compiling store there .class file in this folder(package). */
 
/********************************************/

package world;
public class HelloWorld
{
	public static void main(String []args)
	{
		System.out.println("Hello World");
	}
}


/**
Compiling and Run
->> javac -d . HelloWorld.java   // " . " for current folder
								 // " .. " for parent folder
->> java world.HelloWorld

*/

/* OUTPUT 
   Hello World 
   */