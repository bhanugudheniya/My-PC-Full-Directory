import java.util.ArrayList;
import java.util.*;

class Demo_Iterator
{
public static void main(String args[])
{
ArrayList<String> ar = new ArrayList<String>();
ar.add("ABC");
ar.add("DEF");
ar.add("GHI");
ar.add("JKL");
ar.add("MNO");

//list can be displayed using: For each loop, iterator
System.out.println(ar);


//Use of iterator to display list

Iterator<String> itr = ar.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

//Modifying an element of collection
ListIterator <String> itr1 = ar.listIterator();


while(itr1.hasNext())
{
String val= itr1.next();
itr1.set(val + "@@@");
}


Iterator<String> itr2 = ar.iterator();
while(itr2.hasNext())
{
System.out.println(itr2.next());
}

}
    }
