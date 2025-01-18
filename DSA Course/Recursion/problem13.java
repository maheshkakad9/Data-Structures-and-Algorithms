//Friends Pairing Problem
public class problem13 {
    public static int friendsPairing(int n){
        //Base Case 
        if(n == 1 || n ==2){
            return n;
        }

        //Kaam
        //Choice
        //Single
        int fnm1 = friendsPairing(n-1);
        //Paired
        int fnm2 = (n-1) * friendsPairing(n-2);

        int totWays = fnm1+fnm2;

        return totWays;

        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(5));
    }
}
