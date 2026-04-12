class Solution {
    public int[] numberOfLines(int[] widths, String s) {
       int tot=0;
       int c1=0;
       for(char c:s.toCharArray())
       {
           int n=c-'a';
           if(tot<=100)
           {
            tot+=widths[n];
            if(tot>100)
            {
                c1++;
                tot=0;
                tot+=widths[n];
            }
           }

           
       }
       return new int[]{c1+1,tot};


    }
}