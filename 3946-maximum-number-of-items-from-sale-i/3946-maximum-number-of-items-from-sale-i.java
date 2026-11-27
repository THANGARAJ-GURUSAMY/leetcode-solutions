class Solution {
   
    public int maximumSaleItems(int[][] items, int budget) {
        int[] dp = new int[budget + 1];

      
        int minPrice = Integer.MAX_VALUE;

    
        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

  
            minPrice = Math.min(minPrice, price);

            int count = 0;
            for (int[] otherItem : items) {
                if (otherItem[0] % factor == 0) {
                    count++;
                }
            }

   
            for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j], dp[j - price] + count);
            }
        }

   
        int answer = 0;
        for (int i = 0; i <= budget; i++) {
            answer = Math.max(answer, dp[i] + (budget - i) / minPrice);
        }

        return answer;
    }
}
