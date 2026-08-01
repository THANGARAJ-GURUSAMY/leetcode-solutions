class Solution {
    public int lengthOfLongestSubstring(String s) {
        int c=0;
        int max=0;
        String res="";
        for(char c1:s.toCharArray())
        {
            String m=String.valueOf(c1);
            if(!res.contains(m))
            {
                res+=m;
                c++;
            }
            else
            {
                max=Math.max(max,c);
                res=res.substring(res.indexOf(c1)+1);
                res+=c1;
                c=res.length();
            }
        }
        max=Math.max(max,c);
        return max;
        
    }
}