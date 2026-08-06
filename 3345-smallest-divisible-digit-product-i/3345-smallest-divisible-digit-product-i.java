class Solution {
    public int smallestNumber(int n, int t) {
        boolean f=false;
        while(true)
        {
            int num1=n;
            int num=1;
            while(num1>0)
            {
                num=num*(num1%10);
                num1/=10;
            }
            if(num%t==0)
            {
               return n;
            }
            n+=1;
            
        }
        
        
    }
}