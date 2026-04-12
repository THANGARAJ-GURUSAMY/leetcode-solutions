class Solution {
    int[][] dp;

    public int minimumDistance(String word) {
        int n = word.length();
        dp = new int[n][27]; 

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(word, 0, 26); 
    }

    private int solve(String word, int index, int otherFinger) {
        if (index == word.length()) return 0;

        if (dp[index][otherFinger] != -1) {
            return dp[index][otherFinger];
        }

        int curr = word.charAt(index) - 'A';

        
        int useFirst = distance(index == 0 ? 26 : word.charAt(index - 1) - 'A', curr)
                + solve(word, index + 1, otherFinger);

       
        int useSecond = distance(otherFinger, curr)
                + solve(word, index + 1, index == 0 ? 26 : word.charAt(index - 1) - 'A');

        return dp[index][otherFinger] = Math.min(useFirst, useSecond);
    }

    private int distance(int a, int b) {
        if (a == 26) return 0;

        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;

        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}