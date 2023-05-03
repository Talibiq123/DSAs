package arrays;

//import java.util.*;

import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {

        //int[] input = new int[50];
        //int[] input = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of Array ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] +" ");
//        }
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
