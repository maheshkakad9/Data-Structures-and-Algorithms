public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step2 = newNode next = head
        newNode.next = head; //Link

        //step-3 head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head= tail = newNode;
            return;
        }
        tail.next = newNode;

        tail = newNode;
    }

    public void print(){   
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){ //Add in the middle 
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){  //Remove First element from the Linked List
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }

        int val = head.data;
        head = head.next;
        size--; 
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("Linked list is Empty");
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //Previous Node : i = size-2
        Node prev = head;
        for(int i=0;i<size-2; i++){
            prev = prev.next;
        }
          
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    public int itrSearch(int key){  //O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){   //Key Found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //Key Not Found
        return -1;
    }
      
    public int helper(Node head, int key){  //Recursive Search Helper Method
        if(head == null){            //Time Complexity - O(n)
            return -1;                   //Space Complexity- O(n)
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){  //Recursive Search
        return helper(head,key);
    }

    public void reverse(){  //TC- O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Find And Remove Nth node from End (Iterative Approach)
    //TC- O(n)
    public void deleteNthfromEnd(int n){
        //Calculate Size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //If head to be deleted
        if(n == sz){   //last Se N = head from first
            head = head.next;  //Remove First
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Check if a Linked List is a Palindrome-
    //Slow-Fast Approach
    public Node findMid(Node head){  //Helper Function
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){  //Even and Odd Condition
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }

        return slow;  //Slow is my midNode 
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //Step 1- Find mid
        Node midNode = findMid(head);

        //Step 2- Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //Right half head
        Node left = head;

        //Step 3- check 1st Half & 2nd Half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }


    //Linked List part 2
    //problem-Detect a loop cycle in LL
    public static boolean isCycle(){  //Floy's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
            if(slow == fast){
                return true;  //Cycle exists
            }
        }

        return false; // Cycle Does not exists
    }

    //Remove a loop/Cycle in a LL
    public static void removeCycle(){
        //Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //Find Meeting Point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove Cycle -> last.next = null
        prev.next = null;
    }

    //Merge Sort Code In Linked List

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  //Mid Node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }


    public Node mergeSort(Node head){
        //Base case
        if(head == null || head.next == null){
            return head;
        }
        //find Mid
        Node mid = getMid(head);

        //Left & right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //Merge
        return merge(newLeft, newRight);
    }

    //zigZag Linked List\


    public void zigZag(){
        
    }
    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // // ll.addLast(1);

        // ll.print();  //1->2->1
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // //1->2->3->1      (loop exists)
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());


        LinkedList ll =new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(5);
        //5->4->3->2->1
        
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        }
}