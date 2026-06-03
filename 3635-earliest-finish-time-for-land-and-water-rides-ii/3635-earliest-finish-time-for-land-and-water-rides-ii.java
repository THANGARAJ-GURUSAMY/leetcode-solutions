class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        long ans = Long.MAX_VALUE;

      
        ans = Math.min(ans, solve(
                landStartTime, landDuration,
                waterStartTime, waterDuration));


        ans = Math.min(ans, solve(
                waterStartTime, waterDuration,
                landStartTime, landDuration));

        return (int) ans;
    }

    private long solve(int[] firstStart, int[] firstDur,
                       int[] secondStart, int[] secondDur) {

        int m = secondStart.length;

        int[][] rides = new int[m][2];
        for (int i = 0; i < m; i++) {
            rides[i][0] = secondStart[i];
            rides[i][1] = secondDur[i];
        }

        java.util.Arrays.sort(rides, (a, b) -> Integer.compare(a[0], b[0]));

        int[] starts = new int[m];
        long[] prefixMinDur = new long[m];
        long[] suffixMinOpenFinish = new long[m];

        for (int i = 0; i < m; i++) {
            starts[i] = rides[i][0];
        }

        prefixMinDur[0] = rides[0][1];
        for (int i = 1; i < m; i++) {
            prefixMinDur[i] = Math.min(prefixMinDur[i - 1], rides[i][1]);
        }

        suffixMinOpenFinish[m - 1] =
                (long) rides[m - 1][0] + rides[m - 1][1];

        for (int i = m - 2; i >= 0; i--) {
            suffixMinOpenFinish[i] = Math.min(
                    suffixMinOpenFinish[i + 1],
                    (long) rides[i][0] + rides[i][1]
            );
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < firstStart.length; i++) {

            long endTime = (long) firstStart[i] + firstDur[i];

            int idx = upperBound(starts, (int) endTime) - 1;

            if (idx >= 0) {
                ans = Math.min(ans, endTime + prefixMinDur[idx]);
            }

            if (idx + 1 < m) {
                ans = Math.min(ans, suffixMinOpenFinish[idx + 1]);
            }
        }

        return ans;
    }

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}