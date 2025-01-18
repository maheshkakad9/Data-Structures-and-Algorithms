//Fractional KnapSack
import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;  //this is the weigth of the sack 

        double ratio[][] = new double[val.length][2];
        // 0th col => idx; 1st col => ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;  //Storing index in the first column 
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //Ascending Order Sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;

        //We want descending order sorting
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){   //Includes full items
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                //Include fractional Items
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value "+ finalVal);
    }
}
