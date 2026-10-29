
import java.util.*;

class Solution {
    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        List<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        int LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        int[] tin = new int[n];
        int[] tout = new int[n];
        int[] depth = new int[n];
        int[] parent = new int[n];
        int[][] up = new int[LOG][n];
        char[] chars = s.toCharArray();

        // Iterative DFS with entry and exit timestamps
        int[] stack = new int[n];
        int[] next = new int[n];
        Arrays.fill(parent, -1);

        int top = 0;
        int timer = 0;
        stack[0] = 0;
        parent[0] = 0;
        tin[0] = timer++;

        while (top >= 0) {
            int u = stack[top];

            if (next[u] < adj[u].size()) {
                int v = adj[u].get(next[u]++);

                if (v == parent[u]) {
                    continue;
                }

                parent[v] = u;
                depth[v] = depth[u] + 1;
                tin[v] = timer++;
                stack[++top] = v;
            } else {
                tout[u] = timer++;
                top--;
            }
        }

        for (int i = 0; i < n; i++) {
            up[0][i] = parent[i];
        }

        for (int k = 1; k < LOG; k++) {
            for (int i = 0; i < n; i++) {
                up[k][i] = up[k - 1][up[k - 1][i]];
            }
        }

        // Fenwick tree over entry/exit events
        int[] bit = new int[2 * n + 1];

        for (int i = 0; i < n; i++) {
            int mask = 1 << (chars[i] - 'a');
            update(bit, tin[i], mask);
            update(bit, tout[i], mask);
        }

        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            String[] p = q.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                if (chars[u] != c) {
                    int delta = (1 << (chars[u] - 'a'))
                              ^ (1 << (c - 'a'));

                    update(bit, tin[u], delta);
                    update(bit, tout[u], delta);

                    chars[u] = c;
                }
            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int l = lca(u, v, depth, up, LOG);

                int mask = prefix(bit, tin[u] + 1)
                         ^ prefix(bit, tin[v] + 1)
                         ^ (1 << (chars[l] - 'a'));

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }

    private void update(int[] bit, int index, int mask) {
        index++;

        while (index < bit.length) {
            bit[index] ^= mask;
            index += index & -index;
        }
    }

    private int prefix(int[] bit, int index) {
        int mask = 0;

        while (index > 0) {
            mask ^= bit[index];
            index -= index & -index;
        }

        return mask;
    }

    private int lca(int u, int v, int[] depth, int[][] up, int LOG) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int k = 0; k < LOG; k++) {
            if ((diff & (1 << k)) != 0) {
                u = up[k][u];
            }
        }

        if (u == v) {
            return u;
        }

        for (int k = LOG - 1; k >= 0; k--) {
            if (up[k][u] != up[k][v]) {
                u = up[k][u];
                v = up[k][v];
            }
        }

        return up[0][u];
    }
}
