import java.util.*;
public class DiameterOfTree {

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

   static class TreeInfo
   {
        int diam;
        int ht;

        TreeInfo(int diam,int ht)
        {
            this.diam = diam;
            this.ht =ht;
        }
   }

   public static TreeInfo Diameter(Node root)
   {
        if(root == null)
        {
            return new TreeInfo(0, 0);
        }
        
        TreeInfo left = Diameter(root.left);
        TreeInfo right = Diameter(root.right);

        int myHeight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;

        int diam3 = left.ht +right.ht +1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo Info = new TreeInfo(mydiam, myHeight);
        return Info;
   }

    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree b = new binarytree();
        Node root = b.buildtree(nodes);

        System.out.println(Diameter(root).diam);
    }
    
}
