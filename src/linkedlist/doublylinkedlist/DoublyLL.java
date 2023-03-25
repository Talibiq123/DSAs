package linkedlist.doublylinkedlist;

public class DoublyLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        Node last = null; //for printing reverse
        while (temp != null) {
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        //printing in Reverse...
        System.out.println();
        while (last != null) {
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
