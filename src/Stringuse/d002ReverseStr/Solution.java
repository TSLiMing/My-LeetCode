package Stringuse.d002ReverseStr;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "abc";
        int k  = 2;
        System.out.println(s.reverseStr(str, k));
    }

    public String reverseStr(String s, int k) {
        int len = s.length();
        int left = 0, right = k; //[left, right)

        StringBuilder sb = new StringBuilder();
        while (left < len) {
            if (right <= len) {
                sb.append(reverseString(s.substring(left, right)));
            } else {
                sb.append(reverseString(s.substring(left)));
            }

            left += 2 * k;
            if (left < len) {
                sb.append(s.substring(right, left));
            } else if (right <= len){
                sb.append(s.substring(right));
            }

            right += 2 * k;
        }

        return sb.toString();
    }

    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
