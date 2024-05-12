package a003SortedSquares;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int newLen = 0;
        int[] tempArray = new int[nums.length];
        int leftIndex = 0, rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            if (Math.abs(nums[leftIndex]) > Math.abs(nums[rightIndex])) {
                tempArray[newLen++] = (int) Math.pow(nums[leftIndex], 2);
                leftIndex++;
            } else {
                tempArray[newLen++] = (int) Math.pow(nums[rightIndex], 2);
                rightIndex--;
            }
        }

        int[] res = new int[newLen];
        for (int i = newLen - 1, j = 0; i >= 0; i--, j++) {
            res[j] = tempArray[i];
        }

        return res;
    }
}
