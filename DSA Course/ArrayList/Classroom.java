import java.util.ArrayList;

public class Classroom {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        
        //Add Element 
        //O(1)
        list.add(1);   
        list.add(2);   
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);  //To add 9 element at a index 1  //O(n)

        System.out.println(list);

        //Get element
        //O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // //Remove Element
        // //O(n)
        // list.remove(2);
        // System.out.println(list);

        // //Set element at Index 
        // //O(n)
        // list.set(2, 10);
        // System.out.println(list);

        //Contains Element
        //O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(12));

    }
}