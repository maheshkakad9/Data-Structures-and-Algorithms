//Lowest Common Ancestors 

import java.util.ArrayList;

public class LCA {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root); 

        if(root.data == n){
            return true;
        }

        boolean foundLeft =getPath(root.left, n, path);
        boolean foundRight =getPath(root.right, n, path);

        if(foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size()-1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2) { //O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //Last Common Ancestor
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //Last Equal Node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2) {
        //Base case
        if(root == null || root.data == n1 || root.data ==n2) {
            return root;
        } 

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        //LeftLca=value  rightLca = null
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){   //When the root is null no distance exist hence return -1
            return -1;
        }

        if(root.data == n){  // If root is equal to n then distance is zero
            return 0;
        }

        int leftDist = lcaDist(root.left, n);  //Check in the left subtree
        int rightDist = lcaDist(root.right,n);  //Check in the right subtree 

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if(leftDist == -1){
            return rightDist +1;
        } else {
            return leftDist +1;
        }
    }

    //Minimum Distance between two nodes 
    public static int minDist(Node root, int n1, int n2){  //Minimum distance is the distance of edges 
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public static int KAncestor(Node root, int n, int k){
        if(root == null){  //Base Case 
            return -1;
        }
        if(root.data == n){  //Check if the root is equal to node
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);  //count left Dist
        int rightDist = KAncestor(root.right, n, k);  //Count rigth Dist

        if(leftDist == -1 && rightDist == -1){  //IF from both side n is not found 
            return -1;
        }

        int max = Math.max(leftDist,rightDist);  //To find the maximum distance between root and node
        if(max+1 == k) {
            System.out.println(root.data);
        }

        return max+1;
    }
    public static void main(String[] args) {
        /*
                        1
                      /    \
                     2      3
                   /   \   /  \ 
                  4    5  6    7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        // int n1 = 4, n2 = 7;
        int n = 5, k = 1;
        // System.out.println(lca2(root, n1, n2).data);
        // System.out.println(minDist(root, n1, n2));
        System.out.println(KAncestor(root, n, k));
    }
}
