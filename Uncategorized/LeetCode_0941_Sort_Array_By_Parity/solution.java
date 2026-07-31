class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            if(nums[left]%2 == 0){
                left++;
            }else if(nums[right]%2 != 0){
                right--;
            }else{
                nums[left] = nums[left] ^ nums[right];
                nums[right] = nums[right] ^ nums[left];
                nums[left] = nums[left] ^ nums[right];
                left++;
                right--;
            }
        }
        return nums;
    }
}

// class Solution {
//     public int[] sortArrayByParity(int[] arr) {
//         int n = arr.length;
//         int even = 0;
//         int odd = n-1;

//         while(even <=odd){
//             if(arr[even]%2!=0){
//                 int temp = arr[even];
//                 arr[even] = arr[odd];
//                 arr[odd] = temp;
//                 odd--;
//             }
//             else even++;
//         }
//         return arr;
//     }
// }
