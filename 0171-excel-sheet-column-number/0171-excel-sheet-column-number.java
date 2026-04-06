class Solution {
    public int titleToNumber(String columnTitle) {
       int n=columnTitle.charAt(0)-'A'+1;
       int tot=n;
       for(int i=1;i<columnTitle.length();i++)
       {
         int b=columnTitle.charAt(i)-'A'+1;
         tot=tot*26+b;
       }
       return tot;
    }
}