//Java Collection FrameWork
//Time Complexity O(1)
import java.util.*;

public class QueueJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        //We can not create object of Queue because Queue is a interface . So make Queue using LinkedList Class or ArrayDeque Class
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);//1 2 3 

        while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove(); 
        }

    }
}
