class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int t:nums)
        {
            m.put(t,m.getOrDefault(t,0)+1);
        }
        int c=0;
        for(int k:m.keySet())
        {
            int n=m.get(k);
            if(n==3)
            {
                int i1=-1,i2=-1,i3=-1;
                for(int i=0;i<nums.length;i++)
                {
                    if(k==nums[i])
                    {
                        if(i1==-1)
                        {
                            i1=i;
                        }
                        else if(i2==-1)
                        {
                            i2=i;
                        }
                        else
                        {
                            i3=i;
                        }
                    }
                }
                if(i2-i1==i3-i2)
                {
                    c++;
                }
            }
        }
        return c;
    }
}