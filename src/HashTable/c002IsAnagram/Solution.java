package HashTable.c002IsAnagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] status = new int[26];
        for (int i = 0, len = s.length(); i < len; i++) {
            status[s.charAt(i) - 'a']++;
        }
        for (int i = 0, len = t.length(); i < len; i++) {
            status[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (status[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
