import java.util.*;

public class UnionArray {

    public static int union(int ar1[],int ar2[])
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<ar1.length;i++)
        {
            set.add(ar1[i]);
        }
        for(int j=0;j<ar2.length;j++)
        {
            set.add(ar2[j]);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int ar1[] ={1,4,5,2,6};
        int ar2[]= {1,4,3,6,7,83,2,2};

        System.out.println(union(ar1, ar2));
    }
    
}
