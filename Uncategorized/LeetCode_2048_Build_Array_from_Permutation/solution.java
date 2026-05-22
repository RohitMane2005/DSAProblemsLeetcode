class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int originalTargetIndex = nums[i];
            int newValue = nums[originalTargetIndex] % n; 
            
            nums[i] = nums[i] + (n * newValue);
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        
        return nums;
    }
}