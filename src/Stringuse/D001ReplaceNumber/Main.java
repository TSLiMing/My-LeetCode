package Stringuse.D001ReplaceNumber;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main s= new Main();
        System.out.println(s.replaceNumber(sc.next()));
    }

    public String replaceNumber(String s) {
        final String APPEND = "number";
        StringBuilder sb = new StringBuilder();

        for (int i = 0, len = s.length(); i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(APPEND);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
