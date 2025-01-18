//Activity Selection Problem
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {   //O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //end time basic sorted 
        int maxAct = 0; //Count
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity 
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd) {
                //Activity Select 
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}