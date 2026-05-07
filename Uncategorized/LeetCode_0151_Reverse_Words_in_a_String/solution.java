class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right){
            String temp = arr[left];