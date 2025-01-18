//Print x^n time complexity O(n)
public class problem9 {
    public static int power(int x, int n){
        //Base Case 
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
