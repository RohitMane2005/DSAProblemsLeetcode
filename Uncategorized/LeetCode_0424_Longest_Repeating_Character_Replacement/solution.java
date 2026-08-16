class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Include current character in the window frequency map
            int currentCharIndex = s.charAt(right) - 'A';
            count[currentCharIndex]++;
            
            // Track the frequency of the most frequent character in the current window
            maxCount = Math.max(maxCount, count[currentCharIndex]);
