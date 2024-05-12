package Array.a011BackspaceCompare;

public class Solution {
    public static String deal(String s) {
        StringBuilder ss = new StringBuilder();

        int cnt = 0;
        for (int i = 0, len = s.length(); i < len; i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                ss.append(ch);
                cnt++;
            } else {
                if (cnt > 0) {
                    ss.deleteCharAt(cnt - 1);
                    cnt--;
                }
            }
        }
        return ss.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        s = deal(s);
        t = deal(t);
        return s.equals(t);
    }
}
