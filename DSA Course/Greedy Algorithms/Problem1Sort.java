//If the activities are not sorted 
import java.util.*;
public class Problem1Sort {
    public static void main(String[] args) {   //O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //Sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Lambda Function  -> shortForm
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time basic sorted 
        int maxAct = 0; //Count
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity 
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd) {
                //Activity Select 
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
