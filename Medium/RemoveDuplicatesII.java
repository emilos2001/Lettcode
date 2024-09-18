package LeetCode.Medium;

public class RemoveDuplicatesII {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[i] = nums[j];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}
