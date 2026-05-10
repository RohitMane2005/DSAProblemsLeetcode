class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        
        // Loop until one of the strings is exhausted
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        
        // Append the remaining part of word1 (if any)
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        }
        
        // Append the remaining part of word2 (if any)
        if (j < word2.length()) {
            sb.append(word2.substring(j));
        }
        
        return sb.toString();
    }
}