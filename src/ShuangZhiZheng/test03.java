package ShuangZhiZheng;

/**
 * @author: Mr_liao
 * @create: 2022-07-11 23:03
 * @description: 两数之和 II - 输入有序数组
 **/
public class test03 {
    public static void main(String[] args) {

    }

    /**
     * 基本思路:
     * 由于数组从小到大排列, 双指针分别指向首部和尾部;
     *
     * 首部尾部相加等于目标值，返回结果集
     * 首部尾部相加小于目标值，首部后移变大
     * 首部尾部相加大于目标值，尾部前移变小
     *
     * 作者：白鲨码农
     * 链接：https://leetcode.cn/leetbook/read/array-and-string/cnkjg/?discussion=ZusNIO
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[]{-1,-1};
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        while (left < right){
            //sum = numbers[left] + numbers[right];
            if (numbers[left] + numbers[right] == target){
                res[0] = left+1;
                res[1] = right + 1;
                break;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            }else {
                right--;
            }
        }

        return res;
    }
}
