
import java.util.*;

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        List<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

 
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }

        int[] newParent = parent.clone();


        int[] last = new int[26];
        Arrays.fill(last, -1);

        dfs(0, adj, s, last, newParent);

        List<Integer>[] tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[newParent[i]].add(i);
        }

        int[] ans = new int[n];

        calculateSize(0, tree, ans);

        return ans;
    }

    void dfs(int node, List<Integer>[] adj, String s,
             int[] last, int[] newParent) {

        int c = s.charAt(node) - 'a';

        int previous = last[c];

        if (node != 0 && previous != -1) {
            newParent[node] = previous;
        }

        last[c] = node;

        for (int child : adj[node]) {
            dfs(child, adj, s, last, newParent);
        }

        last[c] = previous;
    }

    int calculateSize(int node, List<Integer>[] tree, int[] ans) {
        ans[node] = 1;

        for (int child : tree[node]) {
            ans[node] += calculateSize(child, tree, ans);
        }

        return ans[node];
    }
}
