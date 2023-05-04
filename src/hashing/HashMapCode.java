package hashing;

import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n
        private int N;
        private LinkedList<Node>[] buckets; //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N; //return value between 0, 3 guarantee
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi]; //store linked list present at bucket index

            //take node of each index
            for (Node node : ll) {
                int di = 0;
                if (node.key == key) {
                    return di;
                }
                di++; //increase di for next index
            }
            return -1;
        }

        @SuppressWarnings("uncheck")
        private void rehash() {
            LinkedList<Node>[] oldBuck = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>(); //store empty lists in buckets
            }

            //nodes -> add in bucket
            for (LinkedList<Node> ll : oldBuck)
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
        }

        public void put(K key, V value) { //O(lambda) or o(1)
            int bi = hashFunction(key); //0 to (size - 1)
            int di = searchInLL(key, bi); // valid; -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); //0 to (size - 1)
            int di = searchInLL(key, bi); // valid; -1

            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key); //0 to (size - 1)
            int di = searchInLL(key, bi); // valid; -1

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
               return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); //0 to (size - 1)
            int di = searchInLL(key, bi); // valid; -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String key: keys) {
            System.out.println(key);


            System.out.println(hm.get("china"));
            System.out.println(hm.containsKey("India"));
            System.out.println(hm.isEmpty());
        }
    }
}
