class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int winSum = 0;
        int maxSum =0;

        for (int i = 0; i < k; i++) {
            winSum += nums[i];
        }
        maxSum = winSum;

        for (int i = k; i < n; i++) {
            winSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, winSum);
        }
        return (double) maxSum / k;
    }
}