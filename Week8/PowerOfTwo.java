/**
 * @since 1.0
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        return ((long) n & (-(long) n)) == (long) n;
    }
}
