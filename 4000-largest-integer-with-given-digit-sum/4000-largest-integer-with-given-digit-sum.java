class Solution {
    public int largestInteger(int n, int s) {
        if(s==0)
        {
            return 0;
        }
        int i=1;
        int max=-1;
        while(true)
        {
            String m=String.valueOf(i);
            if(m.length()>n)
            {
                break;
            }
            int sum=0;
            int temp=i;
            while(temp>0)
            {
                sum+=temp%10;
                temp/=10;
            }
            if(sum==s)
            {
                max=Math.max(max,i);
            }
            i++;
        }
        return max;
    }
}