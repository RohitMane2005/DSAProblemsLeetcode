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

            // Look forward at all elements that come after index i
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }

            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
}