package Shuzu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-07-12 07:46
 * @description: 杨辉三角
 **/
public class test05 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> res = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                //当当前行的第一个数和最后一个数，
                // 根据其等于第i - 1行的第j-1个数 + 第j个数的和，
                // 可知第一个数的上一行的没有第j-1个数
                // 可知最后一个数的上一行的没有第j个数
                if (j == 0 || j == i){
                    res.add(1);
                }else {
                    res.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
                }

            }
            ret.add(res);
        }
        return ret;
    }
}
