package Shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-06-26 17:37
 * @description: 合并区间
 **/
public class test04 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(intervals));
        int[][] merge = merge(intervals);
        //使用Arrays.deepToString() ----- 打印数组中的所有数值
        System.out.println(Arrays.deepToString(merge));
        /*for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge[0].length; j++) {
                System.out.printf("%5d",merge[i][j]);
                System.out.println();
            }
        }*/
    }

    static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        //1、对二维数组按照第一列升序排序
        System.out.println("排序前的结果是：---");
        System.out.println(Arrays.deepToString(intervals));
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println("排序后的结果是：---");
        System.out.println(Arrays.deepToString(intervals));
        //2、进行合并数组
        List<int []> list = new ArrayList<>();
        int term[] =intervals[0];//临时空间，1 判断是否需要合并集合，2 是否放入结果集
        System.out.println("term:----");
        System.out.println(Arrays.toString(term));
        System.out.println();
        for (int i = 1; i < intervals.length; i++) {
            if (term[1]>=intervals[i][0]){
                term[1]=Math.max(term[1],intervals[i][1]);
            }else {
                list.add(term);
                term=intervals[i];
            }
        }
        list.add(term);
        return list.toArray(new int[list.size()][2]);
    }


    static int[][] merge2(int[][] intervals) {
        if (intervals.length == 0) return intervals;

        //先排序，升序
        Arrays.sort(intervals,(a,b) -> {
            return a[0] - b[0];
        });
        //定义临时数组，用于存储当前比较数组
        int[] term = intervals[0];

        List<int []> list= new ArrayList<>();
        //按行遍历二维数组
        for (int i = 1; i < intervals.length; i++) {
            //当临时数组中的右区间大于等于当前行的左区间时候，说明有重叠区域
            if (term[1] >= intervals[i][0]){
                //此时将临时数组中的右区间进行替换，替换成两者之间的大者
                term[1] = Math.max(term[1],intervals[i][1]);
            }else {
                //如果临时数组的右区间小于当前行的左区间，说明没有重叠区域，此时不需要重新更改临时数组的右区间，
                // 直接将当前临时数组的值存入list，同时将临时数组的值重新定义为当前行的值
                list.add(term);
                term=intervals[i];
            }
        }
        //跳出循环的时候，数组最后一组元素还没有添加进list
        list.add(term);
        return list.toArray(new int[list.size()][2]);
    }
}
