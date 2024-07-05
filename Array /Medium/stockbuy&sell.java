class Solution 
{
    public int maxProfit(int[] prices)
    {
        int mini= Integer.MAX_VALUE;
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<mini){
                mini= prices[i];
            }
            else if(prices[i]- mini > maxi){
                maxi = prices[i]- mini;
            }
        }
        if (maxi == Integer.MIN_VALUE) return 0;

        return maxi;

        
    }
}
