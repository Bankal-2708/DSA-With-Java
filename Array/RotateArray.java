package Array;

import java.util.*;

public class RotateArray {

  public static void reverse(int[] arr, int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int r = 4 % arr.length;
    // int result[] = new int[arr.length];
    // int k = 0;

    // for (int i = arr.length-1; i >= arr.length - r; i--) {
    // result[k++] = arr[i];
    // }
    // for (int i = 0; i < arr.length - r; i++) {
    // result[k++] = arr[i];
    // }

    reverse(arr, 0, arr.length - r - 1); // reverse first till r
    reverse(arr, arr.length - r, arr.length - 1); // reverse after r 
    reverse(arr, 0, arr.length - 1); // reverse the whole array

    System.out.println(Arrays.toString(arr));
  }
}
