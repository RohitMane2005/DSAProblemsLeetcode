import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        // Step 1: Find max candies
        int maxCan = 0;
        for (int candy : arr) {
            maxCan = Math.max(maxCan, candy);
        }

        // Step 2: Compare each kid
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + extraCandies >= maxCan) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}