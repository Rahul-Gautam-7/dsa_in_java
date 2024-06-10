import java.util.*;
public class levelOrder{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreee{
        static int idx =-1;
        static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }

    public static void levelordertraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) 
        {
            Node newnode = q.remove();
            if(newnode == null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(newnode.data+" ");
                if(newnode.left !=null)
                {
                    q.add(newnode.left);
                }
                if(newnode.right != null)
                {
                    q.add(newnode.right);
                }
            }
            
        }
    }

  
    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreee b = new BinaryTreee();
        Node root = b.buildtree(nodes);

        levelordertraversal(root);

      

    }
}
