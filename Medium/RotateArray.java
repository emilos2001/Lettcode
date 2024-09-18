package LeetCode.Medium;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        k %= nums.length;
        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = rotated[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] rotated = rotate(nums, 3);
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
