//Print Numbers from 1 to n (Increasing Order)
public class problem2 {
    public static void printInc(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        printInc(5);
    }
}
