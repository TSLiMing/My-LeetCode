package a010MoveZeroes;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{0};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int slowIndex, fastIndex;
        for (slowIndex = fastIndex = 0; fastIndex < nums.length; slowIndex++, fastIndex++) {
            while (fastIndex < nums.length && nums[fastIndex] == 0) {
                fastIndex++;
            }
            if (fastIndex < nums.length) {
                int temp = nums[fastIndex];
                nums[fastIndex] = 0;
                nums[slowIndex] = temp;
            }
        }
    }
}
