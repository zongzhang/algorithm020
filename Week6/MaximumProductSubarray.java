/**
 * @since 1.0
 */
public class MaximumProductSubarray {

    //状态转移方程 max(dp[i-1]*nums[i] , nums[i])
    // 考虑负数情况，最小变最大 min(dp[i-1]*nums[i] , nums[i])
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}
