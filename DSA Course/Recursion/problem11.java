public class problem11 {
    public static int tilingProblem(int n){ //2 * n (floor size)
        //Base Case 
        if(n == 0 || n == 1){
            return 1;
        }

        //Kaam
        //Vertical choice
        int fnm1 = tilingProblem(n-1);

        //Horizontal choice 
        int fnm2 = tilingProblem(n-2);

        //Total ways
        int totWays= fnm1 + fnm2;
        return totWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
