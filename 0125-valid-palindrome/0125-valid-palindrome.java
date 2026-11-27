class Solution {
    public boolean isPalindrome(String s) {
        String m="";
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                m+=Character.toLowerCase(c);
            }
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