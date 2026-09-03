class Solution {
    public int majorityElement(int[] nums) {
        int ca=0;
        int c=0;
        for(int t:nums)
        {
            if(c==0)
            {
                ca=t;
            }
            if(ca==t)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return ca;
    }
}