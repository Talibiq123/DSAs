package Basics;

public class swapping {
    public static void main(String[] args) {
        int m = 9;
        int n = 5;
        System.out.println("Numbers before swapping : ");
        System.out.println(m +" "+ n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Numbers after swapping : ");
        System.out.println(m +" "+ n);
    }
}
