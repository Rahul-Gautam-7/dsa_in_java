class DetectCycleLinkedlst{

    static  Node head;

    static  class Node{

        int data;
        Node next;

        Node(int data) {

            this.data =data;
            this.next =null;
        }
    }
    static  public  void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    //hare turtle approach or floyd's algorithm
    public static boolean hasCycle(Node head)
    {
        if(head == null)
        {
            return false;
        }
        Node hare =head;
        Node turtle = head;

        while(hare !=null && hare.next !=null)
        {
            hare =hare.next.next;
            turtle = turtle.next;

            if(hare == turtle)
            {
                return  true;
            }
        }
        return  false;

    }




    public static void main(String[] args) {

       DetectCycleLinkedlst lst = new DetectCycleLinkedlst();
       lst.push(1);
       lst.push(2);
       lst.push(3);
       lst.push(4);

       //createing loop in linkied list
       lst.head.next.next.next.next = lst.head;

       System.out.println(hasCycle(head));
       
        
    }
}