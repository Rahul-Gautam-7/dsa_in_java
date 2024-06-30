import java.util.*;
public class SubarryK {
    
    public static void main(String[] args) {
        
        int ar[] = {10,2,-2,-20,10};
        int k=10;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum=0;
        int ans =0;
        
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum))
            {
                map.put(sum, map.get(sum)+1);
            }
            else
            {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
