public class subsets {
    public static void findSubsets(String str, String ans, int i){
        //Base Case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            } 
            return;
        }


        //recursion
        //Yes Choice 
        findSubsets(str, ans+str.charAt(i), i+1);
        //No Choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
