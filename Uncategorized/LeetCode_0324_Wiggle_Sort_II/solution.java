class Solution {
    public void wiggleSort(int[] arr) {
        int n = arr.length;
        int sorted[] = arr.clone();
        Arrays.sort(sorted);
        int mid = (n+1)/2-1;
        int end = n-1;
        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                arr[i] = sorted[mid--];
            }else{
                arr[i] = sorted[end--];
            }
        }
    }
}