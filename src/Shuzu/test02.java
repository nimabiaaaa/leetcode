package Shuzu;

import java.util.Scanner;

/**
 * @author: Mr_liao
 * @create: 2022-06-26 14:25
 * @description: 寻找数组的中心索引
 **/
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] s1 = s.split(" ");

        int[] a1 = new int[s1.length];

        for (int i = 0; i < s1.length; i++) {
            a1[i] = Integer.parseInt(s1[i]);
        }

        int n = pivotIndex2(a1);
        System.out.println(n);
    }

    /**
     * 依靠等量关系解题。
     * 中心元素要保证两边元素之和相等。
     * 不妨先求总和Sum。
     * 之后新建一个变量leftSum用以存储随遍历不断增大的左侧总和。
     * 进行数组遍历 leftSum==(sum-leftSum-nums[i]) 满足该条件直接返回i。
     * 具有普适性 不需要考虑边界。
     * @param nums
     * @return
     */
    static int pivotIndex(int[] nums){
        //总和
        int sum = 0;
        //用以存储随遍历不断增大的数组左侧总和
        int leftSum = 0;

        //求总和
        for (int i:nums){
            sum += i;
        }

        //找中心
        for (int i = 0; i < nums.length; i++) {
            //右侧和为leftSum时 == 总和 - 左侧和
            //leftSum = nums[0] + nums[1} + ...
            if (leftSum == (sum - leftSum - nums[i]))
                return i;
            leftSum += nums[i];
        }
        return -1;
    }

    static int pivotIndex2(int[] nums){
        int sum = 0;
        int leftSum = 0;

        for (int su:nums){
            sum += su;
        }

        for (int i = 0; i < nums.length; i++) {
            //右边为leftSum == 左边
            if (leftSum == (sum - leftSum - nums[i])){
                return i;
            }

            leftSum += nums[i];
        }


        return -1;
    }
}
