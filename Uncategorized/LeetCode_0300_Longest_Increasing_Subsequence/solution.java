class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        int maxLength = 1;

        // Iterate backwards from the last element to the first
        for (int i = n - 1; i >= 0; i--) {
            // Base case: at minimum, a subsequence of length 1 starts at index i
            dp[i] = 1;