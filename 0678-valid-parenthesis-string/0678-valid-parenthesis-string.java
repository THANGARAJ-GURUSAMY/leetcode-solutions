class Solution {
    public boolean checkValidString(String s) {
        int left=0;
        int star=0;
        int right=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                left++;
            }
            else if(c==')')
            {
                right++;
            }
            else
            {
                star++;
            }
            if(right>left+star)
            {
                return false;
            }
        }
        left=0;
        star=0;
        right=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                left++;
            }
            else if(c==')')
            {
                right++;
            }
            else
            {
                star++;
            }
            if(left>right+star)
            {
                return false;
            }
        }
        return true;
        
    }
}