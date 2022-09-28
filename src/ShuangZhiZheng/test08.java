package ShuangZhiZheng;

import java.util.Arrays;

/**
 * @author: Mr_liao
 * @create: 2022-07-17 23:33
 * @description: 移动零
 **/
public class test08 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    //自己的垃圾解法
    static void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
                slow++;
            } else if (nums[slow] == 0 && nums[fast] == 0) {
                continue;
            } else {
                slow++;
            }
        }
    }

    //扣友的解法
    static void moveZeroes2(int[] nums) {
        if (nums.length < 1) {
            return;
        }

        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                r++;
            } else {
                nums[l++] = nums[r++];
            }
        }

        for(;l<nums.length;l++)

        {
            nums[l] = 0;
        }
    }

}
