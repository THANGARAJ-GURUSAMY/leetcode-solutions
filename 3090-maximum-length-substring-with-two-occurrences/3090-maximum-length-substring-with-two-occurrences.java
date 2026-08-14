class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            int[] freq=new int[26];
            String res="";
            for(int j=i;j<s.length();j++)
            {
                char c=s.charAt(j);
                int idx=c-'a';
                if(freq[idx]<2)
                {
                    res+=c;
                    freq[idx]++;
                }
                else
                {
                    break;
                }
            }
            max=Math.max(res.length(),max);
        }
        return max;

    }
}