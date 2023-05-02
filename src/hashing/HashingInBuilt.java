package hashing;

import java.util.*;

public class HashingInBuilt {
    public static void main(String[] args) {
        //Creating HashMap
        HashMap<String, Integer> hashmap = new HashMap<>();

        //insert details O(1)
        hashmap.put("India", 100);
        hashmap.put("China", 200);
        hashmap.put("US", 300);

        System.out.println(hashmap); //does not follow order: give answer in any order

        //get() method - O(1)
        int population = hashmap.get("India");
        //System.out.println(population);

        //System.out.println(hashmap.get("Indonesia"));

        //containskey()
        //System.out.println(hashmap.containsKey("India"));
        //System.out.println(hashmap.containsKey("Nepal"));

        //remove()
        //hashmap.remove("China");
        //System.out.println(hashmap);

        //size
        System.out.println(hashmap.size());

        //isEmpty
        System.out.println(hashmap.isEmpty());

        //clear()
        hashmap.clear();
        System.out.println(hashmap.isEmpty());
        System.out.println(hashmap);

    }
}
