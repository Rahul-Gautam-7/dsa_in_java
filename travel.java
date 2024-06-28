import java.util.*;
public class travel {

    public static String getStart(HashMap<String,String> tick)
    {
        HashMap<String,String> revHashMap = new HashMap<>();

        for(String key:tick.keySet())
        {
            revHashMap.put(tick.get(key),key);
        }

        for(String key:tick.keySet())
        {
            if(!revHashMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {

            System.out.print(start+"->");
            start = tickets.get(start);
            
        }
        System.out.println(start);
    }
    
}
