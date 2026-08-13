class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new TreeSet<>();
        for(int t:nums)
        {
            set.add(t);
        }
        List<Integer> l=new ArrayList<>();
        int num=1;
        for(int t:set)
        {
            if(num!=t)
            {
                while(num!=t)
                {
                    l.add(num);
                    num++;
                }
            }
            num++;
        }
        while(num<=n)
        {
            l.add(num);
            num++;
        }
        return l;
    }
}