import java.util.*;
public class Queuest{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(1);
        q.add(4);
        q.add(5);

        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    
}