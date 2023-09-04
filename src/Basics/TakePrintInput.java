package Basics;
import java.util.*;

public class TakePrintInput {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        System.out.println("Output is " + n + ".");
    }
}
