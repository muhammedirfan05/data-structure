import java.util.*;
public class BinaryTrees1 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        BinaryTree bt=new BinaryTree(1);
        bt.insertLeft(bt.root,2);
        bt.insertRight(bt.root,3);
        bt.insertLeft(bt.root.left, 4);
        bt.insertLeft(bt.root.right, 5);
        System.out.print("InOrder=>");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.print("preOrder=>");
        bt.preOrder(bt.root);
        System.out.println();
        System.out.print("postOrder=>");
        bt.postOrder(bt.root);
        System.out.println();
        sc.close();
    }
}
class BinaryTree
{
    class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
    }
    Node root;
    public BinaryTree(int data)
    {
        root=new Node(data);
    }
    public void insertLeft(Node root,int data)
    {
        root.left=new Node(data);
    }
    public void insertRight(Node root,int data)
    {
        root.right=new Node(data);
    }
    public void inOrder(Node root)
    {
        if(root==null)
            return;
        else
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public void preOrder(Node root)
    {
        if(root==null)
            return;
        else
        {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Node root)
    {
        if(root==null)
            return;
        else
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

}