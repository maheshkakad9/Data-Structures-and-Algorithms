import java.util.*;
public class BST {
    //static class Node 
    static class Node {
        int data;
        Node left;
        Node right;
 
        Node(int data){  // Node for the data
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){  //Insert Node into BST and also returns the Node type value
        if(root == null){
            root = new Node(val);  // Intially the root is null so we created a new node and add first value as a root value
            return root;
        }

        if(root.data > val) {
            //Insert into left Subtree
            root.left = insert(root.left,val);  //insert left insert into left subtree and returns the pointer of left subtree and we store the pointer in the variable root.left
        } else {
            //Insert into right Subtree
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if(root.data < val){
            root.right = delete(root.right,val);
        }
        else if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else { //voila
            //case 1 - leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - Single Child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //case 3- both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null) {
            return;
        }
        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1) {
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println("Null");
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) 
        && isValidBST(root.right, root, max);
    }
    public static void main (String args[]){
        int values[] = {1,1,1};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        // inorder(root);
        // System.out.println();

        // if(search(root, 6)){
        //     System.out.println("found");
        // } else {
        //     System.out.println("not found");
        // }

        // root = delete(root,10);
        // System.out.println();

        inorder(root);
        System.out.println();

        // printInRange(root, 5, 12);

        printRoot2Leaf(root, new ArrayList<>());
        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        } else{
            System.out.println("Not Valid");
        }
    }
}