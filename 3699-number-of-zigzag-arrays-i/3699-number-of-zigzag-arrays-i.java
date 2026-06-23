class Solution {
    private static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[] up = new long[m + 1];
        long[] down = new long[m + 1];

   
        for (int v = 1; v <= m; v++) {
            up[v] = v - 1;
            down[v] = m - v;
        }

        if (n == 2) {
            long ans = 0;
            for (int v = 1; v <= m; v++) {
                ans = (ans + up[v] + down[v]) % MOD;
            }
            return (int) ans;
        }

        for (int len = 3; len <= n; len++) {
            long[] prefDown = new long[m + 1];
            for (int i = 1; i <= m; i++) {
                prefDown[i] = (prefDown[i - 1] + down[i]) % MOD;
            }

            long[] suffUp = new long[m + 2];
            for (int i = m; i >= 1; i--) {
                suffUp[i] = (suffUp[i + 1] + up[i]) % MOD;
            }

            long[] nextUp = new long[m + 1];
            long[] nextDown = new long[m + 1];

            for (int v = 1; v <= m; v++) {
                nextUp[v] = prefDown[v - 1];
                nextDown[v] = suffUp[v + 1];
            }

            up = nextUp;
            down = nextDown;
        }

        long ans = 0;
        for (int v = 1; v <= m; v++) {
            ans = (ans + up[v] + down[v]) % MOD;
        }

        return (int) ans;
    }
}