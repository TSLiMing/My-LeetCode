package a002RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int slowPointer, fastPointer;
        for (slowPointer = fastPointer = 0; fastPointer < nums.length; fastPointer++){
            if (nums[fastPointer] != val){  //当快指针指向的不是特定值，则将其迁移到慢指针所在位置
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }  //如果快指针指向的是特定值，则直接跳过，相当于删去了

        }
        return slowPointer;
    }
}
