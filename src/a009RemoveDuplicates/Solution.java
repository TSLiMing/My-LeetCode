package a009RemoveDuplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int slowIndex, fastIndex;
        for (slowIndex = fastIndex = 0; fastIndex < nums.length; slowIndex++) {
            while (fastIndex < nums.length && nums[slowIndex] == nums[fastIndex]) {
                fastIndex++;
            }

            if (fastIndex < nums.length) {
                nums[slowIndex + 1] = nums[fastIndex];
            }
        }
        return slowIndex;
    }
}
