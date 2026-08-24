class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while(temp != 0){
            int currentDigit = temp%10;
            product *= currentDigit;
            sum += currentDigit;
            temp/=10;
            
        }
        int totalSum = (sum + product);
        return n % totalSum == 0;
    }
}