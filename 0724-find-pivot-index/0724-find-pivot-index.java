class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length;

        int sumLeft = 0;
        int sumRight = 0;
        int totalSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            sumRight = totalSum - sumLeft - nums[i];

            if (sumLeft == sumRight) {
                return i;
            }

            sumLeft += nums[i];

        }

        return -1;
    }
}