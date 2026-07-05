import java.util.*;

public class TwoSum {
  // by hash map other wise we need to sort an array and then use two pointer
  // approach

  HashMap<Integer, Integer> map = new HashMap<>();

  public int[] display(int[] arr, int target) {

    for (int i = 0; i < arr.length; i++) {
      int diff = target - arr[i];

      if (map.containsKey(diff)) {
        return new int[] { map.get(diff), i };
      }
      map.put(arr[i], i);
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();
    int[] arr = { 4, 3, 2, 1, 5, 7 };
    int target = 12;
    int[] result = ts.display(arr, target);

    System.out.println(Arrays.toString(result));
  }

}
