//LinkedHashMap
//TreeMap
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        //LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        //TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
    }
}
