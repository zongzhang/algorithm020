/**
 * 不同路径 no 62
 *
 * @since 1.0
 */
public class UniquePaths {
    /**
     * 转移方程 f(i,j) = f(i-1,j) + f(i,j-1)
     * 初始条件 f(0,0) = 1;
     */
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int i = 0; i < n; ++i) {
            f[0][i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}
