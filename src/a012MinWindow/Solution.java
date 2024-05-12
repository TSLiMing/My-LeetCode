package a012MinWindow;

import java.util.Arrays;

public class Solution {

    public static int mapIn(char ch) {
        if (Character.isLowerCase(ch)) {
            return ch - 'a';
        } else {
            return ch - 'A' + 26;
        }
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        int[] status = new int[52];
        Arrays.fill(status, 0);

        int SLen = s.length(), TLen = t.length();
        int startIndex, endIndex;
        int recordStart = 0x3f3f3f3f, recordEnd = 0x3f3f3f3f, recordLen = 0x3f3f3f3f;
        int cnt = 0;

        for (int i = 0; i < TLen; i++) {
            int index = mapIn(t.charAt(i));
            if (status[index] == 0) {
                cnt++;
            }
            status[index]++;
        }

        for (startIndex = endIndex = 0; endIndex < SLen; endIndex++) {
            int index = mapIn(s.charAt(endIndex));
            status[index]--;
            if (status[index] == 0) {
                cnt--;
            }

            while (cnt == 0) {
                if (endIndex - startIndex + 1 < recordLen) {
                    recordStart = startIndex;
                    recordEnd = endIndex;
                    recordLen = endIndex - startIndex + 1;
                }

                int otherIndex = mapIn(s.charAt(startIndex));
                startIndex++;
                status[otherIndex]++;
                if (status[otherIndex] > 0) {
                    cnt++;
                }
            }
        }

        if (recordLen == 0x3f3f3f3f) {
            return "";
        }
        return s.substring(recordStart, recordEnd + 1);
    }
}
