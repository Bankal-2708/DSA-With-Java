package Collections.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDuplicate {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 2, 6, 4, 8, 4, 4, 4, 8, 4, 8, 2, 7, 2, 1, 2, 45, 69, 55, 54, 32, 5, 78, 9, 3, 4 };

    // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.putIfAbsent(arr[i], i);
    }
    System.out.println(map);
  }
}
