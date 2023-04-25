package recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter its power");
        int p = sc.nextInt();
        int pow = power(n, p);
        System.out.println(pow);
    }
    public static int power(int n, int p) {
        if (p <= 1) {
            return n;
        }
        return n * power(n, p-1);
    }
}
