// Simple BST with insert and inorder traversal
import java.util.*;
public class BinarySearchTree {
    static class Node {
        int val; Node left, right;
        Node(int v){val=v;}
    }
    Node root;
    public void insert(int v){
        root = insertRec(root, v);
    }
    private Node insertRec(Node node, int v){
        if (node==null) return new Node(v);
        if (v < node.val) node.left = insertRec(node.left, v);
        else node.right = insertRec(node.right, v);
        return node;
    }
    public void inorder(){
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node node){
        if (node==null) return;
        inorderRec(node.left);
        System.out.print(node.val + " ");
        inorderRec(node.right);
    }
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        int[] vals = {5,3,7,2,4,6,8};
        for (int v: vals) bst.insert(v);
        bst.inorder(); // 2 3 4 5 6 7 8
    }
}
