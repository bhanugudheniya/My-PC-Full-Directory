// My Sir G -- Lecture - 11 -- Use of Import Classes of other Packages
/* In this program we can import one  packages to another program */
/***************************************************************************/
/**
								_______
							   |	   |	{myapp}
							   |       |
							   |       |
							    -------
							   /	   \
							  /			\	
							 / 			 \
							/			  \
						   /			   \
						   
					____				____
		{pack 1}   |	\_____		   |	\_____		{pack 2}
				   |		  |		   |		  |
				   |		  |		   |		  |
				   |		  |		   |		  |
				    ----------			----------
						 |					 |
						 |      			 |
						 V					 V
					__________			__________
				   |		  |		   |		  |
				   |		  |		   |		  |
				   |		  |		   |		  |
				   |		  |        |          |
				    ----------			----------
				{Example.class}		  {Student.class}
				
*/
/******************************************************************************/
// pack2 -- Example.java

package pack1;
import pack2.Student;

public class Example
{
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.setRollno(100);
		s1.setName("Bhanu");
		System.out.println("Roll No : " +s1.getRollno());
		System.out.println("Name : " +s1.getName());
	}
}

/*  Compiling 
->> javac -d . Stduent.java
->> javac -d . Example.java
*/

/* Run
->>> java pack1.Example
*/

//OUTPUT

/**  Roll No : 100
	 Name : Bhanu
*/