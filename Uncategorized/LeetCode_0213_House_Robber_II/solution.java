class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int n = nums.length;
       return Math.max(robbHouse(nums,0,n-2),robbHouse(nums,1,n-1));

    }


    private int robbHouse(int[] nums,int start, int end){
       int first = 0;
       int second = 0;
        
        for(int i = start; i<= end; i++){
            int current = Math.max(nums[i]+first,second);
            first = second;
            second = current;
        }
        return second;
    }
}