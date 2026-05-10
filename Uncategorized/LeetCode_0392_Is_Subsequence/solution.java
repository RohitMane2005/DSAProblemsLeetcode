class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t
        
        // Walk through both strings
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the pointer for t
            j++;
        }
        
        // If i reached the end of s, it means all characters were found in order
        return i == s.length();
    }
}