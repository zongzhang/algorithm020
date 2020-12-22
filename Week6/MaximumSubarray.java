/**
 * 最大子序和 no 53
 *
 * @since 1.0
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] A = {-2, -3, -1, -5};
        System.out.println(new MaximumSubarray().maxSubArray(A));
    }

    //f(2)= max(f(2),f(1));
    //dp[i]=max{nums[i],dp[i−1]+nums[i]}
    public int maxSubArray(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = A[i] + Math.max(dp[i - 1], 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
