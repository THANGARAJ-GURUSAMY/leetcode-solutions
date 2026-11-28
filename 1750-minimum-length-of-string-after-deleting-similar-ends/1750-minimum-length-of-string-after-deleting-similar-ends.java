class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j)
        {
            char c1=a[i];
            char c2=a[j];
            if(c1==c2)
            {
                while(i<=j)
                {
                    if(c1==s.charAt(i))
                    {
                        i++;
                    }
                    else
                    {
                        break;
                    }

                }
                while(j>=i)
                {
                    if(c2==s.charAt(j))
                    {
                        j--;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else
            {
                break;
            }


        }
        return j-i+1;
    }
}