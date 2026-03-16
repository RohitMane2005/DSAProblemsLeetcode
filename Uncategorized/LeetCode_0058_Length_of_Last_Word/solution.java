class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;

        // 1. Skip any trailing spaces at the end of the string
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        // 2. Count the characters of the last word
        int count = 0;
        while (right >= 0 && s.charAt(right) != ' ') {
            count++;
            right--;
        }

        return count;
    }
}