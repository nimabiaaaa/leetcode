package Shuzu;

/**
 * @author: Mr_liao
 * @create: 2022-07-14 06:57
 * @description: 寻找旋转排序数组中的最小值
 **/
public class test08 {
    public static void main(String[] args) {
        int[] nums = new int[]{11,13,15,17};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        if (nums.length < 2){
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        int min = 0;
        while (left <= right){
            if (nums[left] <= nums[right]){
                //min = Math.min(min,nums[left]);
                min = nums[left];
                break;
            }else {
                left++;
            }
        }

        return min;
    }
}
