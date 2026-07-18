class Solution {
    public int findGCD(int[] nums) {
        int s=Integer.MAX_VALUE;
        int m=Integer.MIN_VALUE;
        for(int t:nums)
        {
            s=Math.min(s,t);
            m=Math.max(m,t);
        }
        while(m!=0)
        {
            int t1=s%m;
            s=m;
            m=t1;
        }
        return s;
    }
}