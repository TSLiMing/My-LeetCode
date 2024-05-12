package Array.a013TotalFruit;

import java.util.Arrays;

public class Solution {
    public int totalFruit(int[] fruits) {
        final int MAXCNT = 2;
        int startIndex, endIndex, res = 0;
        int cnt = 0;
        int[] numberStatus = new int[fruits.length];
        Arrays.fill(numberStatus, 0);

        for (startIndex = endIndex = 0; endIndex < fruits.length; endIndex++) {
            if (numberStatus[fruits[endIndex]] == 0){
                cnt++;
            }
            numberStatus[fruits[endIndex]]++;

            while (cnt > MAXCNT) {
                numberStatus[fruits[startIndex]]--;
                if (numberStatus[fruits[startIndex]] == 0) {
                    cnt--;
                }
                startIndex++;
            }
            res = Math.max(res, endIndex - startIndex + 1);
        }

        return res;
    }
}
