public class primenum {
    // public static boolean isPrime(int n){

    //     // Corner Cases 
    //     // For 2
    //     if (n == 2){
    //         return true;
    //     }
    //     boolean isPrime = true;
    //     for (int i=2; i<=n-1; i++){
    //         //Checking the Completely divide conditon
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    //Optimised Solution for Prime Number
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //To print the numbers in a range
    public static void primesInRange(int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i)){   //If number is Prime (true case)
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static void main (String args[]){
        primesInRange(1000);
    }
}
