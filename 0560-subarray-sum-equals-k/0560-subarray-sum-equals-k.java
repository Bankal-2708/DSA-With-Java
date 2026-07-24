class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for (int n : nums) {
            prefix += n;

            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k); // add the frequency
            }
            
            map.put(prefix, map.getOrDefault(prefix, 0)+1); //If the prefix sum already exists, we increase its frequency by 1. Otherwise, we insert it with a frequency of 1.


        }
        return count;
    }
    
}