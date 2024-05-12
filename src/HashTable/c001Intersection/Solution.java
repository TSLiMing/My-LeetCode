package HashTable.c001Intersection;

import java.util.HashSet;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int each : nums1) {
            hs.add(each);
        }

        for (int each : nums2) {
            if (hs.contains(each)) {
                res.add(each);
            }
        }

        int cnt = 0;
        int[] result = new int[res.size()];
        for (Integer i : res) {
            result[cnt++] = i;
        }

        return result;
    }
}
