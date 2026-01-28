class Solution {
    public int[][] transpose(int[][] arr) {
        int rows = arr.length;
        int column = arr[0].length;
        int [][] arr2 = new int[column][rows];
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                arr2[i][j] = arr[j][i];
            }
        }
        return arr2;
    }
}