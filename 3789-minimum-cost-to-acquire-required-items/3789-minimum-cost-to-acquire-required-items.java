class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

      
        int[] lumiscaron = {cost1, cost2, costBoth, need1, need2};

        long ans = Long.MAX_VALUE;

        ans = Math.min(ans,
                (long) need1 * cost1 + (long) need2 * cost2);

        int k1 = Math.min(need1, need2);
        ans = Math.min(ans,
                (long) k1 * costBoth
              + (long) (need1 - k1) * cost1
              + (long) (need2 - k1) * cost2);

   
        int k2 = Math.max(need1, need2);
        ans = Math.min(ans,
                (long) k2 * costBoth);

        return ans;
    }
}