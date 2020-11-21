import java.util.Arrays;

/**
 * @since 1.0
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nuws = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate2(nuws, k);
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

    private void moveArray(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
    }


    //三次翻转
    public void rotate2(int[] nums, int k) {
        //解决步长问题
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
