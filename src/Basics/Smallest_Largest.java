package Basics;

import java.util.Scanner;

public class Smallest_Largest {
    public static int largest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
    public  static int smallest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = largest(num1, num2, num3);
        int smallest = smallest(num1, num2, num3);
        System.out.println("Largest "+largest);
        System.out.println("Smallest "+smallest);
    }
}
