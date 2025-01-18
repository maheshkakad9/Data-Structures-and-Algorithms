//Max Subarray Sum- I (Brute force)
//Max Subaarray Sum- II (Prefix Sum)
//Max Subarray Sum- III (Kadane's Algorithm)

// public class SubarraySum{
//     public static void MaxSubArraySum(int numbers[]){
//         int maxsum= Integer.MIN_VALUE;
//         int minsum= Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
            
//             for (int j=1; j < numbers.length; j++) {
//                 int currsum=0;
//                 for(int k=i; k<=j; k++){
//                     currsum+=numbers[k];   
//                 }
//                 if(maxsum < currsum){
//                     maxsum = currsum;
//                 }
//                 if(minsum > currsum){
//                     minsum = currsum;
//                 }
//             }
//         }
//         System.out.print("Max Sum:" +maxsum);
//         System.out.print(" Min Sum:" +minsum);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         MaxSubArraySum(numbers);
// }
// }

// Max Subarray Sum- II (Prefix Sum)
public class SubarraySum{
    public static void MaxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //Calculate Prefix Array
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];

                if(maxsum < currSum){
                    maxsum = currSum;
                }
            }
        }
        System.err.println("Max Sum = " + maxsum);
       }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        MaxSubArraySum(numbers);
    }
}

// public class SubarraySum{
//     public static void Kadanes(int numbers[]){
//         int currSum = 0;
//         int MaxSum = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             currSum+=numbers[i];
//             if(currSum<0){
//                 currSum=0;
//             }
//             MaxSum = Math.max(currSum,MaxSum);
//         }
//         System.out.println(MaxSum);
//        }
//     public static void main(String args[]){
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//         Kadanes(numbers);
//     }
// }