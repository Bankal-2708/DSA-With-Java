package Sorting;

import java.util.Arrays;

public class SelectionSort { // take first element and compare it with all elements to right side and swap with the smallest element tc is 0(n^2) and sc is 0(1)
  public static void main(String[] args) {
    int[] arr = { 9, 5, 3, 1, 2, 4, 6, 8, 7 };

    for (int i = 0; i < arr.length; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      if (min != i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }

    }
    System.out.println(Arrays.toString(arr));
  }
}
