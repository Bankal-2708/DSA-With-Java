package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurrence {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 2, 6, 4, 8, 4, 4, 4, 8, 4, 8, 2, 7, 2, 1, 2, 45, 69, 55, 54, 32, 5, 78, 9, 3, 4 };

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    System.out.println(map);

    int max = 0;
    int maxEle = arr[0];

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        maxEle = entry.getKey();
      }
    }

    System.out.println( "Elemnt " + maxEle+ " comes "+ max + " times");
  }
}
