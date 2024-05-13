package Stringuse.d004StrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int limit = needle.length();
        for (int i = 0, len = haystack.length(); i < len; i++) {
            int j = 0;
            int temp = i;
            while (temp < len && j < limit && haystack.charAt(temp) == needle.charAt(j)) {
                temp++;
                j++;
            }
            if (j == limit) {
                return i;
            }
        }
        return -1;
    }
}
