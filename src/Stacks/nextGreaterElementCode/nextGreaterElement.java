package Stacks.nextGreaterElementCode;

import java.util.*;

/**
 * @author: Mr_liao
 * @create: 2022-10-24 11:34
 * @description:
 **/
public class nextGreaterElement {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //1 先处理nums2数组,K-V分别为，元素值和其右边第一个比他大的元素
        Map<Integer,Integer> map = new HashMap<>();
        //构建单调栈，栈顶到栈底为单调递增
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = nums2.length - 1; i >=0 ; --i) {
            int num = nums2[i];
            //遍历栈，弹出栈中所有比当前元素小的元素
            while (!deque.isEmpty() && num >= deque.peek()){
                deque.pop();
            }
            //存储当前元素和它右边第一个比他大的元素，如果栈为空，说明该元素右边没有比他大的元素
            map.put(nums2[i],deque.isEmpty() ? -1:deque.peek());
            deque.push(num);
        }

        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }



}
