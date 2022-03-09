import java.util.Scanner;

class Illegal extends Exception
{
	Illegal()
	{
		System.out.println("MARKS CAN NOT BE LESS THN 0 AND MORE THN 100");

	}
}
public class CheckedException
{
      public static void main(String args[])
      {
          
          int total , perc, eng , hindi , math;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.println("Enter Hindi Marks ");
          hindi=SC.nextInt();
	  		try
			{
				if(hindi<=0 || hindi>100)
				{
					throw new Illegal();
				}
			}
			catch(Illegal e)
		{
			System.out.println("EXCEPTION HAS OCCURED");
			System.exit(0);

		}
          
	  System.out.println("Enter English Marks: ");
          eng=SC.nextInt();
			try
			{
				if(eng<=0 || eng>100)
				{
					throw new Illegal();
				}
			}
			catch(Illegal e)
		{
			System.out.println("EXCEPTION HAS OCCURED");
			System.exit(0);

		}
          
          System.out.println("Enter Maths Marks: ");
          math=SC.nextInt();
		try
			{
				if(math<=0 || math>100)
				{
					throw new Illegal();
				}
			}
		catch(Illegal e)
		{
			System.out.println("EXCEPTION HAS OCCURED");
			System.exit(0);

		}
          
          total= math + eng + hindi;
	  System.out.println("Total Marks: "+total );
	  perc = ((total*100)/300);
		if ((perc>=80) && (perc<=100))
		{
			System.out.println("Your Grade is A");
		}
		else if ((perc>=60) && (perc <=79))
		{
			System.out.println("Your Grade is B");
		}
		else if ((perc>=40) && (perc <=59))
		{
			System.out.println("Your Grade is c");
		}
		else 
		{
			System.out.println("Your Grade is D");
		}
            
      }
          
}
