class ListNode{
    int data;
    ListNode next;

    ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}







class Linkedlistpalindrome{

    static void prntlst(ListNode head)
    {
        ListNode ptr = head;
        while(ptr != null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    //findmiddle function
    public static ListNode findmiddle(ListNode head)
    {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next !=null && hare.next.next !=null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;

    }

    //reverse function
    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }


    public static ListNode palindrome(ListNode head)
    {
        if(head == null || head.next == null)
        {
            System.out.println(" Linked List is palindrome ");
        }

        ListNode middle = findmiddle(head);
        ListNode secondHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while(secondHalfStart != null)
        {
            if(firstHalfStart.data != secondHalfStart.data)
            {
                System.out.println("Linked list is not palindrome ");
            }
            
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

       
        return null;
    }






    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);

        prntlst(head);
        head = palindrome(head);


    }
}