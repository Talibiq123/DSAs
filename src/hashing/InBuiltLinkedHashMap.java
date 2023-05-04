package hashing;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class InBuiltLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println("LinkedHashMap is Ordered"); //In this, We maintain ordered with the help of doubly linked list
        System.out.println(lhm);

        System.out.println();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println("HashMap is unordered");
        System.out.println(hm);
    }
}
