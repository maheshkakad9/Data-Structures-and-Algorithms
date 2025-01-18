//Duplicate Parentheses
import java.util.*;
public class Question7 {

    public static boolean isDuplicate(String str){   //O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;  //duplicate
                } else {
                    s.pop();  //openig pair
                }
            } else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; //True
        String str2 = "(a-b)"; //False
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
