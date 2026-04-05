class Solution {
    public int lengthOfLastWord(String s) {
        int tot=0;
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(res.length()>=1&&s.charAt(i)==' ')
            {
                break;
            }
            else if(s.charAt(i)!=' ')
            {
                res+=s.charAt(i);
                tot+=1;
            }
        }
        return tot;
    }
}