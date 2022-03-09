import java.util.*;

class Demo_TreeMap
{

public static void main(String args[])
{

TreeMap<Integer, String> hm = new TreeMap();
hm.put(new Integer(10), "rohini");
hm.put(new Integer(5), "Janak puri");
hm.put(new Integer(3), "rohini");
hm.put(new Integer(1), "pp");


// to get value of "DEF"
System.out.println("address of DEF is" + hm.get(5));


//although Map is not collection but still entrySet()  method can be used to travese through data sets

Set <Map.Entry <Integer, String>> col = hm.entrySet();

for( Map.Entry<Integer, String>   val: col)
{
System.out.println( val.getKey() + val.getValue());

}
}
}
