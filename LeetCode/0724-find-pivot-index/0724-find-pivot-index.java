class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int n : nums) {
            totalSum += n;
        }

        for (int i = 0; i < nums.length; i++) {

            rightSum = totalSum - leftSum - nums[i]; // calculate rightSum formula

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i]; // if not equal move that elemnt to left and it into leftSum

        }

        return -1;
    }
}