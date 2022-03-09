import java.lang.String;
import java.util.Arrays;
public class MyString34{  
public static void main(String args[]){  
String str1="Welcome to Java Tutorial.";
String str2="Today's topic is String Handling in Java";
String[] strarray=null;
System.out.println(str1);
System.out.println(str2);
System.out.println(str1.concat(str2));
System.out.println(str1.toLowerCase());
System.out.println(str1.toUpperCase());
System.out.println(str1.equals(str2));
str1.replace('i','I');
str2.replace('i','I');
System.out.println(str1);
System.out.println(str2);
System.out.println(str1.substring(11,15));
System.out.println(str1.charAt(7));
strarray=str1.split(" ");
System.out.println(Arrays.toString(strarray));
}}  
