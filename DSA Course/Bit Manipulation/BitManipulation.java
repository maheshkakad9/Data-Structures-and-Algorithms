//Check if a number is odd or even
//Question 1
import java.util.*;

public class BitManipulation{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){ //Condition of Even
            System.out.println("number is even");
        }else{ //Condition of odd
            System.out.println("Number is Odd");
        }
    }
    public static void main(String args[]){
        oddOrEven(4);
        oddOrEven(7);
        oddOrEven(89);
    }
}