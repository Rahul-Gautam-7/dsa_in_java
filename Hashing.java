import java.util.HashSet;
import java.util.Iterator;
public class Hashing {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());

        if(set.contains(2))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("Not found");
        }

        set.remove(2);
        if(!set.contains(2))
        {
            System.out.println("Deleted successfully");
        }
        System.out.println(set);

        
        //iterator
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }


    
}
