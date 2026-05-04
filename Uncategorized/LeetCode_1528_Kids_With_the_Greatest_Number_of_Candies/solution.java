import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        // Step 1: Find max candies
        int maxCan = 0;
        for (int candy : arr) {
            maxCan = Math.max(maxCan, candy);
        }
