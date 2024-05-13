package Stringuse.d003ReverseWords;

import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        char[] res;
        //去空格
        res = deleteSpace(s);
        //翻转每个单词
        reverseEachWords(res);
        //翻转整个字符串
        reverseString(res);
        return String.valueOf(res);
    }

    public static char[] deleteSpace(String s) {
        char[] str = s.toCharArray();
        int start = 0, end = str.length - 1;

        //删去前导和尾随空格
        while (start <= end && str[start] == ' ') start++;
        while (start <= end && str[end] == ' ') end--;

        //删除单词间的多个空格
        char[] res = new char[end - start + 1];
        boolean flag = true;  //表示是否有多个空格，true为否，false为是
        int resIndex = 0;
        for (int i = start; i <= end; i++) {
            if (str[i] == ' ') {
                if (flag) {  //表示只有一个空格
                    res[resIndex++] = str[i];
                    flag = false;
                } else {  //表示有多个空格
                    continue;
                }
            } else {
                flag = true;
                res[resIndex++] = str[i];
            }
        }
        return Arrays.copyOfRange(res, 0, resIndex);
    }

    public static void reverseEachWords(char[] s) {
        int leftIndex = 0, rightIndex = 0;
        int len = s.length;
        while (leftIndex < len) {
            while (rightIndex < len && s[rightIndex] != ' ') rightIndex++;
            for (int i = leftIndex, j = rightIndex - 1; i < j; i++, j--) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            rightIndex++;
            leftIndex = rightIndex;

        }
    }

    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
