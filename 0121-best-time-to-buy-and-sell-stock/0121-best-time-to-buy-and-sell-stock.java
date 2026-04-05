class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int price:prices)
        {
            if(price<min_price)
            {
                min_price=price;
            }
            else
            {
                int profit=price-min_price;
                max_profit=Math.max(profit,max_profit);
            }

        }
        return max_profit;
        
    }
}