package Sorting;

import java.util.Arrays;

public class Practics {

  public static int partition(int[] arr, int low, int high) {
    int i = low - 1;
    int pivot = arr[high];

    for (int j = low; j < high; j++) {
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
    int[] arr = { 9, 5, 3, 1, 2, 4, 6, 8, 7 };
    // bubble sort
    // int count = 0; // 72
    // boolean swaped = false;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // swaped = true;
    // }
    // count++;
    // if (!swaped) {
    // break;
    // }

    // }
    // }

    // selection sort
    // int count = 0; // 5
    // for (int i = 0; i < arr.length; i++) {
    // int min = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[min] > arr[j]) {
    // min = j;
    // }
    // }
    // if (min != i) {
    // int temp = arr[min];
    // arr[min] = arr[i];
    // arr[i] = temp;
    // count++;
    // }
    // }

    // insertion sort
    // int count = 0; //
    // for (int i = 1; i < arr.length; i++) {
    // int temp = arr[i];
    // int j = i - 1;
    // while (j >= 0 && arr[j] > temp) {
    // arr[j + 1] = arr[j];
    // j--;
    // }
    // count++;
    // arr[j + 1] = temp;

    // }

    // System.out.println(Arrays.toString(arr));
    // System.out.println(count);

    int low = 0;
    int hight = arr.length - 1;

    quickSort(arr, low, hight);

    System.out.println(Arrays.toString(arr));
  }

}
