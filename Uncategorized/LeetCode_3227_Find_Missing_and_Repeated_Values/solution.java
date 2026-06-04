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

            if(arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for(i = 0; i < size; i++) {
            if(arr[i] != i + 1) {
                return new int[]{arr[i], i + 1};
            }
        }

        return new int[]{-1, -1};
    }
}