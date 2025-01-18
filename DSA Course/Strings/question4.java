//For a given string convert each the first letter of each word to uppercase <CODE NATION Company>  
//Example- "hi, i am mahesh" output- "Hi, I Am Mahesh"
public class question4 {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        //Uppercase the 0th index letter 
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        //for indexing 1 to str.length
        for(int i=1; i<str.length();i++){
            //Condition if their is empty space present & the string is at last index
            if(str.charAt(i) == ' ' && i<str.length()-1){
                //add the empty space to the string builder
                sb.append(str.charAt(i));
                //increases the index of i by 1
                i++;
                //Coverting the increased index which is first letter of word into uppercase and add it to the stringbuilder 
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                //for the letters after the first letter of the word
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "hi, i am mahesh";
        System.out.println(toUpperCase(str));
    }
}
