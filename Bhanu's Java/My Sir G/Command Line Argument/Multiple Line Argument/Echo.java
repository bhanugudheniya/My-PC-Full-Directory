/* My Sir G -- Lecture - 9 -- Command Line Arguments */
/* Program For Multiple Arguments */
/***********************************************************/

public class Echo
{
	public static void main(String[] args)
	{
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
	}
}


//OUTPUT
/*  -- Compling -- */
/* javac Echo.java
	java Echo Bhanu Gudheniya
*/

/**Bhanu
   Gudheniya*/