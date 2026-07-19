class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        if (nums.length == 1) {
            return nums[0];
        }
         

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            currSum = Math.max(nums[i], currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}