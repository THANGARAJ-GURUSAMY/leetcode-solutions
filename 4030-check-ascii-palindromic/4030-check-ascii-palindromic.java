class Solution {
    public boolean isPalindromic(String s) {
        String m="";
        for(char c:s.toCharArray())
        {
            int num=c;
            String m1=Integer.toBinaryString(num);
            while(m1.length()<8)
            {
                m1="0"+m1;
            }
            m+=m1;
        }
        int l=0;
        int r=m.length()-1;
        while(l<r)
        {
            if(m.charAt(l)!=m.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}