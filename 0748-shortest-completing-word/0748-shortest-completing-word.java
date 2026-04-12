class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {     
        String res="";
        for(char c:licensePlate.toCharArray())
        {
            if(Character.isLetter(c))
            {
                res+=Character.toLowerCase(c);
            }
        }
        String ans="";
        int n=res.length();
        for(String m:words)
        {
            String temp=m.toLowerCase();
            String copy=temp;
            int c=0;
            for(int i=0;i<n;i++)
            {
                String m1=String.valueOf(res.charAt(i));
                if(copy.contains(m1))
                {
                    c++;
                    copy=copy.replaceFirst(m1,"");
                }

            }
            if(c==n)
            {
                if(ans.equals("")||m.length()<ans.length())
                {
                    ans=m;
                }
            }
        }
        return ans;
        
    }
}