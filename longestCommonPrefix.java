import java.util.*;
public class longestCommonPrefix {
    public static void main(String[] args) {
        
        String str[]={"aab","aac","aaz","aa"};
        
        Arrays.sort(str);

        String first=str[0];
        String last = str[str.length-1];
        int minlength=Math.min(first.length(),last.length());

        
        int i=0;
        while(i<minlength && first.charAt(i) == last.charAt(i))
        {
            i++;
        }

            System.out.println(first.substring(0,i));
        

      
    }
}
