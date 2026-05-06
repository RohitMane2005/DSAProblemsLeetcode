class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Check if a common divisor string is possible
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of lengths
        int gcdLen = gcd(str1.length(), str2.length());

        // Return substring of gcd length