package Array;

public class MissingNum {

  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n * (n + 1) / 2;
    int arrSum = 0;

    for (int i = 0; i < n; i++) {
       arrSum += nums[i];
    }
    return sum - arrSum;
  }
  public static void main(String[] args) {
    MissingNum mn = new MissingNum();
    int[] nums = { 0, 1, 3 };
    // int n = nums.length;
    // int sum = n * (n + 1) / 2;
    System.out.println(mn.missingNumber(nums));
  }
}
