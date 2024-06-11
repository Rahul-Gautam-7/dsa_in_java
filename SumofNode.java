import java.util.*;
public class SumofNode {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }

    static class  binarytree {

        static int idx = -1;
        static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;

        }
    
        
    }

   public static int sumOFNOde(Node root)
   {
        if(root == null)
        {
            return 0;
        }
        int leftSum = sumOFNOde(root.left);
        int rightSum = sumOFNOde(root.right);
        return leftSum + rightSum + root.data;
   }

    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree b = new binarytree();
        Node root = b.buildtree(nodes);

        System.out.println(sumOFNOde(root));
    }
    
}
