class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int t:nums)
        {
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int max=0;
        for(int t:nums)
        {
            if(map.containsKey(t+1))
            {
                int n=map.get(t)+map.get(t+1);
                max=Math.max(max,n);
            }
        }
        return max;
    }
}