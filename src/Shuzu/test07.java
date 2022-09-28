package Shuzu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-07-13 23:17
 * @description: 反转字符串中的单词 III
 **/
public class test07 {
    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(s);
        String s1 = reverseWords(s);
        System.out.println(s1);
        /*System.out.println(s);
        char[] c = s.toCharArray();
        for (char c1:c){
            System.out.print(c1);
        }
        System.out.println();
        String s1 = Arrays.toString(c);
        System.out.println(s1);
        String s2 = new String(c);
        System.out.println(s2);*/
    }

    static String reverseWords(String s) {
        if (s == null || s.length() == 0){
            return null;
        }
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        List<char[]> list = new ArrayList<>();

        for (String str:strs){
            char[] c1 = str.toCharArray();
            int left = 0;
            //int right = str.length() - 1;
            int right = c1.length - 1;
            while (left < right){
                char temp = c1[left];
                c1[left] = c1[right];
                c1[right] = temp;
                left++;
                right--;
            }
            list.add(c1);
        }
        for (int i = 0; i < list.size(); i++) {
            String s2 = new String(list.get(i));
            if (i == list.size() - 1){
                sb.append(s2);
                break;
            }
            sb.append(s2);
            sb.append(" ");
        }
        return new String(sb);
    }
}
