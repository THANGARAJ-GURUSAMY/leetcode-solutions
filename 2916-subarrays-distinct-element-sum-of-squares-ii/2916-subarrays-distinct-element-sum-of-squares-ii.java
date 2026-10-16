
class Solution {
    static final int MOD = 1_000_000_007;

    class SegmentTree {
        long[] sum;
        long[] squareSum;
        long[] lazy;
        int n;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            squareSum = new long[4 * n];
            lazy = new long[4 * n];
        }

        void apply(int node, int left, int right, long value) {
            long len = right - left + 1L;

            squareSum[node] = (
                squareSum[node]
                + 2L * value % MOD * sum[node] % MOD
                + len % MOD * value % MOD * value % MOD
            ) % MOD;

            sum[node] = (sum[node] + len * value) % MOD;
            lazy[node] = (lazy[node] + value) % MOD;
        }

        void push(int node, int left, int right) {
            if (lazy[node] == 0 || left == right) {
                return;
            }

            int mid = (left + right) / 2;

            apply(node * 2, left, mid, lazy[node]);
            apply(node * 2 + 1, mid + 1, right, lazy[node]);

            lazy[node] = 0;
        }

        void update(int node, int left, int right,
                    int ql, int qr, long value) {
            if (ql > right || qr < left) {
                return;
            }

            if (ql <= left && right <= qr) {
                apply(node, left, right, value);
                return;
            }

            push(node, left, right);

            int mid = (left + right) / 2;

            update(node * 2, left, mid, ql, qr, value);
            update(node * 2 + 1, mid + 1, right, ql, qr, value);

            sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
            squareSum[node] = (
                squareSum[node * 2] + squareSum[node * 2 + 1]
            ) % MOD;
        }

        long querySum(int node, int left, int right,
                      int ql, int qr) {
            if (ql > right || qr < left) {
                return 0;
            }

            if (ql <= left && right <= qr) {
                return squareSum[node];
            }

            push(node, left, right);

            int mid = (left + right) / 2;

            return (
                querySum(node * 2, left, mid, ql, qr)
                + querySum(node * 2 + 1, mid + 1, right, ql, qr)
            ) % MOD;
        }

        long queryAll() {
            return squareSum[1];
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        int[] last = new int[100001];

        SegmentTree tree = new SegmentTree(n);

        long answer = 0;

        for (int i = 0; i < n; i++) {
            int previous = last[nums[i]];

            tree.update(1, 0, n - 1, previous, i, 1);

            last[nums[i]] = i + 1;

            answer = (answer + tree.querySum(1, 0, n - 1, 0, i)) % MOD;
        }

        return (int) answer;
    }
}
