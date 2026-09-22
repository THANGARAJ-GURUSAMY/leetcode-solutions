class Solution {

    int k;
    int[][] tree;
    int[] prod;

    public int[] resultArray(int[] nums, int k, int[][] queries) {

        this.k = k;

        int n = nums.length;

        tree = new int[4 * n][k];
        prod = new int[4 * n];

        build(1, 0, n - 1, nums);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            update(1, 0, n - 1, index, value);

            int[] res = query(1, 0, n - 1, start, n - 1);

            ans[i] = res[x];
        }

        return ans;
    }

    void build(int node, int l, int r, int[] nums) {

        if (l == r) {

            int v = nums[l] % k;

            prod[node] = v;
            tree[node][v] = 1;

            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid, nums);
        build(node * 2 + 1, mid + 1, r, nums);

        merge(node);
    }

    void update(int node, int l, int r, int index, int value) {

        if (l == r) {

            int v = value % k;

            prod[node] = v;

            for (int i = 0; i < k; i++) {
                tree[node][i] = 0;
            }

            tree[node][v] = 1;

            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, r, index, value);
        }

        merge(node);
    }

    void merge(int node) {

        int left = node * 2;
        int right = node * 2 + 1;

        for (int i = 0; i < k; i++) {
            tree[node][i] = tree[left][i];
        }

        for (int i = 0; i < k; i++) {

            int rem = (prod[left] * i) % k;

            tree[node][rem] += tree[right][i];
        }

        prod[node] = (prod[left] * prod[right]) % k;
    }

    int[] query(int node, int l, int r, int ql, int qr) {

        if (ql <= l && r <= qr) {

            int[] res = new int[k];

            for (int i = 0; i < k; i++) {
                res[i] = tree[node][i];
            }

            return res;
        }

        int mid = (l + r) / 2;

        if (qr <= mid) {
            return query(node * 2, l, mid, ql, qr);
        }

        if (ql > mid) {
            return query(node * 2 + 1, mid + 1, r, ql, qr);
        }

        int[] left = query(node * 2, l, mid, ql, qr);
        int[] right = query(node * 2 + 1, mid + 1, r, ql, qr);

        /*
         * Need the product of the complete left result.
         */
        int leftProduct = getProduct(node, l, r, ql, mid);

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] += left[i];
        }

        for (int i = 0; i < k; i++) {

            int rem = (leftProduct * i) % k;

            res[rem] += right[i];
        }

        return res;
    }

    int getProduct(int node, int l, int r, int ql, int qr) {

        if (ql <= l && r <= qr) {
            return prod[node];
        }

        int mid = (l + r) / 2;

        if (qr <= mid) {
            return getProduct(node * 2, l, mid, ql, qr);
        }

        if (ql > mid) {
            return getProduct(node * 2 + 1, mid + 1, r, ql, qr);
        }

        int a = getProduct(node * 2, l, mid, ql, qr);
        int b = getProduct(node * 2 + 1, mid + 1, r, ql, qr);

        return (a * b) % k;
    }
}