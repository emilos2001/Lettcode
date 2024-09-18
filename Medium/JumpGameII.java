package LeetCode.Medium;

public class JumpGameII {
    public static int jump(int[] nums) {
        int jump = 0;
        int far = 0;
        int start = 0;
        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = start; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            start = far + 1;
            far = farthest;
            jump++;
        }
        return jump;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int jump = jump(nums);
        System.out.println(jump);
    }
}
