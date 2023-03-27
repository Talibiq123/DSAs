package linkedlist.questions;

public class Main {
    public static void main(String[] args) {
        RecLL list = new RecLL();
        list.insertRec(24,0);
        list.insertRec(19,0);
        list.insertRec(13,0);
        list.insertRec(13,0);
        list.insertRec(13, 0);
        list.insertRec(9, 0);
        list.insertRec(9, 0);

        list.display();
        System.out.println();

        list.deleteDuplicates();

        list.display();

    }
}
