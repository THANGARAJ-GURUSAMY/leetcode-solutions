class Solution {
    public static int gcd(int n1, int n2) {
        while (n2 != 0) {
            int t = n1 % n2;
            n1 = n2;
            n2 = t;
        }
        return n1;
    }

    public long maxPairStrength(int[] nums) {
        long ans = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int g = gcd(nums[i], nums[j]);

                long num = (long) nums[i] * nums[j];
                long den = (long) g * g;

                long value = num / den;

                ans = Math.max(ans, value);
            }
        }

        return ans;
    }
}