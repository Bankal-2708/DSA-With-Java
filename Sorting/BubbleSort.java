package Sorting;

// sc = 0(n) and tc = 0(n^2) in worst case and 0(n) in best case

import java.util.*;

public class BubbleSort {

  public static void main(String[] args) {
   
    int[] arr = { 3, 2, 1, 6, 4, 7, 5, 9, 8 };

    boolean swaped = false;

    for (int i = 1; i < arr.length; i++) { // it run again and again for n-1 times and check the array is sorted or not
      for (int j = 0; j < arr.length - 1; j++) { // it swap the elements if the current element is greater than the next element
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swaped = true;
        }
      }
      if (!swaped) { // if the array is already sorted then it will not run again and again and break the loop
        break;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
