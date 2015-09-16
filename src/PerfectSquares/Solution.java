package PerfectSquares;

public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = (int)Math.sqrt(i); j >= 1; j--){
                if(j * j == i){
                    dp[i] = 1;
                    break;
                }else{
                    dp[i] = Math.min(dp[i],dp[j*j] + dp[i - j*j]);
                }
            }
        }
        return dp[n];
    }
}
