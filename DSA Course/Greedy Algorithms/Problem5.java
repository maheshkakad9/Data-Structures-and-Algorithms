//Indian Coins
//We are given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000].
//Find min no. of coins/notes to make change for a value V.
import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used = " + countOfCoins);

        for(int i=0 ; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
