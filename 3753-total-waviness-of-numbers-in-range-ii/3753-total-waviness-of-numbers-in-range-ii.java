import java.util.*;

public class Solution {

    static class Pair {
        long waviness, count;
        Pair(long w, long c) {
            waviness = w;
            count = c;
        }
    }

    Map<String, Pair> memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long num) {
        if (num < 0) return 0;
        String s = Long.toString(num);
        memo = new HashMap<>();
        return dfs(s, 0, -1, -1, true, false).waviness;
    }

    private Pair dfs(String s, int pos, int prevPrev, int prev, boolean tight, boolean started) {
        if (pos == s.length()) {
            return new Pair(0, started ? 1 : 0);
        }

        String key = pos + "," + prevPrev + "," + prev + "," + tight + "," + started;
        if (!tight && memo.containsKey(key)) return memo.get(key);

        int limit = tight ? s.charAt(pos) - '0' : 9;

        long totalWaviness = 0;
        long totalCount = 0;

        for (int d = 0; d <= limit; d++) {
            boolean newTight = tight && (d == limit);
            boolean newStarted = started || d != 0;

            int newPrevPrev = prev;
            int newPrev = d;

            Pair next = dfs(s, pos + 1,
                            newStarted ? newPrevPrev : -1,
                            newStarted ? newPrev : -1,
                            newTight,
                            newStarted);

            long add = next.waviness;

          
            if (newStarted && prevPrev != -1 && prev != -1) {
                if ((prev > prevPrev && prev > d) ||
                    (prev < prevPrev && prev < d)) {
                    add += next.count;
                }
            }

            totalWaviness += add;
            totalCount += next.count;
        }

        Pair res = new Pair(totalWaviness, totalCount);
        if (!tight) memo.put(key, res);
        return res;
    }
}