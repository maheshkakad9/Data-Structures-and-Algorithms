//Min Absolute Difference Pairs
import java.util.*;
public class Problem3 {
    public static void main(String[] args) {  //O(nlogn)
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};


        Arrays.sort(A);  //O(nlogn)
        Arrays.sort(B);  //O(nlogn)

        int minDiff = 0;

        for(int i=0; i<A.length; i++){ //O(n)
            minDiff += Math.abs(A[i]-B[i]);  //O(1)
        }

        System.out.println("Min Absolute Diff of Pairs = " + minDiff);
    }
}
