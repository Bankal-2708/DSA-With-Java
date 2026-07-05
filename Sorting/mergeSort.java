package Sorting;

import java.util.Arrays;

public class mergeSort {
  // Merge Sort is a Divide and Conquer sorting algorithm.

  // It works in 3 steps:

  // Divide the array into two halves.
  // Recursively sort both halves.
  // Merge the two sorted halves into one sorted array.

  public static void merge(int[] arr, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = 0;

    int[] merge = new int[high - low + 1];

    while (i <= mid && j <= high) {
      if (arr[i] <= arr[j]) {
        merge[k++] = arr[i++];
      }else{
        merge[k++] = arr[j++];
      }
    }
    while (i <= mid) {
      merge[k++] = arr[i++];
    }

    while (j <= high) {
      merge[k++] = arr[j++];
    }

    for (int l = 0; l < merge.length; l++) {
      arr[low + l] = merge[l];
    }
  }

  public static void divide(int[] arr, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      divide(arr, low, mid);
      divide(arr, mid + 1, high);

      merge(arr, low, mid, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 7, 4, 2, 1, 6, 3, 8, 9, 5 };
    divide(arr, 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }
}
