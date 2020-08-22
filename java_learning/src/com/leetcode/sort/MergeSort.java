package com.leetcode.sort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        sort(arr, left, mid, right);
    }

    public static void sort(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < index; ++k) {
            arr[k + left] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,6,4,2,5};
        System.out.println("before sort: " + Arrays.toString(arr));
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("after sort: " + Arrays.toString(arr));
    }
}
