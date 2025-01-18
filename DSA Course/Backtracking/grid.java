//Grid Ways
//Find number of ways to reach from (0,0) to (N-1,M-1) in a N*M grid. Allowed movers-right or down
public class grid {
    public static int gridWays(int i , int j,int n,int m){
        //Base Case
        if(i == n-1 && j == m-1){  //Condition for last cell
            return 1;
        }else if(i == n || j == m){ //Boundry cross condition
            return 0;
        }
        //Recursion
        int w1 = gridWays(i+1, j, n, m); //Down
        int w2 = gridWays(i, j+1, n, m);  //Right

        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m =3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
