package Sliding_Window;

// This is the implementation of Kadane's algorithm to find the maximum sum of a contiguous subarray in an array of integers.
// dynamic size we have target and found the maxlen of subarray whose sum is equal to target


import java.util.HashMap;

public class maxLength {
  public void max(int[] arr, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    int maxlen = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      if (sum == target) {
        maxlen = i + 1;
      }

      if (map.containsKey(sum - target)) { // Have I seen a previous prefix sum that would make the current subarray sum equal to target?
        int len = i - map.get(sum - target); // Calculate the length of the subarray that sums to target
        maxlen = Math.max(maxlen, len); // Update maxlen if this subarray is longer than previous ones
      }
      if (!map.containsKey(sum)) { // if it does not contain the sum then only put it in the map because we want to store the first       occurrence of the sum
        map.put(sum, i);
      }
    }
    System.out.print(maxlen);

  }

  public static void main(String[] args) {
    maxLength mn = new maxLength();
    int[] arr = { 1, 5, 4, 2, 9, 9, 9, 3, 5, 2, 6, 6, 0, 0, 0, 4, 7 };
    int target = 12;
    mn.max(arr, target);
  }
}
