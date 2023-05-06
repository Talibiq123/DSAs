package hashing;

import java.util.*;
public class IteratorInterfaceOfHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); //unordered
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Noida");
        set.add("Bangluru");

//        //iteration of set using Iterator interface
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //iteration of set using advanced for loop
        for (String sets : set) {
            System.out.println(sets);
        }
    }
}
