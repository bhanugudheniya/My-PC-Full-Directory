import java.util.ArrayList ;
class D_array_List
{
public static void main (String args[])
{
ArrayList <String> a1 = new ArrayList<String>(3);
a1.add("A");
a1.add("B");
a1.add("C");
a1.add("D");
a1.add("E");
System.out.println("Size of List is " + a1.size());
a1.add(2,"M");
System.out.println("list is as follows" + a1); 
System.out.println("Size of the List is " + a1.size());
a1.remove("C");
a1.remove(2);
System.out.println("Size of the List is " + a1.size());
}
}
