package c006FourSumCount;

import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //合并nums1和nums2，合并nums3和nums4，最后在两个合并好的数组中寻找（同两数相加）
        //不同的是要记录出现次数，所以使用map
        int n = nums1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = nums1[i] + nums2[j];
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = nums3[i] + nums4[j];
                if (map.containsKey(-temp)) {
                    count += map.get(-temp);
                }
            }
        }

        return count;
    }
}
