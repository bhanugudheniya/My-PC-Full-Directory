import java.util.*;
class Linkedlist
{
public static void main(String args[])
{
LinkedList <String> l1 = new LinkedList<String>();
l1.add("A");
l1.add("B");
l1.add("C");
l1.add("D");
System.out.println("Contents of list are:" + l1);

//dipslaying elements of list
for(String a: l1)
{
System.out.println(a);
}
}
}
