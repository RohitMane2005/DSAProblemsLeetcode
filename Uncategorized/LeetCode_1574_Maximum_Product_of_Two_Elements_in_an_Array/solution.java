class Solution {
    public int maxProduct(int[] arr) {

        int max1 = 0;
        int max2 = 0;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;