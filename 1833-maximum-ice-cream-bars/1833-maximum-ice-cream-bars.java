class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int tot=0;
        int c=0;
        for(int i=0;i<costs.length;i++)
        {
            if(tot+costs[i]<=coins)
            {
            tot+=costs[i];
            c++;
            }
        }
        if(c==0)
        {
            return 0;
        }
        return c;

    }
}