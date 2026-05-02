class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int first = 0;
        int sec = 1;
        int third = 1;
        for(int i = 0; i<n; i++){