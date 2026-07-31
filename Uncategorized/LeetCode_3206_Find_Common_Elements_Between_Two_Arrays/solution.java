class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] exists1 = new boolean[101];
        boolean[] exists2 = new boolean[101];

        for (int x : nums1) exists1[x] = true;
        for (int x : nums2) exists2[x] = true;

        int count1 = 0, count2 = 0;
