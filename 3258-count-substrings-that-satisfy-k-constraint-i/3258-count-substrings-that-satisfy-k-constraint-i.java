class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            String res="";
            for(int j=i;j<s.length();j++)
            {
                res+=s.charAt(j);
                long num=Long.parseLong(res,2);
                int c=Long.bitCount(num);
                int rem=res.length()-c;
                if(c<=k||rem<=k)
                {
                    count++;
                }
            }
            
        }
        return count;
    }
}