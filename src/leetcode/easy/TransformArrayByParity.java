package leetcode.easy;

import java.util.Arrays;
/*
 * Transform Array by Parity
 * */
public class TransformArrayByParity {
    public static int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] % 2 == 0 ? 0 : 1;
        }
        Arrays.sort(nums);
        return nums;
    }
}
