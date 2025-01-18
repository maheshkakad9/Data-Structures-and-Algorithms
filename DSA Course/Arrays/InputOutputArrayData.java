import java.util.*;

public class InputOutputArrayData {
    public static void main (String args[]){
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Length Of Array = " + marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println ("Phy:" + marks[0]);
        System.out.println ("Chem:" + marks[1]);
        System.out.println ("Math:" + marks[2]);


        marks[2] = 100;
        System.out.println ("Math:" + marks[2]);


    }
}