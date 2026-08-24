
class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Edge case check
        if (intervals.length <= 1) {
            return intervals;
        }

        // 2. Sort the intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        
        // Start with the first interval
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        // 3. Iterate through the rest of the intervals and merge if they overlap