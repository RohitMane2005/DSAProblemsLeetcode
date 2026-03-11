class Solution {
    public String findDifferentBinaryString(String[] nums) {

        int n = nums.length;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {

            char c = nums[i].charAt(i);