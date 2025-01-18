//Search in rotated Sorted array
//input:Sorted, Rotated array with distinct numbers(In ascending order).It is rotated at a pivot point Find the index of the given element .

public class problem1 {
    public static int search(int arr[], int tar, int si, int ei){
        //Base Case
        if(si > ei){
            return -1;
        }
        //Kaam
        int mid = si + (ei-si)/2;  //(si+ei)/2

        //case FOUND(if mid = target)
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //Case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr,tar,si,mid-1);
            } else{
                //Case b : right
                return search(arr,tar,mid+1,ei);
            }
        }

        //mid on L2
        else{
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1,ei);
            } else{
                //case d: left
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target= 6; //Output -> 4
        int tarIdx = search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
