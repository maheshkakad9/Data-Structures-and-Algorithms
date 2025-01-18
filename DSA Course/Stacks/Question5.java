//Next Greater Element 
//The next greater element of some elements x in an array is the first greater element that is the right of X in the same array
import java.util.*;

public class Question5 {

    public static void main(String[] args) {   //O(n)
        int arr[] = {4,9,2,5,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //1 While
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i] = arr[s.peek()];
            }
            //3 push elements in s 
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+" ");
        }
    }
}


//next greater right
//next greter left
//next smaller right
//next smaller left
