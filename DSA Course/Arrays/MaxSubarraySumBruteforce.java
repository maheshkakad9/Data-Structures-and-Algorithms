import java.util.*;
public class MaxSubarraySumBruteforce {
    public static void MaxSubArraySum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0; i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=numbers[k];
                    System.out.println("Current Sum Is:"+currsum);
                }  
            }
        }
        if(maxsum<currsum){
            maxsum=currsum;
            System.out.print(+maxsum);
        }
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        MaxSubArraySum(numbers);
    }
}
