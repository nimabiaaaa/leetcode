package Stacks.sumSubarrayMinsCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: Mr_liao
 * @create: 2022-10-26 16:29
 * @description: 907. 子数组的最小值之和
 * 题解来自：https://leetcode.cn/problems/sum-of-subarray-minimums/solution/xiao-bai-lang-dong-hua-xiang-jie-bao-zhe-489q/
 **/
public class Solution {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {

    }

    public int sumSubarrayMins(int[] arr){
        int size = arr.length;
        //处理边界情况
        if (arr == null || size == 0){
            return 0;
        }
        int[] left = new int[size];
        int[] right = new int[size];

        Deque<Integer> stack = new LinkedList<>();

        //1 找到所有元素的左边界
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        //2 找到所有元素的又边界
        stack.clear();
        for (int i = size - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                right[i] = size;
            }else{
                right[i] = stack.peek();
            }

            stack.push(i);
        }

        //3 计算贡献值
        long ans = 0;
        for (int i = 0; i < size; i++) {
            ans = (ans + (long)(i - left[i]) * (right[i] - i) * arr[i]) % MOD;
        }

        return (int) ans;
    }
}
