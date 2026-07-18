package Sliding_Window;

import java.util.*;

public class MaxSubArray {

  public int maxSub(int[] arr, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      while (sum == target) {
        maxLen = i + 1;
      }

      if (map.containsKey(sum - target)) {
        int len = i - map.get(sum - target);
        maxLen = Math.max(maxLen, len);
      }
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }

    return maxLen;
  }

  public static void main(String[] args) {
    MaxSubArray ma = new MaxSubArray();
    int[] arr = { 1, 4, 2, 7, 4, 8, 5 };
    int target = 13;
    System.out.println(ma.maxSub(arr, target));
  }
}
