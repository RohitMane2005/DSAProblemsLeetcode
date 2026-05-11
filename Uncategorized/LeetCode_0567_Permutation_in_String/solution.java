class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int s1Count[] = new int[26];
        int windowCount[] = new int[26];

        for(char ch : s1.toCharArray()){
            s1Count[ch-'a']++;
        }

        int left = 0;
