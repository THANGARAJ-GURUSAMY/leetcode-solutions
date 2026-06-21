class Solution {
    public boolean scoreBalance(String s) {
        for(int i=0;i<s.length();i++)
        {
            String m1=s.substring(0,i+1);
            String m2=s.substring(i+1);
            int tot1=0;
            for(char c:m1.toCharArray())
            {
                tot1+=((c-'a')+1);
            }
            int tot2=0;
            for(char c:m2.toCharArray())
            {
                tot2+=((c-'a')+1);
            }
            if(tot1==tot2)
            {
                return true;
            }
        }
        return false;
    }
}