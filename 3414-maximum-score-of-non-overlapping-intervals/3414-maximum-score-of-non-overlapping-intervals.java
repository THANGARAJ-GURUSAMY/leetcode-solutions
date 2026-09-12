import java.util.*;

class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        // Store: [left, right, weight, originalIndex]
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }

        // Sort by ending position
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);
            return Integer.compare(a[3], b[3]);
        });

        // dp[k][i] = best score using at most k intervals
        long[][] dp = new long[5][n + 1];

        // Store selected indices
        List<Integer>[][] path = new ArrayList[5][n + 1];

        for (int k = 0; k <= 4; k++) {
            for (int i = 0; i <= n; i++) {
                path[k][i] = new ArrayList<>();
            }
        }

        for (int i = 1; i <= n; i++) {

            int left = arr[i - 1][0];

            // Find last interval whose right < current left
            int p = find(arr, i - 1, left);

            for (int k = 1; k <= 4; k++) {

                // Don't choose current interval
                dp[k][i] = dp[k][i - 1];
                path[k][i] = new ArrayList<>(path[k][i - 1]);

                // Choose current interval
                long score = dp[k - 1][p + 1] + arr[i - 1][2];

                List<Integer> temp =
                    new ArrayList<>(path[k - 1][p + 1]);

                temp.add(arr[i - 1][3]);

                Collections.sort(temp);

                if (score > dp[k][i] ||
                    (score == dp[k][i] && compare(temp, path[k][i]) < 0)) {

                    dp[k][i] = score;
                    path[k][i] = temp;
                }
            }
        }

        return path[4][n].stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // Find last interval with right < left
    private int find(int[][] arr, int end, int left) {

        int l = 0;
        int r = end - 1;
        int ans = -1;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (arr[mid][1] < left) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return ans;
    }

    // Lexicographical comparison
    private int compare(List<Integer> a, List<Integer> b) {

        int n = Math.min(a.size(), b.size());

        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(b.get(i)))
                return Integer.compare(a.get(i), b.get(i));
        }

        return Integer.compare(a.size(), b.size());
    }
}