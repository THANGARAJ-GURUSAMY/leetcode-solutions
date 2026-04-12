class Solution {
    public boolean backspaceCompare(String s, String t) {
       StringBuilder sb=new StringBuilder(s);
       sb.reverse();
       String m1=sb.toString();
       StringBuilder sb2=new StringBuilder(t);
       sb2.reverse();
       String m2=sb2.toString();
       String res1="";
       String res2="";
       int i=0,skip=0;
       while(i<m1.length())
       {
          char c=m1.charAt(i);
          if(c=='#')
          {
            skip++;
          }
          else
          {
             if(skip>0)
             {
                skip--;
             }
             else
             {
                res1+=c;
             }
          }
          i++;
       }
       int j=0;
       skip=0;
       while(j<m2.length())
       {
         char c=m2.charAt(j);
         if(c=='#')
         {
           skip++;
         }
         else
         {
           if(skip>0)
           {
            skip--;
           }
           else
           {
            res2+=c;
            
           }

         }
         j++;
       }
       return res1.equals(res2);
    }
}