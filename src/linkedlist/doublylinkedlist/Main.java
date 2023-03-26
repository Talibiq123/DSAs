package linkedlist.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLL dlist = new DoublyLL();
        dlist.insertFirst(5);
        dlist.insertFirst(4);
        dlist.insertFirst(3);
        dlist.insertFirst(2);
        dlist.insertFirst(1);
        dlist.insertLast(6);
        dlist.insertLast(9);
        dlist.insert(6,7);
        dlist.insert(7, 8);

        dlist.display();
    }
}
