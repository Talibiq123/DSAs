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

        //ans.display();
        //System.out.println();

        //list.deleteDuplicates();

        //list.display();

        InterviewQuestions list = new InterviewQuestions();
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);



    }
}
