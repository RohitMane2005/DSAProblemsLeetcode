class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int size = n * n;

        int[] arr = new int[size];

        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[k++] = grid[i][j];
            }
        }

        int i = 0;

        while(i < size) {
            int correct = arr[i] - 1;