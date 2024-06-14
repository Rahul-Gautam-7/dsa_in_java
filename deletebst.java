public class deletebst {

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

    public static Node delete(Node root,int val)
    {
        if(root.data > val)
        {
           root.left = delete(root.left, val);
        }
        else if(root.data < val)
        {
            root.right = delete(root.right, val);
        }
        else{
            //case 1: no child

            if(root.left == null && root.right == null)
            {
                return null;
            }

            //case 2 : only 1 child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            //case 3 : have child using inorder successor
            Node Is =inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
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
        delete(root, 3);
        inorder(root);
    }
    
}
