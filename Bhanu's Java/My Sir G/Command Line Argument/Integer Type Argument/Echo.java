/* My Sir G -- Lecture - 9 -- Command Line Arguments */
/* Program For Multiple Arguments */
/***********************************************************/
/**For Sum the Number with converting String type value into Integer type value using ".parse" */

public class Echo
{
	public static void main(String[] args)
	{
		int s=0;
		for(int i=0; i<args.length; i++)
			s = s+Integer.parseInt(args[i]);
		System.out.println("Sum is " +s);
	}
}


//OUTPUT
/*  -- Compling -- */
/* javac Echo.java
	java Echo 1 2 3 4 5
*/

/** Sum is 15 */