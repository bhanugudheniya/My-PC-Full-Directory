import java.util.*;

class Demo_HashMap
{

public static void main(String args[])
{

HashMap<String, String> hm = new HashMap();

//adding data sets in Map 

hm.put("ABC", "rohini");
hm.put("DEF", "Janak puri");
hm.put("GHI", "rohini");
hm.put("jkl", "pp");


// to get value of "DEF"
System.out.println("address of DEF is" + hm.get("DEF"));


//although Map is not collection but still entrySet()  method can be used to travese through data sets

Set <Map.Entry <String, String>> col = hm.entrySet();

for( Map.Entry<String, String>   val: col)
{
System.out.print("Name " + val.getKey());
System.out.print("Address " + val.getValue());
System.out.println();
}
}
}
