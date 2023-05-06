package hashing;

import java.util.*;

public class LinkedHashSetInBuilt {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(); //unordered
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangluru");
        System.out.println(cities);

        LinkedHashSet<String> lset = new LinkedHashSet<>(); //ordered
        lset.add("Delhi");
        lset.add("Mumbai");
        lset.add("Noida");
        lset.add("Bangluru");
        System.out.println(lset);

        TreeSet<String> ts = new TreeSet<>(); //unordered
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bangluru");
        System.out.println(ts);
    }
}
