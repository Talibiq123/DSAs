package recursion;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int n = sc.nextInt();
        printNum(n);
    }
    public static void printNum(int n) {
        if (n == 1) {
            System.out.print(n +" ");
            return;
        }
        printNum(n - 1);
        System.out.print(n +" ");
    }
}
