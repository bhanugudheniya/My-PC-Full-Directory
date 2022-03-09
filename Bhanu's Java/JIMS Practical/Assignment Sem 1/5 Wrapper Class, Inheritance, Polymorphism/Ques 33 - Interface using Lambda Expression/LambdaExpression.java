import java.util.Scanner;
interface student{  
    public void data();  
}  
  
public class LambdaExpression {  
    public static void main(String[] args) {  
       Scanner sc = new Scanner(System.in); 
       student stu=()->{  
	System.out.println("ENTER NAME");
	System.out.println("NAME "+sc.nextLine());
	System.out.println("ENTER ROLLNO");
	System.out.println("ROLL NO."+sc.nextLine());
	System.out.println("ENTER COURSE");
 	System.out.println("COURSE "+sc.nextLine()); 
	System.out.println("ENTER SHIFT");
    System.out.println("SHIFT"+sc.nextLine()); 
	   
	   
	 
        };  
        stu.data();  
    }  
}  
