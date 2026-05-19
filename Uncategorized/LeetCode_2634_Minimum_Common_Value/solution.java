class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int num : nums1){
            if(binearySearch(nums2,num)){
                return num;
            }
        }
        return -1;
    }

    public boolean binearySearch(int arr[], int num){
        int left = 0;
        int right = arr.length-1;