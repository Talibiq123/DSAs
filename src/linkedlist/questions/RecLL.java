package linkedlist.questions;

// Custom Linked List
public class RecLL {
    private Node head;
    private Node tail;
    private int size;

    public RecLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertEnd(value);
            return;
        }
        Node temp = head; // 0 th index
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size += 1;
    }

    public void insertEnd(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size += 1;
    }



    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--; //IMPORTANT, don't forget this
        return value;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //insertion by recursion, suppose size and tail is not given
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    public Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }

    public void deleteDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // 21. Merge two sorted list
    public static RecLL merge(RecLL first, RecLL second) {
        Node f = first.head;
        Node s = second.head;

        RecLL ans = new RecLL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertEnd(f.value);
                f = f.next;
            } else {
                ans.insertEnd(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertEnd(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertEnd(s.value);
            s = s.next;
        }
        return ans;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp  = temp.next;
        }
        System.out.print("NULL");
    }

    private class Node {
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
