package LeetCode.Medium;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int goal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > goal) {
                return false;
            }
            if (i + nums[i] > goal) {
                goal = i + nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        boolean canJump = canJump(nums);
        System.out.println(canJump);
    }
}
