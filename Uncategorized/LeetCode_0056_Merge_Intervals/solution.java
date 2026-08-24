
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
        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= currentEnd) { 
                // Overlap detected: Update the end of the current interval
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap: Move to the next interval and add it to the list
                currentInterval = intervals[i];
                result.add(currentInterval);
            }
        }

        // Convert the list back to a 2D array
        return result.toArray(new int[result.size()][]);
    }
}