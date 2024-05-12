package c004TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> record = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(target - nums[i])) {
                return new int[]{record.get(target - nums[i]), i};
            }
            record.put(nums[i], i);
        }
        return null;
    }
}
