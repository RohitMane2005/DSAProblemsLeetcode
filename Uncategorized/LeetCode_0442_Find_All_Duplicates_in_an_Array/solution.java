class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int right = nums[i] - 1;

            if(nums[i] != nums[right]){
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
            }else{