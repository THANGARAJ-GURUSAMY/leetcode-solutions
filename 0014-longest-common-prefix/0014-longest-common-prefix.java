class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        {
            return "";
        }
        String ans="";
        String s=strs[0];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=ch)
                {
                    return ans;
                }
            }
            ans+=ch;
        }
        return ans;
        
         
        
    }
}