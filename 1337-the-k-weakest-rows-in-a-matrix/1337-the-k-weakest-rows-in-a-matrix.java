class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,List<Integer>> m=new TreeMap<>();
        for(int i=0;i<mat.length;i++)
        {
            int n=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    n++;
                }
            }
            if(!m.containsKey(n))
            {
                m.put(n,new ArrayList<>());
            }
            m.get(n).add(i);
        }
        int[] ans=new int[k];
        int idx=0;
        for(int k1:m.keySet())
        {
            List<Integer> m1=m.get(k1);
            if(idx==k)
            {
                break;
            }
            for(int t:m1)
            {
               ans[idx++]=t;
               if(idx==k)
               {
                break;
               }
            }
        }
        return ans;
    }
}