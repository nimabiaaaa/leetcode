package Shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-07-12 23:56
 * @description: 杨辉三角 II
 **/
public class test06 {
    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[rowIndex + 1];
        for (int i = 0; i < rowIndex+1; i++) {
            //list.add(1);
            ans[i] = 1;
        }
        if (rowIndex < 2){
            for (Integer nn:ans){
                list.add(nn);
            }
            return list;
        }

        //迭代次数
        for (int i = 1; i < rowIndex; i++) {
            // 每次迭代进行的计算,从后往前
            for (int j = i; j > 0; j--) {
                ans[j] = ans[j] + ans[j - 1];
            }
        }

        for (Integer nn:ans){
            list.add(nn);
        }
        return list;
    }

    public List<Integer> A(int rowIndex){
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            //第i行，有i+1个数
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    list.add(1);
                }else{
                    list.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
                }
            }

            lists.add(list);
        }

        return lists.get(rowIndex);
    }
}
