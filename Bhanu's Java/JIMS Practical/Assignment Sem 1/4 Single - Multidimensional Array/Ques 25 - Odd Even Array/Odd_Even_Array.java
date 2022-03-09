import java.util.Scanner;
public class Odd_Even_Array
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int arr[]=new int[6];
  int i,ch;
  for(i=0;i<6;i++)
  {
   System.out.println("Enter a no.:");
   arr[i]=s.nextInt();
  }
  System.out.println("Which nos. you want to print???");
  System.out.println("Enter 1 for odd"); 
  System.out.println("Enter 2 for even");
  System.out.println("Enter your choice:");
  ch=s.nextInt();
  System.out.println("");
  if(ch==1)
  {
   for(i=0;i<6;i++)
   { 
    if(arr[i]%2!=0)
    {
     System.out.println(arr[i]);
    }
   }
  }
  else if(ch==2)
  {
    for(i=0;i<6;i++)
   { 
    if(arr[i]%2==0)
    {
     System.out.println(arr[i]);
    }
   }
  }
  else
  {
   System.out.println("Invalid input");
  }
 }
}
