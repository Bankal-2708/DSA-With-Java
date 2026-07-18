package Sliding_Window;

public class maxSubArray2 {
  public int maxSumArr(int[] arr) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      currSum += arr[i];
      currSum = Math.max(arr[i], currSum);
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;

  }

  public static void main(String[] args) {
    maxSubArray2 mx = new maxSubArray2();

    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(mx.maxSumArr(arr));
  }
}
