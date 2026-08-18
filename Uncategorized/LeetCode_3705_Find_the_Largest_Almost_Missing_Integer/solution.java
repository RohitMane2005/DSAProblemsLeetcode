import java.util.HashSet;
import java.util.Set;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        // Count how many subarrays of size k contain each number
        int[] subarrayCount = new int[51];

        for (int i = 0; i <= n - k; i++) {
            // Track distinct elements in the current window of size k
            Set<Integer> uniqueInWindow = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                uniqueInWindow.add(nums[j]);
            }