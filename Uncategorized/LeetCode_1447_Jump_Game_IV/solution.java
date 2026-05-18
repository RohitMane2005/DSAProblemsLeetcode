import java.util.*;

class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0;

        // value -> list of indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        visited[0] = true;

        int steps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int s = 0; s < size; s++) {

                int curr = q.poll();

                // reached end
                if (curr == n - 1) {
                    return steps;
                }