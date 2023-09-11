package arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int sum = 0;
        int max = -1;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }
        System.out.println("Maximum Wealth = "+max);
    }
}
