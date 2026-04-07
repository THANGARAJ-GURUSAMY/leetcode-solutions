class Solution {
    
    public String reverseWords(String s) {
        String[] a=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i].length()>0)
            {   
                sb.append(a[i]);
                if(i>0)
                {
                    sb.append(" ");
                }
            }

        }
        return sb.toString().trim();
    }
}