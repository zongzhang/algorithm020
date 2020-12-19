import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两数之和 no.1
 *
 * @since 1.0
 */
public class TwoSum {
    //暴力枚举
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // 哈希表
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
