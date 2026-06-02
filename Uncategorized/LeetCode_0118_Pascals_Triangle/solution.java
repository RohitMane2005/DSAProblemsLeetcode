class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // Base case handling
        if (numRows == 0) return ans;
        
        // Create and add the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        
        // Build the remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = ans.get(i - 1);
            ArrayList<Integer> row = new ArrayList<>();
            