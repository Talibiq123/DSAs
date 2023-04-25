package recursion;

import java.util.Scanner;

public class NumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = digit(n);
        System.out.print("Numbers of digits are : " +ans);
    }
    public static int digit(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns = digit(n / 10);
        return smallAns + 1;
    }
}
