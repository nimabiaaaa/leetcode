package Shuzu;

import sun.security.provider.MD2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Mr_liao
 * @create: 2022-06-26 15:27
 * @description: 搜索插入位置
 **/
public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        //去掉左右括号
        String s2 = s1.substring(1,s1.length()-1);
        String[] s3 = s2.split(",");

        int[] a1 = new int[s3.length];
        //得到整形数组
        for (int i = 0; i < s3.length; i++) {
            a1[i] = Integer.parseInt(s3[i]);
        }
        System.out.println(Arrays.toString(a1));

        int target = sc.nextInt();
        System.out.println(target);
        //调用算法
        int n = searchInsert(a1, target);

        System.out.println(n);
        sc.close();
    }

    /**
     * 最简单的思路
     *
     * 如果数组中的值大于或者等于target，直接return
     * 如果全部遍历完证明target是最大的数，直接插入末尾
     * @param nums
     * @param target
     * @return
     */
    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //如果数组中的值大于或者等于target，直接return
            if (target <= nums[i]){
                return i;
            }
        }
        //如果全部遍历完证明target是最大的数，直接插入末尾
        return nums.length;
    }

    /**
     * 二分查找：
     *
     * left=0，right=nums.length-1,取mid为中间值
     * 如果nums[mid]==target,返回mid值，循环终止
     * 如果nums[mid]>target,就说明从mid到right之间的值都是“无用的”需要挪动right，
     * 而我们能知道的接近的一个无用的值是mid，因此right必须比mid还要小才行，也即是right=mid-1；
     * 同理，left=mid+1；
     * 一直循环，除非找到mid值或者发现target根本不在目标中，
     * 也就是已经完全循环了一遍(left>right),这时候的left的值就是最接近target但又大于target的值（可以拿0来举例自己画一遍过程），
     * 因此return left
     *
     * @param nums
     * @param target
     * @return
     */
    static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int mid = 0;
        while(left <= right){
            mid = left+(right-left)/2;
            if (target == nums[mid]){
                return mid;
            }

            if (target > nums[mid]){
                left = mid+1;
            }

            if (target < nums[mid]){
                right = mid - 1;
            }
        }

        return left;
    }
}
