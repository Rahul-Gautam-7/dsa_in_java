public class ListNode{
    int data;
  ListNode next;

  ListNode(int value)
  {
    this.data = value;
    this.next = null;
  }
    
 }

class DelEement{


    static void printList(ListNode head)
    {
      ListNode ptr = head;
      while (ptr != null) {
        System.out.print(ptr.data + " ");
        ptr = ptr.next;
      }
      System.out.println();
    }

    public static ListNode delElement(ListNode head,int n) {

        if(head.next == null)
        {
            return  null;
        }
        int size=0;
        ListNode curr = head;
        while(curr !=null)
        {
            curr=curr.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }

        int ios=size-n;
        ListNode prev=head;
        int i=1;
        while(i<ios)
        {
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        printList(head);
        head = delElement(head,3);
        printList(head);
    }
    
}



