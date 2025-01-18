//Print Nth fibonacci Number
public class problem5 {
    public static int calcFibo(int n){
        if(n == 1 || n == 0){  //Base Case 
            return n;
        }

        int fibnm1 = calcFibo(n-1);
        int fibnm2 = calcFibo(n-2);
        int fibN = fibnm1 + fibnm2;
        return fibN;
    }
    public static void main(String[] args) {
        System.out.println(calcFibo(50));
    }
}