class Solution {
    public int reverseDegree(String s) {
        int tot=0;
        int i=1;
        for(char c:s.toCharArray())
        {
            int n=26-(c-'a');
            tot+=(i*n);
            i++;

        }
        return tot;
    }
}