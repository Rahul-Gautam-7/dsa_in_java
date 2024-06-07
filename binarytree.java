public class binarytree{

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

    //preorder taversal in binary tree
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder taversal in binary tree
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //postorder taversal in binary tree
    public static void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreee b = new BinaryTreee();
        Node root = b.buildtree(nodes);

       System.out.println("preorder");
       preorder(root);
       System.out.println();
       System.out.println("Inorder");
       System.out.println();
       inorder(root); 
       System.out.println();
       System.out.println("post order"); 
       postorder(root);    

    }
}