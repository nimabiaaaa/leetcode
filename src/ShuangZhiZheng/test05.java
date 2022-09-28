package ShuangZhiZheng;

/**
 * @author: Mr_liao
 * @create: 2022-07-11 23:26
 * @description: 最大连续1的个数
 **/
public class test05 {
    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int slow = 0;
        //计数器
        int n = 0;
        //结果值
        int ans = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 1){
                //遇到不为1的数，重新计数
                slow = fast;
                n = 0;
                continue;
            }
            //遇到1，则计数器加1
            n++;
            //将当前连续1的最大连续数量，实时保存在ans中，
            ans = ans > n ? ans:n;
        }
        return ans;
    }
}
