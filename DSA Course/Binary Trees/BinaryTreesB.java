import java.util.*;

public class BinaryTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){  //Constructor 
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree (int nodes[]) {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        //Preorder Traversals
        public static void preorder(Node root) {  //O(n)
            if(root == null){
                return;
            }
            System.out.print(root.data+" "); //To print root
            preorder(root.left);  //To print Left Sub tree 
            preorder(root.right);  //To print Right Sub tree
        }

        //Inorder Traversals 
        public static void inorder(Node root) {   //O(n)
            if(root == null){
                return;
            }
            inorder(root.left);//To print left Subtree 
            System.out.print(root.data+" ");  //To print root
            inorder(root.right);  //To print right Subtree
        }

        //Postorder Traversals
        public static void postorder(Node root) {   //O(n)
            if(root == null){
                return;
            }
            postorder(root.left);  //To print left subtree
            postorder(root.right);  //To print Right Subtree
            System.out.print(root.data+" ");  //To print root
        }

        //LevelOrder Traversals 
        public static void levelorder(Node root){
            if(root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    } 
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {   //O(n)
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();    //creating a binary tree 
        Node root = tree.buildTree(nodes);     //Calling buildTree for tree     
        // System.out.println(root.data);   //Printing root in the binary tree 

        // tree.preorder(root);  //For preorder traversal 
        // tree.inorder(root);   //For inorder traversal
        // tree.postorder(root);  //For postorder traversal
        tree.levelorder(root);  //For levelorder traversal
    }
}