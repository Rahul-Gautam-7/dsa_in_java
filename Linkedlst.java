import java.util.*;

class Linkedlst{
    private int size;
    Linkedlst()
    {
        this.size = 0;
    }

    Node head;

    class Node{

        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add in linked list first
    public void addFirst(String data)
    {
        Node newnNode = new Node(data);
        if(head == null)
        {
            head =newnNode;
            return;
        }

        newnNode.next = head;
        head = newnNode;
    
    }

    //add in linked list last
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next=newNode;
    }

    //delete first
    public void delFirst()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        head =head.next;
    }

    //delete last
    public void delLast()
    {
        if(head == null)
        {
            System.out.println("List is empty ");
        }
        size--;
        if(head.next == null)
        {
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastnode = head.next;
        while (lastnode.next !=null) 
        {
            lastnode = lastnode.next;
            secondLast = secondLast.next;    
        }
        secondLast.next = null;
    }
    public int getSize()
    {
        return size;
    }

    //print lst
    public void prntlst()
    {
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) 
        {
            System.out.print(curNode.data+" -> ");    
            curNode = curNode.next; 
        }
        System.out.println("null");


    }




    public static void main(String[] args) {

        Linkedlst lst = new Linkedlst();
        lst.addFirst("ram");
        lst.addFirst("sita");
        lst.addFirst("hanuman");
        lst.addLast("ramayan");
        lst.addLast("ayodhya");
        
        lst.delFirst();

        lst.delLast();

        lst.prntlst();
       System.out.println(lst.getSize());
        
    }

}