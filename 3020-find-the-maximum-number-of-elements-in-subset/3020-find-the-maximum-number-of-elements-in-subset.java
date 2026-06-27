import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        for (long x : freq.keySet()) {
            if (x == 1) {
                int count = freq.get(1L);
                if (count % 2 == 0) count--; 
                ans = Math.max(ans, count);
                continue;
            }

            long curr = x;
            int length = 0;

            while (freq.containsKey(curr)) {
                int f = freq.get(curr);

                if (f >= 2) {
                    length += 2;
                } else {
                    length += 1;
                    break;
                }

                curr = curr * curr;

                if (curr > 1e18) break; 
            }

            if (length % 2 == 0) length--; 

            ans = Math.max(ans, length);
        }

        return ans;
    }
}