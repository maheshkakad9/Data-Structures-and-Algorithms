public class binarysearch{
    public static int search(int number[],int key){
        int start=0, end=number.length-1;
        while(start <= end){
            int mid=(start + end)/2;
            //comparisons
            if(key == number[mid]){ //found
                System.out.println("Index of Key is:"+ mid);
            }
            if(number[mid] > key){ //left
                end = mid -1;
            }else{
                start= mid +1; //right
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=18;

        System.out.println("Key is at Index:" +search(number, key));
    }
}