//Count Set Bits in a number-<Google , Amazon>
public class question3 {
    public static int countSetBits(int n){
        int count = 0;
        while(n >0){
            if((n & 1) != 0){  //Check Our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countSetBits(15));
    }
}
