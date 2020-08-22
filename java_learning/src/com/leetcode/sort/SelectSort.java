package com.leetcode.sort;

import java.util.Arrays;

public class SelectSort {
    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        int len = arr.length;
        for (int i = 0; i < len - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < len; ++j) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,9,4,2,6};
        System.out.println("before sort: " + Arrays.toString(arr));
        SelectSort.sort(arr);
        System.out.println("after sort: " + Arrays.toString(arr));
    }
}
