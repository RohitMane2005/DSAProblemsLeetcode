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
            
            // Every row starts with 1
            row.add(1);
            
            // Fill in the middle elements using elements from the previous row
            for (int j = 0; j < prevRow.size() - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            
            // Every row ends with 1
            row.add(1);
            
            // Add the completed row to our final list
            ans.add(row);
        }
        
        return ans;
    }
}