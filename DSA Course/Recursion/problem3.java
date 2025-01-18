//Print Factorial of a number n
public class problem3 {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int factN= n * fnm1;
        return factN;
    }
    public static void main(String args[]){
        System.out.println(fact(5));
    }
}
