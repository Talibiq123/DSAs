package hashing;

import java.util.TreeMap;

public class InBuiltTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println("TreeMap prints in Sorted Orders.");
        System.out.println(tm);
    }
}
