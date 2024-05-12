package HashTable.c003IsHappy;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Long> appearedNumber = new HashSet<>();

        long update = 0;
        long temp = (long)n;
        while (update != 1) {
            update = 0;
            while (temp != 0) {
                long num = temp % 10;
                update += num * num;
                temp /= 10;
            }
            if (appearedNumber.contains(update)) {
                return false;
            }
            appearedNumber.add(update);
            temp = update;
        }
        return true;
    }
}
