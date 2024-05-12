package Array.a006MySqrt;

public class Solution {
    public int mySqrt(int x) {
        int l = 1, r = x;
        while (l < r) {
            int mid = l + (r - l >> 1);
            long mid2 = (long) mid * mid;
            long upMid2 = (long) (mid + 1) * (mid + 1);
            if (mid2 <= x && upMid2 > x) {
                return mid;
            } else if (mid2 < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;

    }
}
