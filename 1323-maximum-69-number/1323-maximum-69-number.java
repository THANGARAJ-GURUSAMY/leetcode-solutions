class Solution {
    public int maximum69Number (int num) {
        int k=0;
        int max=num;
        while(k<num)
        {
            String res=String.valueOf(num);
            String res1="";
            for(int i=0;i<res.length();i++)
            {
                if(i==k)
                {
                    if(res.charAt(i)=='9')
                    {
                       res1+='6';
                    }
                    else if(res.charAt(i)=='6')
                    {
                        res1+='9';
                    }
                }
                else
                {
                    res1+=res.charAt(i);
                }
            }
            int num1=Integer.parseInt(res1);
            max=Math.max(max,num1);
            k++;
        }
        return max;
    }
}