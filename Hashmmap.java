import java.util.*;

public class Hashmmap {  
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 129);
        map.put("China", 454);
        map.put("America", 657);
        map.put("China", 222);
        map.put("china", 111);
        System.out.println(map);

        //search
        if(map.containsKey("India"))
        {
            System.out.println("present in map");
        }
        else
        {
            System.out.println("not present in map");
        }
        System.out.println(map.get("India"));
        System.out.println(map.get("chinaa"));  //return null
        

        //iterator using new for loop
        // int ar[]={2,435,123};
        // for(int val:ar)
        // {
        //     System.out.print(val+" ");

        // }

        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.print(e.getKey()+" : ");
            System.out.println(e.getValue());
        }

        //remove
        map.remove("china");
        System.out.println(map);
    }
}
