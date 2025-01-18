//Print sum of first n natural numbers
public class problem4 {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int sumnm1 = sum(n-1);
        int sumN = n + sumnm1;
        return sumN;
    }
    public static void main(String args[]){
        System.out.println(sum(5));
    }
}
