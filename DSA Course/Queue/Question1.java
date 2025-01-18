//Queue Using Linked List

public class Question1 {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public static void add(int data){   //O(1)
            Node newNode = new Node(data);
            if(head == null){    //If Queue is empty
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){   //O(1)
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;
            //Single Element 
            if(tail == head){
                tail = head = null;
            } else{
                head = head.next;
            }
            return front;
        }

        //peek
        public static int peek(){   //O(1)
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);//1 2 3 

        while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove(); 
        }

    }
}

