package heaps;

import java.util.PriorityQueue;

public class SlidingWindowMaximum  {

    static class Pair implements Comparable<Pair> {
        int num;
        int index;

        public Pair(int num, int index) {
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            //for ascending return this.num - p2.num
            //for descending return below
            return p2.num - this.num;
        }

    }

    public static void main(String[] args) { //O(nlogk)
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; //widow size
        int[] res = new int[arr.length - k + 1]; //n - k + 1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //1st window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().num;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().index <= (i - k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().num;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] +" ");
        }
    }
}
