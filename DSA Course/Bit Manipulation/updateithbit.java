public class updateithbit {
    public static int setithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;

    }
    public static int clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;

    }
    public static int updateIthbit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthbit(n, i);
        // }
        // else{ 
        //     return setithbit(n, i);
        n = clearIthbit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }
            
    
    public static void main(String args[]){
        System.out.println(updateIthbit(10, 2, 1));
    }
}
