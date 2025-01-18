import java.util.*;

public class arrayupdate {

    public static void arrayUpdate(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        arrayUpdate(marks);

        //Print Our Updated Marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
