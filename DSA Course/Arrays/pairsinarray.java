import java.util.*;
public class pairsinarray {
    public static void pairs(int array[]){
        int totalpairs=0;
        for(int i=0;i<array.length;i++){
            int current=array[i];
            for(int j=i+1; j<array.length;j++){
                System.out.print("("+current +","+array[j]+")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:"+totalpairs);
        
    }
    public static void main (String args[]){
        int array[]={2,4,6,8,10};
        pairs(array);
    }
}
