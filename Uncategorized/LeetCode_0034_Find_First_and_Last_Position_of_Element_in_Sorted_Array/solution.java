class Solution {

    public int[] searchRange(int[] nums, int target) {
       int first = firstOcc(nums,target);
       int last = lastOcc(nums,target);
       return new int[]{first, last};
    }

    private int firstOcc(int arr[], int target){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while(left <= right ){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                ans = mid;
                right = mid -1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return ans;
    }

    private int lastOcc(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while(left <= right ){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                ans = mid;
                left  = mid + 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return ans;
    }



}
