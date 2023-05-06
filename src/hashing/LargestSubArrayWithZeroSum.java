package hashing;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        //(sum. index)
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (hashMap.containsKey(sum)) {
                len = Math.max(len, j - hashMap.get(sum));
            } else {
                hashMap.put(sum, j);
            }
        }
        System.out.println("Largest Subarray with sum as 0 => "+len);
    }
}
