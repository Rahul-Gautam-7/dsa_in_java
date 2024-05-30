
public class Reverselinkedlst {

   static Node head;

    class Node{

        String data;
        Node next;
        
        Node(String data){

            this.data = data;
            this.next=null;
            
        }
    }


    public static void reverselst(LinkedList<Integer> lst){

        if(head == null || head.next == null)
        {
            return;
        }

        Node prev = head;
        Node curr=head.next;

        while (curr != null) {

            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            
        }
        head.next = null;
        head =prev;

    }

    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);

        System.out.println(lst);
        
        reverselst(lst);
        System.out.println(lst);
        
    }

    
}
