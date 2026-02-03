class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int x : nums) totalSum += x;

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];   // right sum

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}
