package ShuangZhiZheng;

/**
 * @author: Mr_liao
 * @create: 2022-07-11 23:19
 * @description: 移除元素
 **/
public class test04 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        //定义一个慢指针
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == val){
                continue;
            }

            nums[slow++] = nums[fast];
        }

        return slow;
    }
}
