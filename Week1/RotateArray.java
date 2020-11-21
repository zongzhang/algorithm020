import java.util.Arrays;

/**
 * @since 1.0
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nuws = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nuws, k);
        System.out.println(Arrays.toString(nuws));
    }


    //顺序思路
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            //取出最后一个数字
            int n = nums[nums.length - 1];
            //数组整体移动一位
            moveArray(nums);
            //将n放在开头
            nums[0] = n;
        }
    }

    public void moveArray(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
    }


}
