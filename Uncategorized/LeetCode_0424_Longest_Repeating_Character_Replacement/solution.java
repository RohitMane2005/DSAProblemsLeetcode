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

            // Window length is (right - left + 1)
            // Number of characters to replace = (window length - maxCount)
            // If replacements needed exceed k, shrink the window from the left
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum valid window length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}