//Push at the Bottom of the Stack (Amazon)

import java.util.Stack;

public class Question1 {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); //Removing all the elements from the stack using top
        pushAtBottom(s, data);  //Afet stack is empty push the data at the bottom
        s.push(top);  //push stored value of top
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
