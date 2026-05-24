class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp = new int[n];

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, dfs(arr, d, i, dp));
        }

        return result;
    }

    private int dfs(int[] arr, int d, int index, int[] dp) {
        if (dp[index] != 0) {
            return dp[index];
        }

        int maxJump = 1;