package a005GenerateMatrix;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int leftIndex = 0, rightIndex = n - 1, upIndex = 0, downIndex = n - 1;
        int limit = n * n;
        int cnt = 1;
        while (cnt <= limit) {
            for (int i = leftIndex; i <= rightIndex; i++) {
                res[upIndex][i] = cnt++;
            }
            upIndex++;
            if (cnt > limit) {
                break;
            }

            for (int i = upIndex; i <= downIndex; i++) {
                res[i][rightIndex] = cnt++;
            }
            rightIndex--;

            for (int i = rightIndex; i >= leftIndex; i--) {
                res[downIndex][i] = cnt++;
            }
            downIndex--;
            if (cnt > limit) {
                break;
            }

            for (int i = downIndex; i >= upIndex; i--) {
                res[i][leftIndex] = cnt++;
            }
            leftIndex++;
        }
        return res;
    }
}
