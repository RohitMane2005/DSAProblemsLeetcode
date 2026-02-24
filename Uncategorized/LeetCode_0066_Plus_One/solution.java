class Solution {
    public int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }