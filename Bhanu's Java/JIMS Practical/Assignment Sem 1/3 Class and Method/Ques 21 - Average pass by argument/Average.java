//java program to calculate average of numbers passed as an argument and user is free to pass any or zero number of arguments

class Average {
  public static void main(String args[])
   {
    long n,p;
    int i;
    double res=0;   
      n=args.length;
      for(i=0;i<n;i++)
        res=res+Integer.parseInt(args[i]);	
	System.out.print("Average of (");

	for(i=0;i<n-1;i++)
	System.out.print(args[i]+",");
	System.out.println(args[i]+")="+res/n);
   }
}
