package com.leetcode.array;

public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                ++i;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray_26 s = new RemoveDuplicatesfromSortedArray_26();
        int res = s.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.print(res);
    }
}
