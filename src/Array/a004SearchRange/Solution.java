package Array.a004SearchRange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] res = new int[2];
        res[0] = binarySearchLeft(nums, target);
        res[1] = binarySearchRight(nums, target);
        return res;
    }

    public int binarySearchLeft(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return (nums[l] == target) ? l : -1;
    }

    public int binarySearchRight(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return (nums[l] == target) ? l : -1;
    }
}
