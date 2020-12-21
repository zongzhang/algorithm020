/**
 * 最长公共子序列 no 1143
 *
 * @since 1.0
 */
public class LongestCommonSubsequence {
    // 暴力
    // 动态规划
    // 升维 一维变二维  关键：不改变字符的相对顺序
    // 从最后字符开始看起，
    // S1 = "........A"
    // S2 = "........A"
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; ++i) {
            for (int j = 1; j < n + 1; ++j) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
