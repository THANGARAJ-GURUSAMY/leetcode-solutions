class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<stones.length;i++)
        {
            l.add(stones[i]);
        }
        int m=0;
        while(l.size()>1)
        {
            Collections.sort(l);
            int last=l.size()-1;
            int n1=l.get(last);
            int n2=l.get(last-1);
            m=Math.abs(n1-n2);
            l.remove(last);
            l.remove(last-1);
            l.add(m);
        }
        if(l.size()>0)
        {
            return l.get(0);

        }
        return 0;
    }
}