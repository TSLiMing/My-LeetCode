package Array.a010MinSubArrayLen;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int startIndex = 0, endIndex = 0;
        int res = 0x3f3f3f3f, sum = 0;

        for (endIndex = 0; endIndex < nums.length; endIndex++) {
            sum += nums[endIndex];

            while (startIndex <= endIndex && sum >= target) {  //此处startIndex <= endIndex 实际上不用写
                res = Math.min(endIndex - startIndex + 1, res);
                sum -= nums[startIndex];
                startIndex++;
            }
        }
        if (res == 0x3f3f3f3f) {
            return 0;
        }
        return res;
    }
}
