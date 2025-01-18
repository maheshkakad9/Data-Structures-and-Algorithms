public class substring {
    public static String getsubString(String str, int si, int ei){ //Function to make substring
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main (String args[]){
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));  //Built in substring function available in java string 
        System.out.println(getsubString(str, 0, 5));
    }
}
