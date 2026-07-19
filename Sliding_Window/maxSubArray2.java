package Sliding_Window;

public class maxSubArray2 {
  public int maxSumArr(int[] arr) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    int start = 0;
    int maxStart = 0;
    int end = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > currSum + arr[i]) {
        currSum = arr[i];
        start = i;
      }else {
        currSum += arr[i];
      }

      if (currSum > maxSum) {
        maxSum = currSum;
        maxStart = start;
        end = i;
      }
    }

    System.out.println("Elements are : ");
    for (int i = maxStart; i <= end; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.print("Max Sum is : ");

    return maxSum;
  }

  public static void main(String[] args) {
    maxSubArray2 mx = new maxSubArray2();

    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(mx.maxSumArr(arr));
  }
}
