/**
 * 爬楼梯 动态规划版本
 *
 * @since 1.0
 */
public class ClimbingStairsDP {

    public static void main(String[] args) {
        ClimbingStairsDP d = new ClimbingStairsDP();
        System.out.println(d.climb(4));

    }

    // 转移方程 dp[i] = dp[i-1] + dp[i-2]
    // 动态规划思想-->斐波拉契数列---->迭代实现
    public int climb(int n) {
        int a = 1, b = 1;
        while (n-- > 0) {
            b = a + b;
            a = b - a;
        }
        return a;
    }


    //public int climb(int n) {
    //    int p, q = 0;
    //    int r = 1;
    //    for (int i = 1; i <= n; i++) {
    //        p = q;
    //        q = r;
    //        r = p + q;
    //    }
    //    return r;
    //}

}
