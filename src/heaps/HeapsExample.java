package heaps;

import java.util.*;

public class HeapsExample {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last index
            arr.add(data);

            int x = arr.size() - 1; //x is a child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndex = i;

            if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
                minIndex = right;
            }

            if (minIndex != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //step 1: swap first index with last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //step 2: delete last
            arr.remove(arr.size() - 1);

            //step 3: heapify
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }


    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        while (!heap.isEmpty()) { //heap sort - O(nlogn)
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}
