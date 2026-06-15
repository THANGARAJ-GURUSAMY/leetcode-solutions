class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        for(char c:number.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sb.append(c);
            }
        }
        int n=sb.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(n-i>4)
        {
            ans.append(sb.substring(i,i+3)).append("-");
            i+=3;
        }
        if(n-i==4)
        {
            ans.append(sb.substring(i,i+2)).append("-").append(sb.substring(i+2,i+4));
        }
        else
        {
            ans.append(sb.substring(i));
        }
        return ans.toString();
    }
}