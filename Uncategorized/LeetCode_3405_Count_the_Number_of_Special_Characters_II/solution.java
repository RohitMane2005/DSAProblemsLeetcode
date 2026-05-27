class Solution {
    public int numberOfSpecialChars(String word) {
        // Arrays to store the last seen index of lowercase 
        // and first seen index of uppercase characters.
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];
        
        // Initialize arrays with -1 to indicate "not seen"
        java.util.Arrays.fill(lastLower, -1);
        java.util.Arrays.fill(firstUpper, -1);
        
        // Traverse the string once to populate the indices
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                lastLower[ch - 'a'] = i; // Always update to keep the last occurrence
            } else {
                int idx = ch - 'A';
                if (firstUpper[idx] == -1) {
                    firstUpper[idx] = i; // Only update the first occurrence
                }
            }
        }
        
        int specialCount = 0;
        
        // Check conditions for all 26 letters
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 && firstUpper[i] != -1 && lastLower[i] < firstUpper[i]) {
                specialCount++;
            }
        }
        
        return specialCount;
    }
}