package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int start = 0;
        while (start < nums.length){
            int i = start;
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]){
                i++;
            }
            if (start != i){
                list.add(nums[start] + "->" + nums[i]);
            } else {
                list.add(String.valueOf(nums[i]));
            }
            start++;
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list = summaryRanges(new int[]{0,1,2,4,5,7});
        System.out.println(list);
    }
}
