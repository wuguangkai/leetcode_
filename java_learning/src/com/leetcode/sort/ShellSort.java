package com.leetcode.sort;

import java.util.Arrays;

public class ShellSort {
    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        int len = arr.length;
        int k = len / 2;
        while (k > 0) {
            for (int i = k; i < len; ++i) {
                int target = arr[i];
                int j = i;
                while (j >= k && target < arr[j - k]) {
                    arr[j] = arr[j - k];
                    j -= k;
                }
                if (i != j) {
                    arr[j] = target;
                }
            }
            k /= 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,6,4,2,5};
        System.out.println("before sort: " + Arrays.toString(arr));
        ShellSort.sort(arr);
        System.out.println("after sort: " + Arrays.toString(arr));
    }
}
