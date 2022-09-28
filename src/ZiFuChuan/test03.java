package ZiFuChuan;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: Mr_liao
 * @create: 2022-07-07 22:45
 * @description: 翻转字符串里的单词
 **/
public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String s1 = reverseWords2(s);
        System.out.println(s1);
        sc.close();
    }

    /**
     * // 方法一;思路：数组的翻转
     *     // 时间复杂度;O（n）
     *     // 空间复杂度：O（）
     * @param s
     * @return
     */
    static String reverseWords(String s) {
        //转化为字符串数组，
        //需要注意的是，数组中可能存在空字符串的可能
        String[] s1 = s.split(" ");
        StringBuffer str = new StringBuffer();

        int len = s1.length;

        while (len-- > 0){
            //从左往右遍历数组，
            // 当数组元素不为空的时候，考虑插入StringBuffer中
            if (!s1[len].isEmpty()){
                //当StringBuffer中有元素的时候，
                // 根据题意，需要将不同字符串用空格分隔开，因此先插入一个空格
                if (str.length() > 0){
                    str.append(" ");
                }
                //将数组元素插入StringBuffer
                str.append(s1[len]);
            }
        }
        return str.toString();
    }

    static String A(String s) {
        String[] array = s.split(" ");

        int len = array.length;

        StringBuffer sb = new StringBuffer();
        //从右往左遍历数组
        while (len > 0){
            len--;
            //System.out.println(len);
            if (!array[len].isEmpty()){
                if (sb.length() > 0){
                    sb.append(" ");
                }

                sb.append(array[len]);
            }
        }

        return sb.toString();
    }

    /**
     * 方法五：栈
     * @param s
     * @return
     */
    static String reverseWords2(String s) {
        Stack<String> stack = new Stack<>();
        //只去除左右两边的空格，不能保证字符串之间只有一个空格的情况
        //String s1 = s.trim();

        String[] array = s.split(" ");

        for (String ar:array){
            if (ar.isEmpty()){
                continue;
            }
            stack.push(ar);
        }

        StringBuffer sb = new StringBuffer();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
            //弹出一个元素后还不为空
            if (!stack.isEmpty()){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
