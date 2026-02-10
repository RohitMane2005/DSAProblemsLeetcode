class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int maxNum = numBottles;
        // while(numBottles >= numExchange){
        // int divide = numBottles/numExchange;
        // int remeaning = numBottles%numExchange;
        // maxNum+=divide;
        // numBottles = divide + remeaning;
        // }
        // return maxNum;
         return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}