package Array;
import java.util.Arrays;

public class MoveZeroes {
  public static void main(String[] args) {
    int arr[] = { 0 };
    int n = arr.length;

     System.out.println(n);

    int j = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        arr[j++] = arr[i];
        // j++;
      }

    }
    while (j < n) {
      arr[j] = 0;
      j++;
    }
    System.out.println(Arrays.toString(arr));
  }
}
