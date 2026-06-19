class Solution {
    public int minimumRecolors(String blocks, int k) {
        int max=0;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            String m=blocks.substring(i,i+k);
            int c=0;
            for(int j=0;j<k;j++)
            {
                if(m.charAt(j)=='B')
                {
                    c++;
                }
            }
            max=Math.max(max,c);
        }
        return k-max;
    }
}