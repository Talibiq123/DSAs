package hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] num = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        for (int i : num ) { //o(n)
            set.add(i);
        }

        System.out.println("ans = "+set.size());
    }
}
