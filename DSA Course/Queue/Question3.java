//Stack Using 2 Queues 
import java.util.*;
public class Question3 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //add
        public static void push(int data){   //O(1)
            if(!q1.isEmpty()){   //To push data in Queue But we need to check which queue is empty So if q1 is empty then add data to q1 else add data to q2 
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        //remove
        public static int pop(){   //O(n)
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;

            //Case 1
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            } else { //case 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek
        public static int peek() {   //O(n)
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;

            //Case 1
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            } else { //case 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
