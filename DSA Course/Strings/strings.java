import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        // System.out.println(str2);

        //length of the string
        // System.out.println(str.length());  //length() is the function in strings
        
        //Strings are immutable
        // Scanner sc = new Scanner(System.in);
        // String name;
        // String name2;
        // name = sc.next();   //It takes only one word as a input 
        // name2 = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name2);


        //concatenation
        String firstName = "Mahesh";
        String lastName = "Kakad";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(0));  //String charAt(index) method use to get a character at a specified index in the string
        printLetters(fullName);
    }
}