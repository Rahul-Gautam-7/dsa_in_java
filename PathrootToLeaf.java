import java.util.*;
public class PathrootToLeaf {

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

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void root2leaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root.data);

        //leaf
        if(root.left == null && root.right ==null)
        {
            printPath(path);
        }
        else
        {
            root2leaf(root.left, path);
            root2leaf(root.right, path);
        }
        path.remove(path.size()-1);
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

        root2leaf(root, new ArrayList<>());
    }
    
}
