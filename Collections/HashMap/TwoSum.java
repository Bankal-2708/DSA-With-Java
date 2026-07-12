package Collections.HashMap;

import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {

    int[] arr = { 2, 1, 4, 3, 5, 6 };
    int target = 7;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int diff = target - i;

      if (map.containsKey(diff)) {
        System.out.println("Find " + i + " & " + diff + " Sum is " + target);
        break;
      }
      map.put(arr[i], i);
    }

  }
}
