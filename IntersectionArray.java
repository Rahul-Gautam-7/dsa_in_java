import java.util.*;

public class IntersectionArray {

    public static int Intersection(int ar1[],int ar2[])
    {
        int count=0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<ar1.length;i++)
        {
            set.add(ar1[i]);
        }
        for(int j=0;j<ar2.length;j++)
        {
            if(set.contains(ar2[j]))
            {
                count++;
                set.remove(ar2[j]);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int ar1[] ={1,4,5,2,6};
        int ar2[]= {1,4,3,6,7,83,2,2};

        System.out.println(Intersection(ar1, ar2));
    }
    
}
