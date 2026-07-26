class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];

        // Process subproblems from right to left
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1; // Base case: single character is a palindrome of length 1
            int prev = 0; // Stores dp[i+1][j-1] from the 2D DP grid
            
            for (int j = i + 1; j < n; j++) {
                int temp = dp[j];
                