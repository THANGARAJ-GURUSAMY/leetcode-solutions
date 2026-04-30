class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][k + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    dp[i][j][c] = -1;
                }
            }
        }

        dp[0][0][0] = 0;

        int[][] dirs = {{1, 0}, {0, 1}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    if (dp[i][j][c] == -1) continue;

                    for (int[] d : dirs) {
                        int ni = i + d[0];
                        int nj = j + d[1];

                        if (ni < m && nj < n) {
                            int val = grid[ni][nj];

                            int cost = (val == 0) ? 0 : 1;
                            int score = val;

                            int newCost = c + cost;

                            if (newCost <= k) {
                                dp[ni][nj][newCost] = Math.max(
                                    dp[ni][nj][newCost],
                                    dp[i][j][c] + score
                                );
                            }
                        }
                    }
                }
            }
        }

        int ans = -1;
        for (int c = 0; c <= k; c++) {
            ans = Math.max(ans, dp[m - 1][n - 1][c]);
        }

        return ans;
    }
}