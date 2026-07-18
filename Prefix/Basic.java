package Prefix;

import java.util.Arrays;

public class Basic {

  public int sum(int[] prefix, int i, int j) {
    if (i == 0)
      return prefix[j];

    return prefix[j] - prefix[i - 1];
  }

  public static void main(String[] args) {

    Basic ba = new Basic();

    int[] arr = { 1, 4, 2, 6, 3 };
    int n = arr.length;
    int[] prefix = new int[n];

    prefix[0] = arr[0];

    for (int i = 1; i < n; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    int i = 1;
    int j = 4;

    System.out.println(Arrays.toString(prefix));
    System.out.println(ba.sum(prefix, i, j));
  }
}
