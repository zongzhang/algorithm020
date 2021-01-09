/**
 * @since 1.0
 */
public class NumberOf1Bits {

    //1 简单循环
    // 2
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
