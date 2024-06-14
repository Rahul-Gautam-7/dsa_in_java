public class searchbst {

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

    public static boolean search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data >key)
        {
            return search(root.left, key);
        }
        else if(root.data == key)
        {
            return true;
        }
        else
        {
            return search(root.right, key);
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
        
        if(search(root, 5))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
    
}
