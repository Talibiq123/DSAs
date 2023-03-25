package linkedlist.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLL dlist = new DoublyLL();
        dlist.insertFirst(5);
        dlist.insertFirst(4);
        dlist.insertFirst(3);
        dlist.insertFirst(2);
        dlist.insertFirst(1);

        dlist.display();
    }
}
