class Solution {
    public String removeTrailingZeros(String num) {
         int pos=-1;
         for(int i=num.length()-1;i>=0;i--)
         {
            if(num.charAt(i)!='0')
            {
                pos=i;
                break;
            }
         }
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<=pos;i++)
         {
            sb.append(num.charAt(i));
         }
         return sb.toString();
    }
}