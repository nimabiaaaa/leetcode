package Stacks.DFS.findTargetSumWaysCode;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 15:39
 * @description: 目标和
 **/
public class Solution {
    int count = 0;
    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums,target,0,0);
        return count;
    }

    private void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length){
            //遍历到头
            if (sum == target){
                count++;
            }
        }else {
            backtrack(nums,target,index + 1,sum + nums[index]);
            backtrack(nums,target,index - 1,sum - nums[index]);
        }
    }
}
