class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int sec =Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int currentEle = nums[i];
        
            if(first >= currentEle){
                first = currentEle;
            }else if(sec >= currentEle){
                sec = currentEle;
            }else{
                third = currentEle;
                return true;
            }
        }
        return false;
    }
}