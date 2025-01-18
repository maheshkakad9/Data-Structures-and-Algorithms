import java.util.*;

public class sumsubarray {
    public static void printsubarray(int numbers[]){
        int totalsubarray=0;
        
        
        for(int i=0;i<numbers.length;i++){    //takes start value which goes from index 0 to n
            int start=i;
            int maxsum=Integer.MIN_VALUE;
            int minsum=Integer.MAX_VALUE;
            for(int j=i;j<numbers.length;j++){   // takes end value of array goes from index j=i to n
                int end=j;
                int sum=0;
                for(int k=start; k<=end;k++){   // print all the values in between start to end 
                    sum+=numbers[k];
                    if(maxsum<sum){
                        maxsum=sum;
                    }
                    if(minsum>sum){
                        minsum=sum;
                    }    
                }
                System.out.print("Max Sum:"+maxsum);
                System.out.print("Min Sum:"+minsum);
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("TOTAL SUBARRAY="+totalsubarray);
    }
    public static void main (String args[]){
        int numbers[]={2,4,6,8,10};
        printsubarray(numbers);
    }
}

