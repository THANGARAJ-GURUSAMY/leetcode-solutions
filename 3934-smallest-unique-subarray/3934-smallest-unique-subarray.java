
import java.util.*;

class Solution {
    private int[] nums;
    private long base = 19;
    private long modulo = 1000000007L;
    private long[] powers;
    private Map<Long, Integer> hashValues;

    public int smallestUniqueSubarray(int[] nums) {
        this.nums = nums;

        int n = nums.length;

        powers = new long[n + 1];
        powers[0] = 1;

        for (int i = 1; i <= n; i++) {
            powers[i] = (powers[i - 1] * base) % modulo;
        }

        hashValues = new HashMap<>();

        int low = 1;
        int high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (checkUniqueness(mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean checkUniqueness(int len) {
        int n = nums.length;

        hashValues.clear();

        long hash = 0;

        for (int i = 0; i < len; i++) {
            hash = (hash * base + nums[i]) % modulo;
        }

        hashValues.put(hash, 1);

        for (int i = 1; i <= n - len; i++) {

            long left = (powers[len - 1] * nums[i - 1]) % modulo;

            hash = ((hash - left) % modulo + modulo) % modulo;

            hash = (hash * base + nums[i + len - 1]) % modulo;

            hashValues.put(hash,
                hashValues.getOrDefault(hash, 0) + 1);
        }

        for (int count : hashValues.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }
}
