class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            int num=c-'a'+1;
            sb.append(num);
        }
        String str=sb.toString();
        while(k-- >0)
        {
            int sum=0;
            for(char c:str.toCharArray())
            {
                sum+=c-'0';
            }
            str=String.valueOf(sum);
        }
        return Integer.parseInt(str);
    }
}