import java.util.*;

class Solution {

    class FenwickTree {
        int[] tree;

        FenwickTree(int n) {
            tree = new int[n + 1];
        }

        void update(int i, int val) {
            while (i < tree.length) {
                tree[i] = Math.max(tree[i], val);
                i += i & -i;
            }
        }

        int query(int i) {
            int res = 0;
            while (i > 0) {
                res = Math.max(res, tree[i]);
                i -= i & -i;
            }
            return res;
        }
    }

    public List<Boolean> getResults(int[][] queries) {
        int limit = Math.min(50000, queries.length * 3);

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        obstacles.add(limit);

        for (int[] q : queries) {
            if (q[0] == 1) {
                obstacles.add(q[1]);
            }
        }

        FenwickTree bit = new FenwickTree(limit + 2);

        Integer prev = null;
        for (int pos : obstacles) {
            if (prev != null) {
                bit.update(pos, pos - prev);
            }
            prev = pos;
        }

        List<Boolean> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {
            int[] q = queries[i];

            if (q[0] == 1) {
                int x = q[1];

                Integer next = obstacles.higher(x);
                Integer left = obstacles.lower(x);

                if (next != null) {
                    bit.update(next, next - left);
                }

                obstacles.remove(x);

            } else {
                int x = q[1];
                int sz = q[2];

                Integer firstGreater = obstacles.higher(x);
                int prevObstacle;

                if (firstGreater == null) {
                    prevObstacle = obstacles.last();
                } else {
                    prevObstacle = obstacles.lower(firstGreater);
                }

                boolean ok =
                        bit.query(prevObstacle) >= sz ||
                        (x - prevObstacle) >= sz;

                ans.add(ok);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}