//Job Sequencing Problem
import java.util.*;

public class Problem6 {
    static class Job {   //Object of Job
        int deadline;
        int profit;
        int id;  //0(A), 1(B), 2(C)

        public Job(int i, int d, int p){   //Constructor
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
         
        //Lambda Function
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit); //Descending order sort of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //Print Seq
        System.out.println("Max Jobs = " + seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();
    }
}
