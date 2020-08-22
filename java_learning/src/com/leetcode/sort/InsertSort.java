package com.leetcode.sort;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            int target = arr[i];
            int j = i;
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                --j;
            }
            if (i != j) {
                arr[j] = target;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,6,4,2,5};
        System.out.println("before sort: " + Arrays.toString(arr));
        InsertSort.sort(arr);
        System.out.println("after sort: " + Arrays.toString(arr));
    }
}
