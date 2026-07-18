package Sliding_Window;

public class MaxSum {

  public int maxSum(int[] arr, int k) {
    int result = 0;
    int winSum = 0;

    for (int i = 0; i < k; i++) {
      winSum += arr[i];
    }
    result = winSum;

    for (int i = k; i < arr.length; i++) {
      winSum += arr[i] - arr[i - k];
      result = Math.max(result, winSum);
    }
    return result;
  }

  public static void main(String[] args) {
    MaxSum max = new MaxSum();
    int[] arr = { 1, 4, 2, 8, 0, 9, 5, 2, 6 };
    int k = 3;
    System.out.println(max.maxSum(arr, k));
  }
}
