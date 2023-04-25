//sum of n Naturals numbers PMI...
package recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 9;
        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
