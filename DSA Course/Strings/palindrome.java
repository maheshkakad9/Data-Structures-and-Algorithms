//Check if a string is a palindrome or not i.e. "madam", "racecar" , "noon" 
public class palindrome {
    public static boolean isPalindrome(String word){
        int n = word.length();
        for(int i=0; i<word.length()/2; i++){
            if(word.charAt(i) != word.charAt(n-i-1)){
                //Not a Palindrome
                return false;
            }
        } 
        return true;
    }
    public static void main(String args[]){
        String str = "nayan";
        System.out.println(isPalindrome(str));
    }
}
