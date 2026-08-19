class Solution {
    public int[] sortedSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int index = arr.length - 1;
        int[] ans = new int[arr.length];

        while (left <= right) {
            int leftSqr = arr[left] * arr[left];
            int rightSqr = arr[right] * arr[right];

            if (leftSqr > rightSqr) {
                ans[index] = leftSqr;
                left++;
            } else {
                ans[index] = rightSqr;
                right--;
            }
            index--;
        }

        return ans;
    }
}
