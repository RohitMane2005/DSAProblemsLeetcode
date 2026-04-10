class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
    }
    public static void rev(int arr[], int i, int j){