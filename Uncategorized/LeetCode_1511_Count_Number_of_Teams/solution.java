class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        
        int[] incPairs = new int[n];
        int[] decPairs = new int[n];
        
        int totalTeams = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    incPairs[i]++;
                    totalTeams += incPairs[j];
                } 
                else if (rating[j] > rating[i]) {
                    decPairs[i]++;
                    totalTeams += decPairs[j];
                }
            }
        }
        
        return totalTeams;
    }
}