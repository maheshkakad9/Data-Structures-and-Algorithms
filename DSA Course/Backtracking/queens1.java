//N-Queens- Print 1 Solution
//Check if problem can be solved and print only 1 solution to N Queens problem.

public class queens1 {
    public static boolean isSafe(char board[][], int row, int col){
        //Vetical Up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            } 
        }
        //Diag left up
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        } 
        //Diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }

        //Column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){ //Function call
                    return true;
                }
                
                board[row][j] = 'X';  //Backtracking step
            }
            
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("----------- Chess Board ------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
        //Initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total ways to solve n queens = "+count);
    }
}
