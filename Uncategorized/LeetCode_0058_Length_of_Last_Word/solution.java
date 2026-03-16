class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;

        // 1. Skip any trailing spaces at the end of the string
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
