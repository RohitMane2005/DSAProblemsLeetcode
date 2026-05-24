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

        // Check left
        for (int i = index - 1; i >= Math.max(0, index - d); i--) {
            if (arr[i] >= arr[index]) {
                break;
            }
            maxJump = Math.max(maxJump, 1 + dfs(arr, d, i, dp));
        }

        // Check right
        for (int i = index + 1; i <= Math.min(arr.length - 1, index + d); i++) {
            if (arr[i] >= arr[index]) {
                break;
            }
            maxJump = Math.max(maxJump, 1 + dfs(arr, d, i, dp));
        }

        dp[index] = maxJump;
        return maxJump;
    }
}