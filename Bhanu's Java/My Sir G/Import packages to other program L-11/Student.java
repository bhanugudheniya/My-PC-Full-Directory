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
// pack 2 -- Student.java

package pack2;
public class Student
{
	private int rollno;
	private String name;
	
	public void setRollno(int r)
	{
		rollno = r;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getRollno()
	{
		return(rollno);
	}
	
	public String getName()
	{
		return(name);
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