import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        // Hash map to store the frequency of each fruit type in the current window
        HashMap<Integer, Integer> count = new HashMap<>();
        
        int left = 0;
        int maxFruits = 0;
        
        // Right pointer expands the window
        for (int right = 0; right < fruits.length; right++) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);
            
            // If we have more than 2 types of fruits, shrink the window from the left
            while (count.size() > 2) {