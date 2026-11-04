
import java.util.*;

class Solution {

    class Fenwick {
        int n;
        int[] count;
        long[] sum;

        Fenwick(int n) {
            this.n = n;
            count = new int[n + 1];
            sum = new long[n + 1];
        }

        void update(int i, int val, int c) {
            while (i <= n) {
                count[i] += c;
                sum[i] += (long) val * c;
                i += i & -i;
            }
        }

        int queryCount(int i) {
            int ans = 0;
            while (i > 0) {
                ans += count[i];
                i -= i & -i;
            }
            return ans;
        }

        long querySum(int i) {
            long ans = 0;
            while (i > 0) {
                ans += sum[i];
                i -= i & -i;
            }
            return ans;
        }

        int findKth(int k) {
            int idx = 0;

            for (int bit = Integer.highestOneBit(n);
                 bit > 0; bit >>= 1) {

                int next = idx + bit;

                if (next <= n && count[next] < k) {
                    idx = next;
                    k -= count[next];
                }
            }

            return idx + 1;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int[] unique = Arrays.stream(sorted)
                .distinct()
                .toArray();

        int m = unique.length;

        int[] compressed = new int[n];

        for (int i = 0; i < n; i++) {
            compressed[i] = Arrays.binarySearch(unique, nums[i]) + 1;
        }

        Fenwick bit = new Fenwick(m);

        long[] cost = new long[n - x + 1];

       
        for (int i = 0; i < x; i++) {
            bit.update(compressed[i], nums[i], 1);
        }

        for (int i = 0; i <= n - x; i++) {

            int medianIndex = bit.findKth((x + 1) / 2);
            long median = unique[medianIndex - 1];

            int leftCount = bit.queryCount(medianIndex);
            long leftSum = bit.querySum(medianIndex);

            long totalSum = bit.querySum(m);
            int rightCount = x - leftCount;
            long rightSum = totalSum - leftSum;

            cost[i] = median * leftCount - leftSum
                    + rightSum - median * rightCount;


            if (i < n - x) {
                bit.update(compressed[i], nums[i], -1);
                bit.update(compressed[i + x], nums[i + x], 1);
            }
        }

 
        long INF = Long.MAX_VALUE / 4;

        long[] prev = new long[n + 1];
        long[] curr = new long[n + 1];

        for (int j = 1; j <= k; j++) {

            Arrays.fill(curr, INF);

            for (int i = 1; i <= n; i++) {

                curr[i] = curr[i - 1];

       
                if (i >= x && prev[i - x] != INF) {

                    curr[i] = Math.min(
                        curr[i],
                        prev[i - x] + cost[i - x]
                    );
                }
            }

            long[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}
