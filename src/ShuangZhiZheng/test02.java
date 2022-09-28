package ShuangZhiZheng;

import java.util.Arrays;

/**
 * @author: Mr_liao
 * @create: 2022-07-11 22:53
 * @description: 数组拆分1
 **/
public class test02 {
    public static void main(String[] args) {

    }

    /**
     * 1.快速排序
     * 2.奇数位置上相加就是所求的
     * 贪心算法:
     * 1.数组最小值肯定保留，那么为了不浪费别的数，就给比最小值大一点数。
     * 2.去掉这两个后，剩下的肯定还有最小值，同理得排完序后奇数位置的和就是所求
     *
     * 作者：i＋＋
     * 链接：https://leetcode.cn/leetbook/read/array-and-string/c24he/?discussion=vR7Z20
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        //数组下标索引
        int index = 0;
        //拆分后的数组min之和
        int sum = 0;
        //排序后，两两组合，即为min之和最大
        while (index < nums.length){
            //排序后的数组奇数位置上的元素之和，就为最大min之和
            sum +=nums[index];
            index +=2;
        }
        return sum;
    }
}
