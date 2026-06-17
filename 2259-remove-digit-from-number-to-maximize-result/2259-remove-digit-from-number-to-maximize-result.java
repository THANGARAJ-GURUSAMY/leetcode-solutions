class Solution {
    public String removeDigit(String number, char digit) {
        String max="";
        for(int i=0;i<number.length();i++)
        {
            
            if(number.charAt(i)==digit)
            {
                String m=number.substring(0,i)+number.substring(i+1);
                if(m.equals("")||m.compareTo(max)>0)
                {
                    max=m;
                }
            }
           
        }
        return max;
    }
}