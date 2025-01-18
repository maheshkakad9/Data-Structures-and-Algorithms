//Implementation of priority Queue
import java.util.Comparator;
import java.util.PriorityQueue;


public class Classroom {
    static class Student implements Comparable<Student> { //overriding 
        String name;
        int rank;
 
        //Constructor
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //For the reverse order 
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());  
        // pq.add(3);  //O(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);
        pq.add(new Student("A", 4));  //O(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+ pq.peek().rank);  //O(1)
            pq.remove(); //O(logn)
        }
    }
}