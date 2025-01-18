import java.util.*;

public class SmallestLargestnumber {
    public static int getLargestSmallest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length;i++){
            if(Largest<numbers[i]){
                Largest=numbers[i];
            }
            if(Smallest>numbers[i]){
                Smallest=numbers[i];
            }
        }
        System.out.println("Smallest Value Is:"+Smallest);
        return Largest;
    }
    public static void main (String args[]){
        int numbers[]={1,2,6,4,5};

        System.out.println("Largest Value is:"+getLargestSmallest(numbers));
    }
    
}
