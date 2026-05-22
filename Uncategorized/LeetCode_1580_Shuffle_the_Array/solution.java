class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = nums.length;
        int ans[] = new int[x];
        int left = 0;
        int right = n;
        int i = 0;
