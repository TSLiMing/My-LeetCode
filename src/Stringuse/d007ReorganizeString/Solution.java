package Stringuse.d007ReorganizeString;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reorganizeString("bbbbb"));
    }

    public String reorganizeString(String s) {
        int[] words = new int[26];
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            words[s.charAt(i) - 'a']++;
        }

        int index = getMaxIndex(words);
        char append = (char) (index + 'a');
        sb.append(append);
        words[index]--;

        for (int i = 1; i < len; i++) {
            index = getMaxIndex(words, append);
            if (index == -1) {
                return "";
            }
            words[index]--;
            sb.append((char) (index + 'a'));
            append = (char) (index + 'a');
        }

        for (int i = 1; i < len; i++) {
            if (sb.charAt(i - 1) == sb.charAt(i)) {
                return "";
            }
        }

        return sb.toString();
    }

    public static int getMaxIndex(int[] words) {
        int res = -1;
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (words[i] > max) {
                res = i;
                max = words[i];
            }
        }
        return res;
    }

    public static int getMaxIndex(int[] words, char ch) {
        int res = -1;
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (words[i] > max && (char) (i + 'a') != ch) {
                res = i;
                max = words[i];
            }
        }
        return res;
    }
}
