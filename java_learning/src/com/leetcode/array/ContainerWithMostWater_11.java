package com.leetcode.array;

public class ContainerWithMostWater_11 {
    // 暴力法 时间复杂度O(n^2) 空间复杂度O(1)
//    public int maxArea(int[] height) {
//        int res = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; ++j) {
//                res = Math.max(res, Math.abs(j - i) * Math.min(height[i], height[j]));
//            }
//        }
//        return res;
//    }
    // 双指针 时间复杂度O(n) 空间复杂度O(1)
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ContainerWithMostWater_11 s = new ContainerWithMostWater_11();
        int res = s.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.print(res);
    }
}
