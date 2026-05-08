class Solution {
    public int hIndex(int[] citations) {
        int num=0;
        for(int i=0;i<citations.length;i++)
        {
            int c=0;
            for(int j=0;j<citations.length;j++)
            {
                if(citations[i]<=citations[j])
                {
                    c++;
                }
            }
            int cu=Math.min(c,citations[i]);
            if(cu>num)
            {
                num=cu;
            }

        }
        return num;
    }
}