class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;

        int max = -1;
        int secondMax = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {