package dsa_in_java;
import java.util.ArrayList;
import java.util.Collections;

public class ArrrayLst {

    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        //ArrayList<Integer> lst = new ArrayList<>();

        //add elements
        lst.add(9);
        lst.add(3);
        lst.add(5);
        lst.add(89);
        lst.add(34);
        System.out.println(lst);


        //get elements
       int v= lst.get(3);
       System.out.println(v);

       //mofify in between
       lst.set(1,100);
       System.out.println(lst);

       //add ele in between
       lst.add(1,2345);
       System.out.println(lst);

       //remove 
       lst.remove(1);
       System.out.println(lst);

       //size
       int s=lst.size();
       System.out.println(s);

       //iteration
       for(int i=0;i<lst.size();i++){
        System.out.print(lst.get(i)+" ");
       }
       System.out.println();
       
       //sorting only in arraylist cannot use in array.
       Collections.sort(lst);
       System.out.println(lst);


    }
    
}