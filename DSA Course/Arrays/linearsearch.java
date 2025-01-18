//linear Search of integer array
// public class linearsearch {
//     public static int search(int number[],int key){
//         for(int i=0; i<number.length; i++){
//             if(key==number[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]){
//         int number[]= {2,4,6,8,10,12,14,16};
//         int key=10;
//         int index = search(number,key);
//         if(index == -1){
//             System.out.println("Not Found");
//         }
//         else{
//             System.out.println("Key is at Index:" +index);
//         }

//     }
    
// }

//Linear Search of String Array
public class linearsearch{
    public static int searchString(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(key.equals(menu[i])){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"dosa","chole bhature","aloo paratha","vada pav"};
        String key = "dosa";

        int index = searchString(menu, key);
        if (index == -1){
            System.out.print("Not Found");
        }else {
            System.out.print("Key is at index: " + index);
        }
    }
}
