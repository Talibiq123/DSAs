package arrays;

public class ShufflingArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int len = nums.length/2;
        int[] result = new int[nums.length];
        for (int i = 0; i < len; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[i+len];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
