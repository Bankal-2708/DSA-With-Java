package Sorting;

import java.util.Arrays;

public class QuickSort { // Quick Sort is a Divide and Conquer sorting algorithm.

  // Choose a pivot element.
  // Placing the pivot in its correct sorted position.
  // Putting all smaller elements to the left of the pivot.
  // Putting all larger elements to the right of the pivot.
  // Recursively repeating the process on the left and right parts.

  public static int partition(int[] arr, int low, int high) {
    int i = low - 1;
    int pivot = arr[high];

    for (int j = low; j < high; j++) { // not from 0 to arr.length bcz it run for every sub array not for entire array
      if (arr[j] < pivot) {
        i++;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    i++;
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;

    return i;
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 7, 4, 2, 1, 6, 3, 8, 9, 5 };
    int low = 0;
    int high = arr.length - 1;
    quickSort(arr, low, high);

    System.out.println(Arrays.toString(arr));
  }
}
