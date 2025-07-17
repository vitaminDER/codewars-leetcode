package leetcode.easy;
/*
 * The Two Sneaky Numbers of Digitville
 * */
public class TheTwoSneakyNumbersOfDigitville {
    public static int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result[size++] = nums[i];
                }
            }
        }
        return result;
    }
}
