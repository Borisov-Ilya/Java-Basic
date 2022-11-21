package Array;

public class Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int temp = nums[0];

        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        int sum = nums[0] + nums[nums.length / 2];
        System.out.println(sum);
    }
}
