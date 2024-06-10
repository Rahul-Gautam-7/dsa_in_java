import java.util.LinkedList;

import org.w3c.dom.NodeList;

public class DelnElement {

    Node head;

    class Node implements NodeList{

        String data;
        DelnElement.Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            
        }

        @Override
        public org.w3c.dom.Node item(int index) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'item'");
        }

        @Override
        public int getLength() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getLength'");
        }
    }


    public NodeList removeelement(Node head,int n){

        if(head == null){
            return null;
        }
        int size = 0;
        Node curr  =head;
        while (curr != null) {

            curr =curr.next;
            size++;
        }
        if(n== size)
        {
            return head.next;
        }
        int ios = size-n;
        Node prev=head;
        int i=1;
        while (i<ios) {
            prev = prev.next;
            i++;
            
        }
        prev.next = prev.next.next;
        return head;

    }

    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        System.out.println(lst);
        removeelement(1,4);

    }
}
