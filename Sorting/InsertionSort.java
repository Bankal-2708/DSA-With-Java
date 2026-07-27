package Sorting;

import java.util.Arrays;

// take first element and compare it with all elements to left side and swap with the smallest element tc is 0(n^2) and sc is 0(1)
public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 9, 5, 3, 1, 2, 4, 6, 8, 7 };

    for (int i = 1; i < arr.length; i++) { // it will take the first element and compare it with all elements to left
                                           // side and swap with the smallest element
      int temp = arr[i]; // Store the current element

      int j = i - 1; // Start comparing with the previous element

      while (j >= 0 && arr[j] > temp) { // Shift all larger elements one position to the right
        arr[j + 1] = arr[j];
        j--;
      }
      
      arr[j + 1] = temp; // Insert temp at its correct position

    }

    System.out.println(Arrays.toString(arr));
  }
}
