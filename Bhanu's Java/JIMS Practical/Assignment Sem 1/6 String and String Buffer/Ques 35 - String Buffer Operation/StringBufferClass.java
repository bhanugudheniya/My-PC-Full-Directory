import java.lang.String;
// import java.lang.character;
import java.lang.*;
class StringBufferClass{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello Jims Students.");  
System.out.println(sb.capacity());
sb.ensureCapacity(100);
System.out.println(sb.capacity());
char c=Character.toUpperCase(sb.charAt(9));
System.out.println(c);


System.out.println(sb.substring(9,19));
sb.append("How are you?");
System.out.println(sb);
System.out.println(sb.insert(6,"MCA I "));
sb.replace(12,16,"JIMS");
System.out.println(sb);
System.out.println(sb.substring(17,25));
System.out.println(sb.delete(0,5));


}  
}
