//java program use main as starting point and call both the method

import java.io.*; 
import java.util.Scanner;
class Person { 	
   Scanner Scan = new Scanner(System.in); 
   String name, gender, address, contact;
     void accept()
      {
      System.out.println("Enter your name");
      name = Scan.nextLine();
      System.out.println("Enter your gender M/F");
      gender = Scan.nextLine();
      System.out.println("Enter your Address");
      address = Scan.nextLine();
      System.out.println("Enter your contact");
      contact = Scan.nextLine();
     }
     void display()
      {
       System.out.println("Name :" +name);
       System.out.println(" Gender :" +gender);
       System.out.println(" Address :" +address);
       System.out.println(" Contact :" +contact);
	}
      } 
class Person_P { 
   public static void main (String[] args) { 
     Person p = new Person(); 
     Scanner Scan = new Scanner(System.in);
      p.accept();
      p.display();
    } 
  }
