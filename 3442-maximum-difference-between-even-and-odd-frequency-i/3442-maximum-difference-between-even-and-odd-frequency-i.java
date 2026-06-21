class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max1=0;
        int max2=Integer.MAX_VALUE;
        for(char c:map.keySet())
        {
            int num=map.get(c);
            if(num%2==1)
            {
                max1=Math.max(max1,num);
            }
            else
            {
                max2=Math.min(max2,num);
            }
        }
        return max1-max2;
    }
}