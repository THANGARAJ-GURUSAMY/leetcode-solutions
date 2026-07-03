class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
       int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        int maxCost = 0;
        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            maxCost = Math.max(maxCost, e[2]);
        }

        int left = 0, right = maxCost, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (can(mid, graph, online, k, n)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean can(int minEdge, List<int[]>[] graph, boolean[] online, long k, int n) {
        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;

        // Topological sort
        int[] indegree = new int[n];
        List<int[]>[] filtered = new ArrayList[n];
        for (int i = 0; i < n; i++) filtered[i] = new ArrayList<>();

        for (int u = 0; u < n; u++) {
            if (!online[u]) continue;

            for (int[] e : graph[u]) {
                int v = e[0], cost = e[1];

                if (cost >= minEdge && online[v]) {
                    filtered[u].add(e);
                    indegree[v]++;
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0 && online[i]) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int[] e : filtered[u]) {
                int v = e[0], cost = e[1];

                if (dp[u] != Long.MAX_VALUE) {
                    dp[v] = Math.min(dp[v], dp[u] + cost);
                }

                if (--indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        return dp[n - 1] <= k; 
    }
}