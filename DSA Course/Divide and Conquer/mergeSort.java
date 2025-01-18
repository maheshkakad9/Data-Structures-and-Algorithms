public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MERGESORT(int arr[], int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        //Kaam
        int mid = si + (ei - si)/2;  // (si + ei)/2
        MERGESORT(arr, si, mid); //Left part
        MERGESORT(arr, mid+1, ei); //Right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //left(0,3)=4 Right(4,6)=3 -> 6-0+1=7
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
         
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){  //Left part element is smaller than right part element then store it in temporary array 
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j]; //Right part element is small then store it in temporary array
                j++;
            }
            k++;
        }
        //If elements remain
        //Left Part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //Right Part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        MERGESORT(arr, 0, arr.length-1);
        printArr(arr);
    }
}