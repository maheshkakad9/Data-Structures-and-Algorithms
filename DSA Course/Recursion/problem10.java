//Print x^n in O(logn) time complexity Optimised way 
public class problem10 {
    public static int optimizedPower(int a , int n){
        //Base Case
        if(n==0){
            return 1;
        }
        
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        //Odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a =2;
        int n=10;
        System.out.println(optimizedPower(a, n));
    }
}
