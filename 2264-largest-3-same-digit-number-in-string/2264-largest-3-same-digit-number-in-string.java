class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        for(int i=0;i<=num.length()-3;i++)
        {
            String m=num.substring(i,i+3);
            if(m.charAt(0)==m.charAt(1)&&m.charAt(1)==m.charAt(2))
            {
                if(max.equals("")||m.compareTo(max)>0)
                {
                    max=m;
                }
            }
        }
        return max;
    }
}