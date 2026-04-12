class Solution {
    public int[] finalPrices(int[] prices) {
        int[] a=new int[prices.length];
        
        for(int i=0;i<prices.length;i++)
        {
            int d=0;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    d=prices[j];
                    break;
                }
            }
            a[i]=prices[i]-d;
        }
        return a;
    }
}