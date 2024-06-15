public class printInRange {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data =data;
        }
    }
    public static Node buildbst(Node root,int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }
        //lst
        if(root.data > val)
        {
             root.left = buildbst(root.left, val);
        }
        else
        {
            root.right = buildbst(root.right, val);
        }

        return root;
    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printRange(Node root,int X,int Y)
    {
        if(root == null)
        {
            return;
        }
        if(root.data>=X && root.data<=Y)
        {
            printRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printRange(root.right, X, Y);
        }
        else if(root.data >= Y)
        {
            printRange(root.left, X, Y);
        }
        else
        {
            printRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        int values[] ={5,1,3,4,2,7};

        Node root = null;

        for(int i=0;i<values.length;i++)
        {
            root = buildbst(root, values[i]);
        }
        inorder(root);
        System.out.println();
        printRange(root, 3, 7);
    }
    
}
