package com.leetcode.array;

public class RemoveDuplicatesfromSortedArrayII_80 {
    /*
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 1;
        int cnt = 1;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == nums[i - 1]) {
                ++cnt;
                if (cnt > 2) {
                    this.removeElement(nums, i);
                    --i;
                    --len;
                }
            } else {
                cnt = 1;
            }
            ++i;
        }
        return len;
    }

    void removeElement(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; ++i) {
            nums[i] = nums[i + 1];
        }
    }
    */

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int cnt = 1;
        int j = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                ++cnt;
            } else {
                cnt = 1;
            }
            if (cnt <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII_80 s = new RemoveDuplicatesfromSortedArrayII_80();
        int res = s.removeDuplicates(new int[]{1,1,1,2,2,3});
        System.out.print(res);
    }
}
