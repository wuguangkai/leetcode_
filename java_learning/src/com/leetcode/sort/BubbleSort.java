package com.leetcode.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        int len = arr.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,9,4,2,6};
        System.out.println("before sort: " + Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println("after sort: " + Arrays.toString(arr));
    }
}
