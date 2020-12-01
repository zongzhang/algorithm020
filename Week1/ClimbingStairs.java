import java.util.HashMap;
import java.util.Map;

/**
 * @since 1.0
 */
public class ClimbingStairs {

    Map<Integer, Integer> map = new HashMap<>();

    //傻递归 + 缓存
    public int climbStairs(int n) {
        return climb(n);
    }


    public int climb(int n) {
        if (map.get(n) != null) {
            return map.get(n);
        }
        if (n <= 1) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        int res = climb(n - 1) + climb(n - 2);
        map.put(n, res);
        return res;
    }


}
