class Solution {
    public int[] runningSum(int[] nums) {
    //    int[] result = new int[nums.length];
    //    result[0] = nums[0];
       for (int i = 1; i < nums.length; i++) {
        nums[i] = nums[i-1] + nums[i];
       } 
    //     int i = 0;
    //    for (int n : result) {
    //     nums[i++] = n;
    //    }

       return nums;
    }
}