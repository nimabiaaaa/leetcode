package ShuangZhiZheng;

/**
 * @author: Mr_liao
 * @create: 2022-07-17 23:24
 * @description: 删除排序数组中的重复项
 **/
public class test07 {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2){
            return nums.length;
        }

        int slow = 0;
        //int fast = 1;
        for (int fast = 0; fast < nums.length; fast++) {
            //当慢指针指向的数据不等于快指针的数据时候，
            // 慢指针向右移动，同时将快指针的数据赋值给慢指针移动后的位置
            if (nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
