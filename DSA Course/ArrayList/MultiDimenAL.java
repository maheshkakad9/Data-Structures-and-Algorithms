import java.util.ArrayList;



public class MultiDimenAL {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); //Creating a Main list
        ArrayList<Integer> list = new ArrayList<>();  //Creating a list
        list.add(1);  //Adding element to the list
        list.add(2); 
        mainList.add(list);  //Adding list to the mainList

        ArrayList<Integer> list2 = new ArrayList<>();  //Creating a list2
        list2.add(3);  //Adding element to the list
        list2.add(4);
        mainList.add(list2);  //Adding list 2 to the main list

        for(int i=0; i<mainList.size(); i++){  //For the elements in the main list
            ArrayList<Integer> currList = mainList.get(i);  //to store main list elements on to the current list
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}
