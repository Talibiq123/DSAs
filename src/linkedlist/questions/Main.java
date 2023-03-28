package linkedlist.questions;

public class Main {

    

    public static void main(String[] args) {
        RecLL list1 = new RecLL();
        RecLL list2 = new RecLL();
        //RecLL ans = new RecLL();
        list1.insertRec(5,0);
        list1.insertRec(3,0);
        list1.insertRec(1,0);

        list2.insertRec(14,0);
        list2.insertRec(9, 0);
        list2.insertRec(2, 0);
        list2.insertRec(1, 0);
        
        RecLL ans = RecLL.merge(list1, list2);

        ans.display();
        System.out.println();

        //list.deleteDuplicates();

        //list.display();

    }
}
