class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int t:nums)
        {
            int tot=0;
            while(t>0)
            {
                tot+=(t%10);
                t/=10;
            }
            min=Math.min(min,tot);
        }
        return min;
    }
}