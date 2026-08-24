class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while(temp != 0){
            int currentDigit = temp%10;
            product *= currentDigit;