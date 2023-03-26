package linkedlist.circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        CLL clist = new CLL();
        clist.insert(23);
        clist.insert(3);
        clist.insert(19);
        clist.insert(75);
        clist.display();
        clist.delete(3);
        clist.display();
    }
}
