class Solution {
    public int minimumCost(int[] cost) {
        List<Integer> l=new ArrayList<>();
        for(int t:cost)
        {
            l.add(t);
        }
        Collections.sort(l,Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<l.size();i++)
        {
            if((i+1)%3!=0)
            {
                ans+=l.get(i);
            }
        }
        return ans;
    }
}