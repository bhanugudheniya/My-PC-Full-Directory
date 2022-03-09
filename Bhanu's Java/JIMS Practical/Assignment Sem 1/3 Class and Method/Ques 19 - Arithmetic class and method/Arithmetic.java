//java programs to perform +,-,*,/,% and Use classes  and methods to performs above mentioned task

import java.io.*; 
import java.util.Scanner;
class Arithmetic_A { 
    int sum = 0, sub=0, div=0, mul=0, mod=0; 
      public int add(int a, int b){ 
	sum = a + b;  
	return sum; 
	} 
      public int sub(int a, int b){ 
	sub = a - b;  
	return sub; 
	} 
      public int mul(int a, int b){ 
	mul = a * b;  
	return mul; 
	}
      public int div(int a, int b){ 
	div = a % b;  
	return div; 
	} 
      public int mod(int a, int b){ 
	mod = a / b;  
	return mod; 
	} 	
     } 
class Arithmetic { 
   public static void main (String[] args) { 
     int a, b;
	Arithmetic_A c = new Arithmetic_A(); 
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	a = Scan.nextInt();
	b = Scan.nextInt();
	int s = c.add(a,b); 
	int su = c.sub(a,b); 
	int m = c.mul(a,b); 
	int d = c.div(a,b); 
	int mo = c.mod(a,b); 
	System.out.println("Sum of two integer values :"+ s); 
	System.out.println("Subtraction of two integer values :"+ su); 
	System.out.println("Multiplication of two integer values :"+ m); 
	System.out.println("Division of two integer values :"+ d); 
	System.out.println("Mod of two integer values :"+ mo);	
   } 
}
