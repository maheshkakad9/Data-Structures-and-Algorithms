//Clear last i bits
public class clearlastibits {
    public static int clearlastibits(int n, int i){
        int BitMask = (-1)<<i; //or (~0) << i
        return n & BitMask;
    }
    public static void main(String args[]){
        System.out.println(clearlastibits(15, 2));
    }
}
