public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch); //adds at the end of the string
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
