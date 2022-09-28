package ShuangZhiZheng;

import java.util.PriorityQueue;

/**
 * @author: Mr_liao
 * @create: 2022-07-11 23:56
 * @description: 长度最小的子数组
 **/
public class test06 {
    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {
        /*if (nums.length == 0){
            return 0;
        }
        int slow = 0;
        int fast=0;
        //计数器
        int n = 0;
        //长度记录
        int ans = 0;
        int sum = 0;
        while (slow < nums.length && fast < nums.length){
            fast = slow;
            sum = sum + nums[fast];
            if (sum < target){
                n++;
                fast++;

                continue;
            }

            n = n + 1;
            //取更小的值
            ans = ans > n ? n:ans;
            sum = 0;
            slow++;
            n = 0;
        }
        return ans;*/

        /*int pre = 0;
        int post = 0;
        PriorityQueue<Integer> result = new PriorityQueue<>();
        int sum = nums[0];
        while(pre < nums.length){
            //当滑动窗的整体和大于等于目标值，则窗口左侧继续缩放
            if(sum>=target){
                //满足条件的滑动窗的长度，存进优先队列
                result.add(pre-post+1);
                //滑动窗向右移，需要减掉滑动窗左侧一个元素的值
                sum -= nums[post++];
            }
            //当滑动窗的整体和小于目标值，则窗口右侧继续扩大
            else if(sum<target){
                //滑动窗的右侧向右移
                pre++;
                if(pre < nums.length){
                    sum += nums[pre];
                }else{
                    break;
                }
            }
        }
        return result.isEmpty() ? 0 : result.poll();*/

        // 滑动窗口
        int left = 0, right = 0, sum = 0;
        int min = Integer.MAX_VALUE;
        while(right < nums.length){
            sum += nums[right];
            while(sum >= target){
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public int A(int target,int[] nums){
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (fast < nums.length){
            sum += nums[fast];
            while (sum >= target){
                min = Math.min(min,fast - slow + 1);
                //滑动窗口左侧向右收缩
                sum -= nums[slow];
                slow++;
            }
            //不满足条件,窗口右侧扩张
            fast++;
        }
        return min == Integer.MAX_VALUE ? 0:min;
    }


}
