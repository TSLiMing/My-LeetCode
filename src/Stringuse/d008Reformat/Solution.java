package Stringuse.d008Reformat;

import java.util.ArrayList;

public class Solution {

    public String reformat(String s) {
        ArrayList<Character> alpha = new ArrayList<>();
        ArrayList<Character> number = new ArrayList<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number.add(ch);
            } else {
                alpha.add(ch);
            }
        }

        if (Math.abs(number.size() - alpha.size()) >= 2) {
            return "";
        }

        if (number.size() >= alpha.size()) {
            return concat(number, alpha);
        } else {
            return concat(alpha, number);
        }
    }

    public static String concat(ArrayList<Character> list1, ArrayList<Character> list2) {
        StringBuilder sb = new StringBuilder();

        int len1 = list1.size();
        int len2 = list2.size();
        for (int i = 0, j = 0; i < len1; i++, j++) {
            sb.append(list1.get(i));
            if (j < len2) {
                sb.append(list2.get(j));
            }
        }
        return sb.toString();
    }
}