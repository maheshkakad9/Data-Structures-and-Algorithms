//Problem 2
//Union & Intersection of 2 arrays
import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //Union
        //Adding first array element to set
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        //Adding second array element to set
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union = "+ set.size());
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //Intersection
        set.clear();
        //Adding first array element to set
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        //Check first arr element which are stored in set with second arr element is the element is match then that element is intersection element 
        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
                System.out.println("Intersection Elements:"+arr2[i]);
            }
        }
        
        System.out.println("Intersection = "+ count);
    }
}
