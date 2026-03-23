class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1); // Important base case
        
        int sum = 0;
        int count = 0;
        
        for (int num : nums) {
            sum += num;