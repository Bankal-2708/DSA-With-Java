package Two_Pointer;

import java.util.Arrays;

public class RemoveDublicate {  // work only on sorted array
   public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8 };

    int i = 0;

    for (int j = 1; j < arr.length; j++) {
      if (arr[j] != arr[i]) {
        i++;
        arr[i] = arr[j];
      }
    }
    System.out.println(Arrays.toString(Arrays.copyOf(arr, i + 1)));
  }
}
