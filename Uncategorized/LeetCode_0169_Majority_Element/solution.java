class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        int count = 1; // Start at 1 since an element always counts itself
        int maxCount = 1;
        int ans = nums[0];
        
        // Stop before the last element to prevent Out of Bounds error
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    ans = nums[i];
                }
            } else {
                count = 1; // Reset count for the next unique number
            }
        }
        return ans;
    }
}