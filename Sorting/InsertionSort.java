package Sorting;

import java.util.Arrays;

// take first element and compare it with all elements to left side and swap with the smallest element tc is 0(n^2) and sc is 0(1)
public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 9, 5, 3, 1, 2, 4, 6, 8, 7 };

    for (int i = 1; i < arr.length; i++) {  // it will take the first element and compare it with all elements to left side and swap with the smallest element
      int temp = arr[i];
      int j = i - 1;  

      while (j >= 0 && arr[j] > temp) { // it will check the current element is greater than the next element and swap them
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }

    System.out.println(Arrays.toString(arr));
  }
}
