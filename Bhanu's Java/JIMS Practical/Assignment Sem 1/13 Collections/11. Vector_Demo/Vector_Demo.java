import java.util.*;
class Vector_Demo
{
public static void main(String args[])
{
Vector<Integer> v = new Vector<Integer>(3,2);

System.out.println("Capacity of vactor is" + v.capacity());
v.addElement(1);
v.addElement(2);
v.addElement(3);
v.addElement(4);
System.out.println("Capacity of vactor is" + v.capacity());
}
}
