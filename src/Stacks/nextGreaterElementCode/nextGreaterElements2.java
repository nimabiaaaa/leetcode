package Stacks.nextGreaterElementCode;

import java.util.*;

/**
 * @author: Mr_liao
 * @create: 2022-10-25 11:34
 * @description: 下一个更大元素 II
 **/
public class nextGreaterElements2 {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;

        int[] res = new int[size];
        Arrays.fill(res,-1);

        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < size * 2; i++) {
            while (!stack.isEmpty() && nums[i%size] > nums[stack.peek()]){
                res[stack.pop()] = nums[i%size];
            }

            stack.push(i % size);
        }

        return res;
    }


}
