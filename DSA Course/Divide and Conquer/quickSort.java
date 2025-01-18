public class quickSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void QUICKSORT(int arr[], int si,int ei){
        //Base Case 
        if(si >= ei){
            return;
        }
        //Last Element= Pivot
        int pIdx = partition(arr,si,ei);
        QUICKSORT(arr, si, pIdx-1);  //left
        QUICKSORT(arr, pIdx+1, ei);  //Right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //To make place for elements smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //Swap
                int temp = arr[j];
                 arr[j]= arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];  
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        QUICKSORT(arr,0, arr.length-1);
        printArr(arr);
    }
}
