package linkedlist.questions;

public class RecursionLL {

    Node head;
    Node tail;
    int size;

    //insertion by recursion, suppose size and tail is not given
    public void insertRec(int val) {

    }


    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
