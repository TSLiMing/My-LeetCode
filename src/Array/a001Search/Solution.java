package Array.a001Search;
public class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l >> 1);  //注意使用r - l >> 1防止溢出
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }
}

