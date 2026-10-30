
import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();

        for (int[] e : edges)
            adj[e[0]].add(new int[]{e[1], e[2]});

        int[][] dist = new int[n][k + 1];

        for (int[] d : dist)
            Arrays.fill(d, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[2], b[2])
        );

        dist[0][1] = 0;
        pq.offer(new int[]{0, 1, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();

            int u = cur[0];
            int count = cur[1];
            int cost = cur[2];

            if (cost != dist[u][count])
                continue;

            if (u == n - 1)
                return cost;

            for (int[] e : adj[u]) {
                int v = e[0];
                int w = e[1];

                int next = labels.charAt(u) == labels.charAt(v)
                    ? count + 1 : 1;

                if (next > k)
                    continue;

                if (cost + w < dist[v][next]) {
                    dist[v][next] = cost + w;
                    pq.offer(new int[]{v, next, cost + w});
                }
            }
        }

        return -1;
    }
}
