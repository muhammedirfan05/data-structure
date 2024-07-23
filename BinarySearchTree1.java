import java.util.*;
public class BinarySearchTree1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        BinarySearchTree bt1=new BinarySearchTree(50);
        bt1.insert(30);
        bt1.insert(10);
        bt1.insert(60);
        bt1.insert(55);
        System.out.print("Inorder=>");
        bt1.inOrder(bt1.root);
        System.out.print("\nPreorder=>");
        bt1.preOrder(bt1.root);
        System.out.print("\nPostorder=>");
        bt1.postOrder(bt1.root);
        System.out.print("\nSearching=>");
        bt1.searchNode(bt1.root,60);
        System.out.print("\nMinimum Value=>");
        bt1.minValue(bt1.root);
        System.out.print("\nMaximum Value=>");
        bt1.maxValue(bt1.root);
        
    }
}
class BinarySearchTree
{
    class Node1
    {
        int data;
        Node1 left;
        Node1 right;
        Node1(int data)
        {
            this.data=data;
        }

    }
    Node1 root;
    public BinarySearchTree(int data)
    {
        root=new Node1(data);
    }
    public void insert(int data)
    {
        insertNode(root,data);
    }
    public Node1 insertNode(Node1 root,int data)
    {
        if(root==null)
            return new Node1(data);
        if(root.data>data)
            root.left=insertNode(root.left, data);
        else   
            root.right=insertNode(root.right, data);
        return root;
    }
    public void inOrder(Node1 root)
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
    public void preOrder(Node1 root)
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
    public void postOrder(Node1 root)
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
    public void searchNode(Node1 root,int data)
    {
        if(root==null)
        {
            System.out.print("No Element Found");
            return;
        }
        if(root.data==data)
        {
            System.out.print("Element Found");
            return;
        }
        else if(root.data>data)
            searchNode(root.left,data);
        else
            searchNode(root.right,data);
    }
    public int minValue(Node1 root)
    {
        if(root==null)
        {
            System.out.println("There is no tree");
            return 0;
        }
        else if(root.left==null)
        {
            // System.out.print(root.data);
            return root.data;
        }
        else
            minValue(root.left);
        return 0;
    }
    public void maxValue(Node1 root)
    {
        if(root==null)
        {
            System.out.println("There is no tree");
            return;
        }
        else if(root.right==null)
        {
            System.out.print(root.data);
            return;
        }
        else
            maxValue(root.right);
    }
}
/*WITH DELETION 
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bt1 = new BinarySearchTree(50);
        bt1.insert(30);
        bt1.insert(10);
        bt1.insert(60);
        bt1.insert(55);

        System.out.print("Inorder=>");
        bt1.inOrder(bt1.root);
        System.out.print("\nPreorder=>");
        bt1.preOrder(bt1.root);
        System.out.print("\nPostorder=>");
        bt1.postOrder(bt1.root);
        System.out.print("\nSearching=>");
        bt1.searchNode(bt1.root, 60);
        System.out.print("\nMinimum Value=>");
        System.out.print(bt1.minValue(bt1.root));
        System.out.print("\nMaximum Value=>");
        bt1.maxValue(bt1.root);
        System.out.print("\ndelete Node=>");
        bt1.root = bt1.deleteNode(bt1.root, 50);

        // Printing the tree again after deletion
        System.out.print("\nInorder after deletion=>");
        bt1.inOrder(bt1.root);
        sc.close();
    }
}

class BinarySearchTree {
    class Node1 {
        int data;
        Node1 left;
        Node1 right;
        Node1(int data) {
            this.data = data;
        }
    }

    Node1 root;

    public BinarySearchTree(int data) {
        root = new Node1(data);
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    public Node1 insertNode(Node1 root, int data) {
        if (root == null) {
            return new Node1(data);
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void inOrder(Node1 root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(Node1 root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node1 root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void searchNode(Node1 root, int data) {
        if (root == null) {
            System.out.print("No Element Found");
            return;
        }
        if (root.data == data) {
            System.out.print("Element Found");
            return;
        } else if (data < root.data) {
            searchNode(root.left, data);
        } else {
            searchNode(root.right, data);
        }
    }

    public int minValue(Node1 root) {
        if (root == null) {
            System.out.print("There is no tree");
            return Integer.MIN_VALUE;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public void maxValue(Node1 root) {
        if (root == null) {
            System.out.print("There is no tree");
            return;
        }
        while (root.right != null) {
            root = root.right;
        }
        System.out.print(root.data);
    }

    public Node1 deleteNode(Node1 root, int data) {
        if (root == null) {
            System.out.println("No tree exists");
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
}

*/