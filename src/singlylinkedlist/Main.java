package singlylinkedlist;

//internal linked list provided by JAVA
//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //for internal limked list
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(4);
//        list.add(8);
//        list.add(2);
//        list.add(0);
//        System.out.println(list);

        //for customized linked list
        LL list = new LL();

        list.insertFirst(43);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);

        list.insert(5, 3);

        list.insertEnd(0);
        list.insertEnd(2);
        list.insertEnd(4);


        list.display();

        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
    }
}
