class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        int[] ans = new int[n];
        int[] freq = new int[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            freq[A[i]]++;

            if (freq[A[i]] == 2) {