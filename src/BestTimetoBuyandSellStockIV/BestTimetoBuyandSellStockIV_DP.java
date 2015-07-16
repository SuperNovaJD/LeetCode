package BestTimetoBuyandSellStockIV;

public class BestTimetoBuyandSellStockIV_DP {
	public int maxProfit(int k, int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int n = prices.length;
        int result = 0;
        if(k > n/2){
            for(int i = 1; i < n; i++){
                if(prices[i] > prices[i-1]){
                    result = result + prices[i] - prices[i-1];
                }
            }
            return result;
        }
        int[] hold = new int[k+1];
        int[] rele = new int[k+1];
        for(int i = 0; i <= k; i++){
            hold[i] = Integer.MIN_VALUE;
            rele[i] = 0;
        }
        int cur;
        for(int i = 0; i < n; ++i){
            cur = prices[i];
            for(int j = k; j > 0; --j){
                
                rele[j] = Math.max(rele[j],hold[j]+cur);
                hold[j] = Math.max(hold[j],rele[j-1]-cur);
            }
        }
        return rele[k];
   }
}
