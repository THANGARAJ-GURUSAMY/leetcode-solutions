class Solution {
    public int minimumChairs(String s) {
        int ans=0;
        int curr=0;
        for(char c:s.toCharArray())
        {
            if(c=='E')
            {
                curr++;
                ans=Math.max(ans,curr);
            }
            else
            {
                curr--;
            }
        }
        return ans;
    }
}