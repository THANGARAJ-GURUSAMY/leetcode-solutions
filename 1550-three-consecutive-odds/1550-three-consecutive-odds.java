class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]%2!=0)
            {
                c++;
            }
            else if(arr[i]%2==0&&c>=1&&c<3)
            { 
                c=0;
            }
            if(c==3)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}