class Solution {
    public void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
            newArr[i + nums.length] = nums[i];
        }

        k = k % nums.length;

        int start = nums.length - k;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArr[start + i];
        }
    }
}