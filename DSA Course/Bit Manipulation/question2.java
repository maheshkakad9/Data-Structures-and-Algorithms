//Check if a number is a power of 2 or not
public class question2 {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(isPowerOfTwo(15));
    }
}
