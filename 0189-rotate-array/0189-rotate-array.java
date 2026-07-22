class Solution {

    public void rev (int[] nums, int left, int right) {
       while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        // int[] newArr = new int[nums.length * 2];

        // for (int i = 0; i < nums.length; i++) {
        //     newArr[i] = nums[i];
        //     newArr[i + nums.length] = nums[i];
        // }

        // k = k % nums.length;

        // int start = nums.length - k;

        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = newArr[start + i];
        // }

        // reversing 

        k = k % nums.length;
        rev(nums, 0, nums.length-1);
        rev(nums, 0, k - 1);
        rev(nums, k, nums.length - 1);

    }
}