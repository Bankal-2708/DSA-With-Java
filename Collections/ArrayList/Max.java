package Collections.ArrayList;

import java.util.*;

public class Max {
  public static void main(String[] args) {
    Integer[] arr = { 2, 1, 5, 3, 8, 55, 66, 33, 85, 56, 7, 6 };
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    // ArrayList<Integer> list = new ArrayList<>(List.of(arr));
        ArrayList<Integer> list = new ArrayList<>();


    for (int num : arr) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }
    list.add(min);
    list.add(max);

    // System.out.println(Collections.max(list));
    // System.out.println(Collections.min(list));

    System.out.println(list);
  }
}
