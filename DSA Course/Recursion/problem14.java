//Binary Strings Problem
//Print all binary Strings of size N without consecutive ones 
public class problem14 {
    public static void printBinString(int n, int lastPlace, String str){
        //Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //Kaam
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
}
