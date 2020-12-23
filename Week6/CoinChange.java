/**
 * @since 1.0
 */
public class CoinChange {

    // f[x]=min{f[x-1]+1,f[x-2]+1,f[x-5]+1}
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i <= amount; ++i) {
            dp[i] = Integer.MAX_VALUE;

            for (int coin : coins) {
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
